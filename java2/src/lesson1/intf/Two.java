package lesson1.intf;

public interface Two {
    default void action() {
        System.out.println("Two");
    }
}
