package SoftUniProgramingBasics.ForLoopExercise;

import java.util.Scanner;

public class Salary_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String webSites = scanner.nextLine();
            switch (webSites) {
                case "Facebook":
                    salary = salary - 150;
                    break;
                case "Instagram":
                    salary = salary - 100;
                    break;
                case "Reddit":
                    salary = salary - 50;
                    break;

            }
            if (salary <= 0) {
                System.out.println("You have lost your salary.");
                break;
            }
        }
        if (salary > 0) {
            System.out.printf("%d", salary);
        }
    }
}
//•	Брой отворени табове в браузъра n - цяло число в интервала [1...10]
//•	Заплата - число в интервала [500...1500]
//След това n – на брой пъти се чете име на уебсайт – текст

//•	"Facebook" -> 150 лв.
//•	"Instagram" -> 100 лв.
//•	"Reddit" -> 50 лв.