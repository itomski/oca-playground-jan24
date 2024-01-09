package de.lubowiecki.playground;

public class GenericTest {

    public static void main(String[] args) {

        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.setContent("Moin");
        System.out.println(stringBox.getContent());
        System.out.println(stringBox); // toString wird verwendet

        //GenericBox<Integer> intBox = new GenericBox<Integer>();
        GenericBox<Integer> intBox = new GenericBox<>(); // seit Java 1.7
        intBox.setContent(123);
        System.out.println(intBox.getContent());
        System.out.println(intBox); // toString wird verwendet
    }

}

class GenericBox<T> { // T ist ein generischer Typ

    private T content;

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GenericBox{");
        sb.append("content='").append(content).append('\'');
        sb.append('}');
        return sb.toString();
    }
}