package lesson1.part2;

import lesson1.part3.Duck;
import lesson1.part3.Universal;
import lesson1.part3.Waterfowl;

import java.util.Arrays;

public class TestAnimal {


    public static void main(String[] args) {

     /*   Animal[] animals = {new Cat(), new Dog(), new Cat()};

        for (Animal animal : animals) {
            if (animal instanceof Cat) {
                Cat.class.cast(animal).getCatString();
            }
        }

//        Animal[] animals = {new Cat(), new Dog()};
        for(int i = 0; i < animals.length; i++){
            Animal animal = animals[i];
        }

        Cat[] arr = {new Cat(), new Cat()};

        for (Cat i : arr) {
            i.name = "123";
        }

        System.out.println(arr[1].name);*/

        Cat cat = new Cat();
        Dog dog = new Dog();
        Duck duck = new Duck("Дональд");


        int[] array = new int[7];

        test(array);
        int[] newArr = test(array.clone());

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(newArr));

//        testInterface(cat);
//        testInterface(dog);
//        testInterface(duck);


    }

    static int[] test(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i]++;
        }
        System.out.println("В методе: " + Arrays.toString(arr));
        return arr;
    }

    static void testInterface(Universal animal) {
        animal.swim();
        System.out.println("Удача!");
    }

    private static void infoAndJump(Animal animal) {
        animal.animalInfo();
        animal.jump();
        animal.voice();
        System.out.println();
    }
}
