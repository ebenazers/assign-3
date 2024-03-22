
/**
 * Write a description of class Team here.
 *
 * @author (Ebenazer and Arjun)
 * @version (a version number or a date)
 */
import java.util.*;

class Team {
    private String name;
    private List<String> players;
    private String coach;
    private float points;
    private int goalsScored;
    private int goalsConceded;

    // Constructor for Team class
    Team(String name , List<String> players , String coach) {
        this.name = name;
        this.players = players;
        this.coach = coach;
        this.goalsConceded = 0;
        this.goalsScored = 0;
    }
    public String getName() {
        return name;
    }

    public List<String> getPlayers() {
        return players;
    }

    public String getCoach() {
        return coach;
    }

    public float getPoints() {
        return points;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public int getGoalsConceded() {
        return goalsConceded;
    }

    public void setPoints(float points) {
        this.points = points;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }

    public void setGoalsConceded(int goalsConceded) {
        this.goalsConceded = goalsConceded;
    }
}
