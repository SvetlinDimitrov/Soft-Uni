package SoftUniProgramingBasics.OnlinePreExam9and10April2022;

import java.util.Scanner;

public class Substitute_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = Integer.parseInt(scanner.nextLine());
        int L = Integer.parseInt(scanner.nextLine());
        int M = Integer.parseInt(scanner.nextLine());
        int N = Integer.parseInt(scanner.nextLine());
        int count = 0;
        boolean flag = false;

        for (int i = K; i <=8 ; i++) {
            for (int j = 9; j >= L; j--) {
                for (int k = M; k <= 8; k++) {
                    for (int l = 9; l >= N; l--) {
                        if (i % 2 == 0 && j % 2 != 0 && k % 2 == 0 && l % 2 != 0) {
                            if(i==k && j==l) {
                                System.out.println("Cannot change the same player.");
                            }else{
                                count++;
                                System.out.printf("%d%d - %d%d%n", i, j, k, l);
                            }
                            if(count==6){
                                flag = true;
                                break;
                            }
                        }
                        if(flag) {
                            break;
                        }
                    }
                    if(flag){
                        break;
                    }

                }
                if(flag) {
                    break;
                }

            }
            if(flag) {
                break;
            }
        }
    }
}
//K – цяло число в интервала [0..8]
//• L – цяло число в интервала [0..9]
//• M– цяло число в интервала [0..8]
//• N – цяло число в интервала [0..9]