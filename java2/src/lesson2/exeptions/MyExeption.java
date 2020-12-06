package lesson2.exeptions;

public class MyExeption extends ArithmeticException {

    public MyExeption(int index) {
        super("Капитан, мы тонем. Ошибка на индексе массива " + index );
    }

    @Override
    public void printStackTrace() {
        System.out.println("ОШИБКА!");
    }
}
