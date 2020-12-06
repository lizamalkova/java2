package lesson1.part1;

import java.util.Objects;

public class Document {

    public static final String DEFAULT_TITLE = "Unknown";

    private static int staticField = 5;

    public static void printMessage() {
        System.out.println(staticField);
    }

    private String title;
    String content;

    int count;

    public Document(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public Document(String content) {
        this(DEFAULT_TITLE, content);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Document{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", count=" + count +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Document document = (Document) o;
        return count == document.count &&
                Objects.equals(title, document.title) &&
                Objects.equals(content, document.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, content, count);
    }

    public static void main(String[] args) {
        Document doc1 = new Document("my title", "my content");
        Document doc2 = new Document("my title", "my content");

        System.out.println(doc1 == doc2);
        System.out.println(doc1.equals(doc2));
        Document.printMessage();
    }
}
