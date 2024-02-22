package de.lubowiecki.libs;

import com.google.zxing.*;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.oned.EAN13Writer;
import com.google.zxing.qrcode.QRCodeReader;
import com.google.zxing.qrcode.QRCodeWriter;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class BarcodeTest {

    public static void main(String[] args) {

        try {
            // Writer
            //ImageIO.write(generateBarcode("111111111110"), "jpg", new File("barcode.jpg"));
            //ImageIO.write(generateQRCode("Moin Moin"), "jpg", new File("qrcode.jpg"));

            // Reader
            //BufferedImage image = ImageIO.read(new File("qrcode.jpg"));
            BufferedImage image = ImageIO.read(new File("barcode.jpg"));
            //String text = readQRCode(image);
            String text = readCode(image);
            System.out.println(text);

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static BufferedImage generateBarcode(String value) throws Exception {
        EAN13Writer writer = new EAN13Writer();
        BitMatrix matrix = writer.encode(value, BarcodeFormat.EAN_13, 400, 150);
        return MatrixToImageWriter.toBufferedImage(matrix);
    }

    private static BufferedImage generateQRCode(String value) throws Exception {
        QRCodeWriter writer = new QRCodeWriter();
        BitMatrix matrix = writer.encode(value, BarcodeFormat.QR_CODE, 400, 400);
        return MatrixToImageWriter.toBufferedImage(matrix);
    }

    private static String readQRCode(BufferedImage image) throws Exception {
        LuminanceSource source = new BufferedImageLuminanceSource(image);
        BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
        Result result = new QRCodeReader().decode(bitmap);
        return result.getText();
    }

    private static String readCode(BufferedImage image) throws Exception {
        LuminanceSource source = new BufferedImageLuminanceSource(image);
        BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
        Result result = new MultiFormatReader().decode(bitmap);
        return result.getText();
    }
}
