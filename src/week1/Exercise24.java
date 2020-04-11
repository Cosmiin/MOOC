package week1;

import nhlstats.NHLStatistics;

import java.util.Scanner;

public class Exercise24 {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        System.out.println("NHL statistics service");
        while (true) {
            System.out.println("");
            System.out.print("command (points, goals, assists, penalties, player, club, quit): ");
            String command = reader.nextLine();

            if (command.equals("quit")) {
                break;
            }

            if (command.equals("points")) {
                NHLStatistics.sortByPoints();
                NHLStatistics.top(10);
            } else if (command.equals("goals")) {
                NHLStatistics.sortByGoals();
                NHLStatistics.top(10);
            } else if (command.equals("assists")) {
                NHLStatistics.sortByAssists();
                NHLStatistics.top(10);
            } else if (command.equals("penalties")) {
                NHLStatistics.sortByPenalties();
                NHLStatistics.top(10);
            } else if (command.equals("player")) {
                NHLStatistics.searchByPlayer(reader.nextLine());
            } else if (command.equals("club")) {
                NHLStatistics.teamStatistics(reader.nextLine());
                NHLStatistics.sortByPoints();
                // ask the user for the club abbreviation and print the statistics for the club
                // note: the statistics should be sorted by points
                //     (players with the most points are first)
            }
        }
    }
}
