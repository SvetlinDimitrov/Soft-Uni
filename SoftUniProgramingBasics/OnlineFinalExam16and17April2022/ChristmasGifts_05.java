package SoftUniProgramingBasics.OnlineFinalExam16and17April2022;

import java.util.Scanner;

public class ChristmasGifts_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String presents = scanner.nextLine();

        int kids = 0;
        int old = 0;


        while(!presents.equals("Christmas")){
            int years = Integer.parseInt(presents);
            if ( years <=16){
                kids++;
            }else{
                old++;
            }
            presents = scanner.nextLine();
        }
        double kidsPrice = kids * 5.0;
        double oldPrice = old * 15.0;

        System.out.printf("Number of adults: %d%n",old);
        System.out.printf("Number of kids: %d%n",kids);
        System.out.printf("Money for toys: %.0f%n",kidsPrice);
        System.out.printf("Money for sweaters: %.0f",oldPrice);

    }
}
//•	"Number of adults: {брой хора над 16 години}"
//•	"Number of kids: {брой хора до 16 (вкл.) години}"
//•	"Money for toys: {сумата за всички играчки}"
//•	"Money for sweaters: {сума за всички пуловери}"