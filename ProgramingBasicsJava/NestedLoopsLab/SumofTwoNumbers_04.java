package SoftUniProgramingBasics.NestedLoopsLab;

import java.util.Scanner;

public class SumofTwoNumbers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int go = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magic = Integer.parseInt(scanner.nextLine());
        boolean flag = false;
        int count = 0;
        for (int i = go; i <= end; i++) {
            for (int j = go; j <= end; j++) {
                count++;
                if (i + j == magic) {
                    flag = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)", count, i, j, magic);
                    break;
                }

            }
            if (flag) {
                break;
            }

        }
        if (!flag){
            System.out.printf("%d combinations - neither equals %d",count,magic);
        }

    }
}

