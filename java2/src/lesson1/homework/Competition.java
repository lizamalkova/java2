package lesson1.homework;


import lesson1.homework.obstacle.Obstacle;
import lesson1.homework.participant.Participant;

import java.util.LinkedList;
import java.util.List;

public class Competition {

    private Obstacle[] obstacles;
    private Participant[] participants;
    private final String competitionTitle;

    private List<Participant> lastWinners = new LinkedList<>();

    public Competition(String competitionTitle) {
        this.competitionTitle = competitionTitle;
    }


    public void setObstacles(Obstacle... obstacles) {
        this.obstacles = obstacles;
    }

    public void setParticipants(Participant... participants) {
        this.participants = participants;
    }

    public void startCompetition() {
        System.out.println("Начало соревнования " + competitionTitle);
        lastWinners.clear();

        for (Participant participant : participants) {
            boolean success = passAllObstacles(participant);
            if (!success) {
                System.out.println("Участник " + participant + " покинул испытание");
            } else {
                lastWinners.add(participant);
            }
        }
    }

    public List<Participant> getLastWinners() {
        return lastWinners;
    }

    private boolean passAllObstacles(Participant participant) {
        for (Obstacle obstacle : obstacles) {
            if ( !participant.doIt(obstacle) ) {
                return false;
            }
            System.out.println();
        }
        return true;
    }
}
