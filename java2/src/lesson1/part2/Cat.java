package lesson1.part2;

import java.util.Objects;

public class Cat extends Animal {

    enum colorCat {
        RED, BLUE, GREEN
    }

    private Color color = Color.RED;
    private CatAttribute catAttribute;
    private String catString = "123";

    public String getCatString() {
        return catString;
    }

    public static class CatAttribute {
        private String meal;
        private Color colorEyes;
        private int weight;
    }

    public Cat(String name, Color color, CatAttribute catAttribute) {
        super(name);
        this.color = color;
        this.catAttribute = catAttribute;
    }

    public Cat(String name) {
        super(name);

    }

    public Cat() {
        this(null);
    }

    public Color getColor() {
        return color;
    }

    @Override
    public void animalInfo() {
        super.animalInfo();
        System.out.println("Cat name is " + super.getName() + "; color - " + color);
    }

    @Override
    public void voice() {
        System.out.println("Мяу!");
//        count++;
    }

    public CatAttribute getCatAttribute() {
        return catAttribute;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return color == cat.color && Objects.equals(catAttribute, cat.catAttribute) && Objects.equals(catString, cat.catString);
    }


}
