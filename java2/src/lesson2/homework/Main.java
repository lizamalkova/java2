package lesson2.homework;

public class Main {
    private static String[][] strings = new String[4][5];

    public static void main(String[] args) {
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                strings[i][j] = String.valueOf(i * j);
            }
        }
        strings[2][3] = "Hello!";
        int sum = 0;

        try {
            sum = calculateSum(strings);
            System.out.println("Сумма все элементов: " + sum);
        } catch (MyArrayDataException | MyArraySizeException e) {
            e.printStackTrace();
        }
    }

    private static int calculateSum(String[][] strings) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                if (strings[i].length != 4 || strings.length != 4){
                    throw new MyArraySizeException("Размер массива не [4][4]");
                }

                try{
                    sum += Integer.parseInt(strings[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(j, i);
                }
            }
        }

        return sum;
    }

}