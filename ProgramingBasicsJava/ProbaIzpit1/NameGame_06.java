package SoftUniProgramingBasics.ProbaIzpit1;

import java.util.Scanner;

public class NameGame_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int points =0;
        int points1=0;
        String namee = "";
        String namee2 = "";

        while(!name.equals("Stop")){
            int n = name.length();


            for (int i = 1; i <=n ; i++) {
                namee = name;
                int asciivalue1  = name.charAt(i-1);
                int numbers = Integer.parseInt(scanner.nextLine());
                if(asciivalue1  == numbers){
                    points+=10;
                }else {
                    points+=2;
                }
            }

            name = scanner.nextLine();
            namee2 = name;
            n = name.length();
            for (int i = 1; i <=n ; i++) {
                int asciivalue1  = name.charAt(i-1);
                int numbers = Integer.parseInt(scanner.nextLine());
                if(asciivalue1  == numbers){
                    points1+=10;
                }else {
                    points1+=2;
                }
            }
            name = scanner.nextLine();
        }
        if(points == points1){
            System.out.printf("The winner is %s with %d points!",namee2,points1);
        }else if (points > points1){
            System.out.printf("The winner is %s with %d points!",namee,points);
        }else {
            System.out.printf("The winner is %s with %d points!",namee2,points1);
        }
    }
}
