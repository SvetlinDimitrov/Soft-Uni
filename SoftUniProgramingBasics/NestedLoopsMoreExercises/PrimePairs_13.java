package SoftUniProgramingBasics.NestedLoopsMoreExercises;

import java.util.Scanner;

public class PrimePairs_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int diffN1 = Integer.parseInt(scanner.nextLine());
        int diffN2 = Integer.parseInt(scanner.nextLine());
        diffN1+=n1;
        diffN2+=n2;

        for (int i = n1; i <=diffN1 ; i++) {
            for (int j = n2; j <=diffN2 ; j++) {
                int count = 0;
                int countTwo = 0;
                for (int k = 1; k <=n1 ; k++) {
                    if(i%k==0){
                        count++;
                    }

                }
                for (int k = 1; k <=n2 ; k++) {
                    if(j%k==0){
                        countTwo++;
                    }

                }
                if ((count == 1) ) {
                    if ((countTwo == 1) ) {
                        System.out.printf("%d%d%n", i, j);
                    }
                }
            }
        }
    }
}
//•	На първия ред – началната стойност на първите първата двойка числа – цяло положително число в диапазона [10… 90]
//•	На втория ред – началната стойност на втората двойка числа – цяло положително число в диапазона [10… 90]
//•	На третия ред – разликата между началната и крайната стойност на  първата двойка числа – цяло положително число в диапазона [1… 9]
//•	На четвъртия ред – разликата между началната и крайната стойност на  втората двойка числа – цяло положително число в диапазона [1… 9]