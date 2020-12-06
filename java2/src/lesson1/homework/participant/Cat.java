package lesson1.homework.participant;

public class Cat implements Participant {

    private final String name;
    private final int jumpHeight;
    private final int maxRunLength;

    public Cat(String name, int jumpHeight, int maxRunLength) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.maxRunLength = maxRunLength;
    }

    @Override
    public int run() {
        System.out.printf("Кот %s бежит дистанцию %d%n", name, maxRunLength);
        return maxRunLength;
    }

    @Override
    public int jump() {
        System.out.printf("Кот %s делает прыжок %d%n", name, jumpHeight);
        return jumpHeight;
    }

//    @Override
//    public boolean doIt(Obstacle obstacle) {
//        if (obstacle instanceof Track) {
//            return run() > obstacle.getAttribute();
//        }
//        else if (obstacle instanceof Wall) {
//            return jump() > obstacle.getAttribute();
//        }
//        return false;
//    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", jumpHeight=" + jumpHeight +
                ", maxRunLength=" + maxRunLength +
                '}';
    }
}
