package lesson2.exeptions;

public class Main {

    public static void main(String[] args) {
        throw new MyExeption(5);
//        System.out.println(foo());

    }

    private static int foo() {
        int a = 0;
        int b = 1000;
        int[] arr = {1,1,1,1,1,0};

        try {
            return b/0;
        } catch (ArithmeticException e) {
            System.out.println("Деление на 0");
//            return -1;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Вышли за пределы");
            e.printStackTrace();
        }
        catch (RuntimeException e) {
            e.printStackTrace();
        }
        finally {
            System.out.print("finally: ");

        }

        return 10;

    }

}
