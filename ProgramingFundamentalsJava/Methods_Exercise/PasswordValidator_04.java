package ProgramingFundamentalsJava.Methods_Exercise;

import java.util.Scanner;

public class PasswordValidator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pass = scanner.nextLine();
        if (PassCondition1(pass) && PassCondition2(pass) && PassCondition3(pass)){
            System.out.println("Password is valid");

        }
        if (!PassCondition1(pass)){
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!PassCondition2(pass)){
            System.out.println("Password must consist only of letters and digits");
        }
        if (!PassCondition3(pass)){
            System.out.println("Password must have at least 2 digits");
        }

    }

    public static boolean PassCondition1(String pass) {
        return pass.length() >= 6 && pass.length() <= 10;
    }
    public static boolean PassCondition2(String pass) {
        boolean condition2 = true;
        char  [] letters = new char [pass.length()];
        for (int i = 0; i <=pass.length()-1 ; i++) {
            letters[i] = pass.charAt(i);
        }
        for (int i = 0; i <= letters.length-1; i++) {
            if (!((letters[i]>=65 && letters[i]<=90 ) || (letters[i] >=97 && letters[i]<=122) || (letters[i] >=48 && letters[i]<=57))){
                condition2 = false;
                break;
            }
        }
        return  condition2;
    }
    public static boolean PassCondition3(String pass) {
        boolean digits = false ;
        int count = 0;
        char  [] letters = new char [pass.length()];
        for (int i = 0; i <=pass.length()-1 ; i++) {
            letters[i] = pass.charAt(i);
        }
        for (int i = 0; i <= letters.length-1; i++) {
            if ((letters[i] >=48 && letters[i]<=57)){
                count++;
                if(count ==2){
                    digits = true;
                    break;
                }
            }
        }
        return  digits;
    }
}
//•	6 – 10 characters (inclusive);
//•	Consists only of letters and digits;
//•	Have at least 2 digits.