package lesson1.homework;

import lesson1.homework.obstacle.Track;
import lesson1.homework.participant.Cat;
import lesson1.homework.obstacle.Wall;
import lesson1.homework.participant.Participant;
import lesson1.homework.participant.Person;
import lesson1.homework.participant.Robot;

import java.util.Random;

public class Homework1 {

    public static void main(String[] args) {
        System.out.println("Подготовительный этап...");
        Competition competition = createAndPrepareCompetition();

        System.out.println("Начинаем соревнование!");
        competition.startCompetition();

        System.out.println("Соревнование окончено! Победители:");
        for (Participant winner : competition.getLastWinners()) {
            System.out.println(winner);
        }
    }

    private static Competition createAndPrepareCompetition() {
        Participant person = new Person("Oleg", 50, 500);
        Participant cat = new Cat("Barsik", 200, 1500);
        Participant robot = new Robot("Altron", 150, 5000);

        Random random = new Random();

        Wall wall = new Wall(random.nextInt(200));
        Track track = new Track(random.nextInt(1500));

        Competition competition = new Competition("Infinity War");
        competition.setParticipants(person, cat, robot);
        competition.setObstacles(wall, track);
        return competition;
    }
}
