package ProgramingFundamentalsJava.Programming_Fundamentals_Mid_Exam_04;

import java.util.Scanner;

public class GuineaPig_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double food = Double.parseDouble(scanner.nextLine());
        double hay =Double.parseDouble(scanner.nextLine());
        double cover = Double.parseDouble(scanner.nextLine());
        double pig = Double.parseDouble(scanner.nextLine());
        food= food*1000;
        hay = hay *1000;
        cover = cover*1000;
        pig = pig * 1000;
        boolean stop = false;
        for (int i = 1; i <= 30  ; i++) {
            food -=300;
            if(i % 2 ==0){
                hay-=food *0.05;
            }
            if(i%3== 0 ){
                cover -= pig/3;

            }
             if(food <=0 || hay <= 0 || cover <= 0 ){
                 stop = true;
                 break;
             }
        }
        if(stop){
            System.out.println("Merry must go to the pet store!");
        }else {
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.",food/1000 ,hay/1000 , cover/1000 );
        }
    }
}
