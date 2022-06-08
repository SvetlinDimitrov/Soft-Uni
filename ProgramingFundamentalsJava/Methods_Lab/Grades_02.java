package ProgramingFundamentalsJava.Methods_Lab;

import javax.xml.transform.SourceLocator;
import java.util.Scanner;

public class Grades_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grade = Double.parseDouble(scanner.nextLine());
        Grade(grade);

    }

    public static void Grade(double number) {
        if (number >= 2.00 && number <= 2.99) {
            System.out.println("Fail");
        } else if (number <= 3.49) {
            System.out.println("Poor");
        } else if (number <= 4.49) {
            System.out.println("Good");
        } else if (number <= 5.49) {
            System.out.println("Very good");
        } else {
            System.out.println("Excellent");
        }
    }
}
//•	2.00 – 2.99 - "Fail"
//•	3.00 – 3.49 - "Poor"
//•	3.50 – 4.49 - "Good"
//•	4.50 – 5.49 - "Very good"
//•	5.50 – 6.00 - "Excellent"