package lesson1.part3;

import lesson1.part2.Animal;

public class Duck extends Animal implements Universal {

    public static final int SWIM_LENGTH = 150;

    public Duck(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println("Кря!");
    }

    @Override
    public String toString() {
        return "Duck{}";
    }


    @Override
    public void swim() {

    }

    @Override
    public void loveMaster() {

    }
}
