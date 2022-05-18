package SoftUniProgramingBasics.ForLoopMoreExercises;

import java.util.Scanner;

public class Bills_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double water = 0;
        double internet = 0 ;
        double elsee = 0;
        double curent = 0;
        double elseesbor = 0;
        for ( int i = 1 ; i <= n ; i++){
            double electricity = Double.parseDouble(scanner.nextLine());
            curent+= electricity;
            water += 20 ;
            internet += 15 ;
            elsee = (electricity + 20 + 15 ) + ((electricity + 20 + 15 )*0.2);
elseesbor +=elsee;
        }
        System.out.printf("Electricity: %.2f lv%n", curent);
        System.out.printf("Water: %.2f lv%n", water);
        System.out.printf("Internet: %.2f lv%n", internet);
        System.out.printf("Other: %.2f lv%n", elseesbor);
        System.out.printf("Average: %.2f lv%n", (curent+water+internet+elseesbor)/n);

    }
}
//•	1ви ред: "Electricity: {ток за всички месеци} lv"
//•	2ри ред: "Water: {вода за всички месеци} lv"
//•	3ти ред: "Internet: {интернет за всички месеци} lv"
//•	4ти ред: "Other: {други за всички месеци} lv"
//•	5ти ред: "Average: {средно всички разходи за месец} lv"




//•	За ток – всеки месец е различен, ще се чете от конзолата
//•	за вода – 20 лв.
//•	за интернет – 15 лв.
//•	за други – събират се тока, водата и интернета за месеца и към сумата се прибавят 20%.