package week1.exercises1to24;

import nhlstats.NHLStatistics;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

//        System.out.println("Top ten by points");
//        NHLStatistics.sortByPoints();
//        NHLStatistics.top(10);

        //The name, abbreviation of the club, matches played, assists, points and penalties

        //Print the top ten players based on goals
        System.out.println("Top ten by goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);

        System.out.println("Top 25 players based on penalty amounts");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);

        System.out.println("Stats for Sidney Crosby");
        NHLStatistics.searchByPlayer("Sidney Crosby");

        System.out.println("Stats for Philadelphia Flyers");
        NHLStatistics.teamStatistics("PHI");

        System.out.println("Anaheim Ducks - Players");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");





    }
}
