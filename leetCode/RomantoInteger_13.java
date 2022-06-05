package leetCode;

import java.util.Arrays;
import java.util.Scanner;

public class RomantoInteger_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] index = new char[input.length()];
        int count = 0;
        int number = 0;
        for (int i = 0; i <= index.length - 1; i++) {
            index[i] = input.charAt(i);
        }
        for (int i = index.length - 1; i >= 0; i--) {
            if (i == 0){
                if (index[i] == 'I') {
                    number = 1;
                }else if (index[i] == 'V') {
                    number = 5;
                }else if (index[i] == 'X') {
                    number = 10;
                }else if (index[i] == 'L') {
                    number=50;
                }else if (index[i] == 'C') {
                    number = 100;
                }else if (index[i] == 'D') {
                    number = 500;
                }else if (index[i] == 'M') {
                    number = 1000;
                }
                count += number;
                break;
            }
            if (index[i] == 'I') {
                number = 1;
            } else if (index[i] == 'V') {
                if (index[i - 1] == 'I') {
                    number = 4;
                    i--;
                } else {
                    number = 5;
                }
            } else if (index[i] == 'X') {
                if (index[i - 1] == 'I') {
                    number = 9;
                    i--;
                }  else {
                    number = 10;
                }

            } else if (index[i] == 'L') {
                 if (index[i - 1] == 'X') {
                    number = 40;
                    i--;
                } else {
                    number = 50;
                }

            } else if (index[i] == 'C') {
                if (index[i - 1] == 'X') {
                    number = 90;
                    i--;
                }else {
                    number = 100;
                }

            } else if (index[i] == 'D') {
                if (index[i - 1] == 'C') {
                    number = 400;
                    i--;
                }else {
                    number = 500;
                }

            } else if (index[i] == 'M') {
                if (index[i - 1] == 'C') {
                    number = 900;
                    i--;
                }else {
                    number = 1000;
                }
            }
            count += number;
        }
        System.out.println(count);
    }
}
//Symbol       Value
//I             1
//V             5
//X             10
//L             50
//C             100
//D             500
//M             1000