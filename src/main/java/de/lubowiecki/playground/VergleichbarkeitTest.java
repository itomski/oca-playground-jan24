package de.lubowiecki.playground;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VergleichbarkeitTest {

    public static void main(String[] args) {

        List<ContentBox> boxen = new ArrayList<>();
        boxen.add(new ContentBox("Schuhe", 3));
        boxen.add(new ContentBox("Tassen", 17));
        boxen.add(new ContentBox("Computer", 1));

        Collections.sort(boxen);
        System.out.println(boxen);

    }
}

class ContentBox implements Comparable<ContentBox> {

    private String content;
    private int nr;

    public ContentBox(String content, int nr) {
        this.content = content;
        this.nr = nr;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContentBox{");
        sb.append("content='").append(content).append('\'');
        sb.append(", nr=").append(nr);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(ContentBox other) {
        //return this.getNr() - other.getNr();
        return this.getContent().compareTo(other.getContent());
    }
}
