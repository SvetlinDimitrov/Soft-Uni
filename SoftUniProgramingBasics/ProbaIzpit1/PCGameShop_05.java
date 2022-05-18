package SoftUniProgramingBasics.ProbaIzpit1;

import java.util.Scanner;

public class PCGameShop_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double p1 = 0 ;
        double p2 = 0 ;
        double p3 = 0 ;
        double p4 = 0 ;
        for (int i = 1; i <= n ; i++) {
            String game = scanner.nextLine();
            switch(game){
                case "Hearthstone" :
                    p1++;
                    break;
                case "Fornite" :
                    p2++;
                    break;
                case "Overwatch":
                    p3++;
                    break;
                default:
                    p4++;
                    break;
            }


        }
        System.out.printf("Hearthstone - %.2f%%%n",p1/n*100);
        System.out.printf("Fornite - %.2f%%%n",p2/n*100);
        System.out.printf("Overwatch - %.2f%%%n",p3/n*100);
        System.out.printf("Others - %.2f%%%n",p4/n*100);
    }
}
