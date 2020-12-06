package lesson1.part2;

public abstract class Animal {

    protected String name;

    public static int count = 0;

    public Animal(String name) {
        count++;
        this.name = name;
    }

    public static void testStatic() {
        Cat cat = new Cat();
        cat.name = "";
    }


    public Animal() {
        name = "default name";
    }

    public void animalInfo() {
        System.out.println("Animal name is " + name);
    }

    public void jump() {
        System.out.println("Animal jumped");
    }

    public String getName() {
        return name;
    }

    public abstract void voice();

}
