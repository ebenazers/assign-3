/**
 * Write a description of class Match here.
 *
 * @author (Ebenazer and Arjun)
 * @version (a version number or a date)
 */

import java.util.*;

class Group {
    private String name;
    private List<Team> teams;
    private List<Match> matches;

    // Constructor for Group class
    Group(String name) {
        this.name = name;
        this.teams = new ArrayList<>();
        this.matches = new ArrayList<>();
    }

    // Method to add a team to the group
    public void addTeam(Team team) {
        if (teams.size() < 5) {
            teams.add(team);
        }
    }

    // Method to add a match to the group
    public void addMatch(Team team1, Team team2, int score1 , int score2, boolean overtime) {
        if (!teams.contains(team1) || !teams.contains(team2)) {
            throw new IllegalArgumentException("Both teams must be in the same group");
        }
        Match match = new Match(team1, team2, score1, score2, overtime);
        matches.add(match);
    }

    // Method to generate random games within the group
    public void randomGames() {
        Random rand = new Random();
        for (int i = 0 ; i < teams.size(); i++) {
            for(int j = i+1 ; j < teams.size() ;  j++) {
                int score1 = rand.nextInt(6);
                int score2 = rand.nextInt(6);
                boolean overtime = rand.nextBoolean();
                addMatch(teams.get(i), teams.get(j), score1, score2, overtime);
            }
        }
    }
    public void calculateStanding() {
        teams.sort((team1, team2) -> {
            if (team1.getPoints() != team2.getPoints()) {
                return Float.compare(team2.getPoints(), team1.getPoints());
            } else {
                int goalDiff1 = team1.getGoalsScored() - team1.getGoalsConceded();
                int goalDiff2 = team2.getGoalsScored() - team2.getGoalsConceded();
                return Integer.compare(goalDiff2, goalDiff1);
            }
        });

        for (Team team : teams) {
            System.out.println("Team: " + team.getName() + ", Points: " + team.getPoints() + ", Goal Difference: " + (team.getGoalsScored() - team.getGoalsConceded()));
        }
    }
}