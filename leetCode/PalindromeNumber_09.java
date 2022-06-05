package leetCode;


import java.util.Arrays;
import java.util.Scanner;

public class PalindromeNumber_09 {
    public  boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }else if ( x == 0){
            return true;
        }
        int r =0 ;
        String reverseNum = "";
        int count = 0;
        for (int i = Math.abs(x); i >0 ; i/=10) {
            r = i % 10;
            count++;
            if( r == 0 && count ==1){

            }else {
                reverseNum += String.format("%d", r);
            }
        }
        long reverseNumber = Long.parseLong(reverseNum);
        return (Math.abs(x) == reverseNumber);
    }

}