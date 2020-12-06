package lesson1.homework.participant;

public class Robot implements Participant {

    private final String model;
    private final int jumpHeight;
    private final int maxRunLength;

    public Robot(String model, int jumpHeight, int maxRunLength) {
        this.model = model;
        this.jumpHeight = jumpHeight;
        this.maxRunLength = maxRunLength;
    }

    @Override
    public int run() {
        System.out.printf("Робот %s бежит дистанцию %d%n", model, maxRunLength);
        return maxRunLength;
    }

    @Override
    public int jump() {
        System.out.printf("Робот %s делает прыжок %d%n", model, jumpHeight);
        return jumpHeight;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "model='" + model + '\'' +
                ", jumpHeight=" + jumpHeight +
                ", maxRunLength=" + maxRunLength +
                '}';
    }
}
