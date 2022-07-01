package AlgorithmsFundamentalsWithJava.Exercise_Recursion_and_Combinatorial_Problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SchoolTeams_09 {
    public static String[] girlsTeam;
    public static String[] boysTeam;
    public static String[] teamsAll;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        girlsTeam = scanner.nextLine().split(", ");
        boysTeam = scanner.nextLine().split(", ");
        teamsAll = new String[5];

        GetTeam(0, 0, 0);
    }

    private static void GetTeam(int index, int girlIndex, int boysIndex) {
        if (index >= teamsAll.length) {
            System.out.println(String.join(", ", teamsAll));
            return;
        }

        if (index < 3) {
            for (int j = girlIndex; j < girlsTeam.length; j++) {
                teamsAll[index] = girlsTeam[j];
                GetTeam(index + 1, j+1, boysIndex);
            }
        } else {
            for (int j = boysIndex; j < boysTeam.length; j++) {
                teamsAll[index] = boysTeam[j];
                GetTeam(index + 1, girlIndex, j+1);
            }


        }

    }
}
