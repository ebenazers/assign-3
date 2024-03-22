
/**
 * Write a description of class WorldCupHockey here.
 *
 * @author (Ebenazer and Arjun)
 * @version (a version number or a date)
 */
import java.util.*;


public class WorldCupHockey {
    public static void main(String[] args) {
        hockeyCupSetup();
    }
    public static void hockeyCupSetup() {
        // Create teams with 17 players each
        Team canada = new Team("Canada", generatePlayers("Canada Player", 17), "Coach1");
        Team usa = new Team("USA", generatePlayers("USA Player", 17), "Coach2");
        Team russia = new Team("Russia", generatePlayers("Russia Player", 17), "Coach3");
        Team sweden = new Team("Sweden", generatePlayers("Sweden Player", 17), "Coach4");
        Team finland = new Team("Finland", generatePlayers("Finland Player", 17), "Coach5");

        // Create a group and add teams
        Group groupA = new Group("Group A");
        groupA.addTeam(canada);
        groupA.addTeam(usa);
        groupA.addTeam(russia);
        groupA.addTeam(sweden);
        groupA.addTeam(finland);

        Group groupB = new Group("Group B");
        groupB.addTeam(new Team("India", generatePlayers("India Player", 17), "Coach6"));
        groupB.addTeam(new Team("Pakistan", generatePlayers("Pakistan Player", 17), "Coach7"));
        groupB.addTeam(new Team("Bangladesh", generatePlayers("Bangladesh Player", 17), "Coach8"));
        groupB.addTeam(new Team("Nepal", generatePlayers("Nepal Player", 17), "Coach9"));
        groupB.addTeam(new Team("China", generatePlayers("China Player", 17), "Coach10"));

        Group groupC = new Group("Group C");
        groupC.addTeam(new Team("Israel", generatePlayers("Israel Player", 17), "Coach11"));
        groupC.addTeam(new Team("Palestine", generatePlayers("Palestine Player", 17), "Coach12"));
        groupC.addTeam(new Team("Ukraine", generatePlayers("Ukraine Player", 17), "Coach13"));
        groupC.addTeam(new Team("Iraq", generatePlayers("Iraq Player", 17), "Coach14"));
        groupC.addTeam(new Team("Iran", generatePlayers("Iran Player", 17), "Coach15"));

        Group groupD = new Group("Group D");
        groupD.addTeam(new Team("Japan", generatePlayers("Japan Player", 17), "Coach16"));
        groupD.addTeam(new Team("North Korea", generatePlayers("North Korea Player", 17), "Coach17"));
        groupD.addTeam(new Team("South Korea", generatePlayers("South Korea Player", 17), "Coach18"));
        groupD.addTeam(new Team("Singapore", generatePlayers("Singapore Player", 17), "Coach19"));
        groupD.addTeam(new Team("Germany", generatePlayers("Germany Player", 17), "Coach20"));

        // Generate all possible matches between teams in the same group
        groupA.randomGames();
        groupB.randomGames();
        groupC.randomGames();
        groupD.randomGames();

        // Calculate and display standings for each group
        System.out.println("Standings for Group A:");
        groupA.calculateStanding();
        System.out.println("\nStandings for Group B:");
        groupB.calculateStanding();
        System.out.println("\nStandings for Group C:");
        groupC.calculateStanding();
        System.out.println("\nStandings for Group D:");
        groupD.calculateStanding();
    }

    // Helper method to generate player names
    public static List<String> generatePlayers(String baseName, int numPlayers) {
        List<String> players = new ArrayList<>();
        for (int i = 1; i <= numPlayers; i++) {
            players.add(baseName + " " + i);
        }
        return players;
    }
}