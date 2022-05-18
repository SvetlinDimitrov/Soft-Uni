package SoftUniProgramingBasics.ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class PersonalTitles04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double age = Double.parseDouble(scanner.nextLine());
        String sex = scanner.nextLine();
//        if (sex.equals("m") && age >= 16) {
//            System.out.println("Mr.");
//        } else if (sex.equals("m") && age < 16) {
//            System.out.println("Master");
//        }
//        if (sex.equals("f") && age >= 16) {
//            System.out.println("Ms.");
//        } else if (sex.equals("f") && age < 16) {
//            System.out.println("Miss");
//        }
        switch (sex) {
            case "m" :
                if(age>=16) {
                    System.out.println("Mr.");
                }else {
                    System.out.println("Master");
                }
                break;
            case "f":
                if(age>=16) {
                    System.out.println("Ms.");
                }else {
                    System.out.println("Miss");
                }
        }
    }
}
//        •	"Mr." - мъж (пол "m") на 16 или повече години
//        •	"Master" - момче (пол "m") под 16 години
//        •	"Ms." - жена (пол "f") на 16 или повече години
//        •	"Miss" - момиче (пол "f") под 16 години
