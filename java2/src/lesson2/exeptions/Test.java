package lesson2.exeptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args)  {

        try {
            readFile("/123.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            e.printStackTrace();
        }


    }

    private static void readFile(String path) throws FileNotFoundException  {
        File file = new File(path);
        Scanner scanner = new Scanner(file);
    }

    private static void readFile2() {
        File file = new File("path");

        try(Scanner scanner = new Scanner(file)) {

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
