
/**
 * Write a description of class Match here.
 *
 * @author (Ebenazer and arjun)
 * @version (a version number or a date)
 */
class Match {
    private Team team1;
    private Team team2;
    private int score1;
    private int score2;
    private boolean overtime;

    // Constructor for Match class
    Match(Team team1, Team team2, int score1, int score2, boolean overtime) {
        this.team1 = team1;
        this.team2 = team2;
        this.score1 = score1;
        this.score2 = score2;
        this.overtime = overtime;
        calculateFinalPoints();
    }

    // Method to calculate final points for each team based on match result
    public void calculateFinalPoints() {
        team1.setGoalsScored(team1.getGoalsScored() + score1);
        team1.setGoalsConceded(team1.getGoalsConceded() + score2);
        team2.setGoalsScored(team2.getGoalsScored() + score2);
        team2.setGoalsConceded(team2.getGoalsConceded() + score1);

        if(score1 > score2) {            // Team 1 wins.
            if(overtime) {
                team1.setPoints(team1.getPoints() + 1.5f);
                team2.setPoints(team2.getPoints() + 0.5f);
            }
            else {
                team1.setPoints(team1.getPoints() + 2);
            }
        }
        if(score2 > score1) {            // TEAM 2 WINS.
            if(overtime) {
                team2.setPoints(team2.getPoints() + 1.5f);
                team1.setPoints(team1.getPoints() + 0.5f);
            }
            else {
                team2.setPoints(team2.getPoints() + 2);
            }
        }
        //Add points according to goals scored by each team.
        team1.setPoints(team1.getPoints() + score1 * 0.1f);
        team2.setPoints(team2.getPoints() + score2 * 0.1f);
    }
}