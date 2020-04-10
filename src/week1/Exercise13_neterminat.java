package week1;

import nhlstats.NHLStatistics;

import java.util.Scanner;

public class Exercise13_neterminat {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        System.out.println("Top ten by points");
        NHLStatistics.sortByPoints();
        NHLStatistics.top(10);
        System.out.println("hello");

    }
}