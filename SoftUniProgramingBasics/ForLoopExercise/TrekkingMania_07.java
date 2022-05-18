package SoftUniProgramingBasics.ForLoopExercise;

import java.util.Scanner;

public class TrekkingMania_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double Musala = 0 ;
        double Monblan = 0;
        double Kilimagaro = 0;
        double K2 = 0;
        double Everest = 0;
        int allPeoples = 0;
        for ( int i = 1 ; i<=n ; i++){
            int group = Integer.parseInt(scanner.nextLine());
            allPeoples = allPeoples + group ;
            if ( group <= 5) {
                Musala +=group;
            }else if ( group <= 12){
                Monblan+=group;
            }else if ( group <=25){
                Kilimagaro+=group ;
            }else if (group <= 40){
                K2+=group;
            }else {
                Everest+=group;
            }
        }
        Musala = (Musala / allPeoples) * 100 ;
        Monblan = (Monblan / allPeoples) * 100 ;
        Kilimagaro = (Kilimagaro / allPeoples) * 100 ;
        K2 = (K2 / allPeoples) * 100 ;
        Everest = (Everest / allPeoples) * 100 ;

        System.out.printf("%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n",Musala ,Monblan,Kilimagaro,K2,Everest);
    }
}
//•	Група до 5 човека – изкачват Мусала
//•	Група от 6 до 12 човека – изкачват Монблан
//•	Група от 13 до 25 човека – изкачват Килиманджаро
//•	Група от 26 до 40 човека –  изкачват К2
//•	Група от 41 или повече човека – изкачват Еверест