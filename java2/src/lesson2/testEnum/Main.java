package lesson2.testEnum;

public class Main {

    public static void main(String[] args) {
        Calendar month = Calendar.DECEMBER;

//        System.out.println(Calendar.valueOf());
        System.out.println(Calendar.DECEMBER.getRussianWord());

        System.out.println(Calendar.DECEMBER.ordinal());

        int number = switch (month) {
            case OCTOBER -> 10;
            case SEPTEMBER -> 9;
            case NOVEMBER -> 11;
            case DECEMBER -> 12;
        };


        SqlCommand sqlCommand = SqlCommand.UPDATE;
        sqlCommand.action();
    }
}
