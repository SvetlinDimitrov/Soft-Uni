package SoftUniProgramingBasics.ForLoopExercise;

import java.util.Scanner;

public class TrekkingMania_while_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int i = 1;
        double p1 = 0;
        double p1P = 0;
        double p2 = 0;
        double p2P = 0;
        double p3 = 0;
        double p3P = 0;
        double p4 = 0;
        double p4P = 0;
        double p5 = 0;
        double p5P = 0;
        while ( i<=n){
            int groups = Integer.parseInt(scanner.nextLine());
            if ( groups <= 5 ){
                p1+=1;
                p1P +=groups;
            }else if ( groups <= 12 ){
                p2+=1;
                p2P+= groups;
            } else if ( groups <= 25 ){
                p3+=1;
                p3P+= groups;
            }else if ( groups <= 40 ){
                p4+=1;
                p4P+= groups;
            }else {
                p5+=1;
                p5P+= groups;
            }

            i++;
        }
        double allPeople = p1P + p2P + p3P + p4P + p5P ;
        System.out.printf("%.2f%%%n",p1P/allPeople*100);
        System.out.printf("%.2f%%%n",p2P/allPeople*100);
        System.out.printf("%.2f%%%n",p3P/allPeople*100);
        System.out.printf("%.2f%%%n",p4P/allPeople*100);
        System.out.printf("%.2f%%%n",p5P/allPeople*100);
    }
}
//•	На първия ред – броя на групите от катерачи – цяло число в интервала [1...1000]
//•	За всяка една група на отделен ред – броя на хората в групата – цяло число в интервала [1...1000]

//•	Група до 5 човека – изкачват Мусала
//•	Група от 6 до 12 човека – изкачват Монблан
//•	Група от 13 до 25 човека – изкачват Килиманджаро
//•	Група от 26 до 40 човека –  изкачват К2
//•	Група от 41 или повече човека – изкачват Еверест