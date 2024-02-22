package de.lubowiecki.libs;



import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.encryption.AccessPermission;
import org.apache.pdfbox.pdmodel.encryption.StandardProtectionPolicy;
import org.apache.pdfbox.pdmodel.font.PDType0Font;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.font.Standard14Fonts;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PdfTest {

    public static void main(String[] args) {

        PDDocument doc = new PDDocument();
        PDPage page = new PDPage();
        doc.addPage(page);

        try {
            PDPageContentStream stream = new PDPageContentStream(doc, page);

            // Text
            PDType0Font font = PDType0Font.load(doc, new File("fonts/OpenSans-Regular.ttf"));
            stream.setFont(font, 12);
            stream.beginText();
            stream.newLineAtOffset(20, 200);
            stream.showText("Das ist das Haus von Nikigraus");
            //stream.newLine();
            //stream.showText("Das ist das Haus von Nikigraus");
            stream.endText();

            // Bild
            Path path = Paths.get("qrcode.jpg");
            PDImageXObject image = PDImageXObject.createFromFile(path.toString(), doc);
            stream.drawImage(image, 10, 400, 200, 200);
            stream.close();

            // Rechte
            AccessPermission access = new AccessPermission();
            access.setCanModify(false);
            access.setCanPrint(false);
            StandardProtectionPolicy policy = new StandardProtectionPolicy("geheim", "geheim123", access);
            doc.protect(policy);

            doc.save("pdfdoc.pdf");
            doc.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
