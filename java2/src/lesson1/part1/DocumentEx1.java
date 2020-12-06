package lesson1.part1;

public class DocumentEx1 {

    String title;
    String content;



    /* ---------------------------------- */
    public static void main(String[] args) {
        DocumentEx1 document = new DocumentEx1();
        document.title = "My First part1";
        document.content = "Content of my first part1";

        System.out.println(document.title);
        System.out.println(document.content);
    }
}


