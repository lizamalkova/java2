package lesson1.homework.obstacle;

import lesson1.homework.participant.Participant;

public class Track implements Obstacle {

    private final int length;

    public Track(int length) {
        this.length = length;
    }

    @Override
    public boolean passObstacleBy(Participant participant) {
        if (participant.run() > length) {
            System.out.println("Участник " + participant + " успешно пробежал дистанцию");
            return true;
        }
        else {
            System.out.println("Участник " + participant + " не смог пробежать дистанцию " + length);
            return false;
        }
    }
}
