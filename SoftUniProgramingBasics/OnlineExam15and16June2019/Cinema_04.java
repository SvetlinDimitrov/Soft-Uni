package SoftUniProgramingBasics.OnlineExam15and16June2019;

import java.util.Scanner;

public class Cinema_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxPeople = Integer.parseInt(scanner.nextLine());
        String sum = scanner.nextLine();
        double moeny = 0;
        double seats = 0;
        boolean flag = false;

        while (!sum.equals("Movie time!")) {
            int people = Integer.parseInt(sum);
            seats += people;
            if (seats > maxPeople) {
                flag = true;
                break;
            }
            if (people % 3 == 0) {
                moeny = moeny + ((people * 5) - 5);
            } else {
                moeny = moeny + (people * 5);

            }
            sum = scanner.nextLine();
        }
        if(flag){
            System.out.println("The cinema is full.");
            System.out.printf("Cinema income - %.0f lv.",moeny);
        }else{
            System.out.printf("There are %.0f seats left in the cinema.%n",maxPeople*1.0 -seats);
            System.out.printf("Cinema income - %.0f lv.",moeny);

        }
    }
}
