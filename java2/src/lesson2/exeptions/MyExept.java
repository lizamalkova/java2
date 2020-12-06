package lesson2.exeptions;

public class MyExept {

    public static void main(String[] args) {

       boolean a = false;
        try {
            if (!a) {
               throw new MyExeption(5);
            }
            System.out.println("Все хорошо!");
        }
        catch (MyExeption e) {
            throw  new MyExeption(5);
        }
    }
}
