package lesson1.part1;

public class DocumentEx2 {

    private static final String DEFAULT_TITLE = "Unknown";

    String title;
    String content;

    public DocumentEx2(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public DocumentEx2(String content) {
//        this.content = content;
//        this.title = "Unknown";
        this(DEFAULT_TITLE, content);
    }

    void printInfo() {
        System.out.println(this.title + System.lineSeparator() + content);
    }




    /* ---------------------------------- */
    public static void main(String[] args) {
        DocumentEx2 document1 = new DocumentEx2("document1", "Content of document1");
        document1.printInfo();

        DocumentEx2 document2 = new DocumentEx2("Content of document2");
        document2.printInfo();
    }
}


