package lesson1.part2;
public class Dog extends Animal {

    private final String color = Color.BLACK.getRussianColor();
    private final String type = "";

    public Dog(String name, String color, String type) {
        super(name);
        this.name = "customName";

    }

    public Dog() {
    }

    @Override
    public void animalInfo() {
        System.out.println("Dog name is " + super.getName() + "; color - " + color + "; type - " + type);
    }

    @Override
    public void voice() {
        System.out.println("Гав!");
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

//    public static String getStaticValue() {
//        return "7";
//    }
}
