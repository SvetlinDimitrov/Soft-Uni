package ProgramingFundamentalsJava.Programming_Fundamentals_Mid_Exam_02;

import java.util.*;
import java.util.stream.Collectors;

public class Numbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> num = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer>saveNum = new ArrayList<>();
        int sum = sum(num);
        double average = sum*1.0/ num.size();
        for(Integer numbers : num){
            if ( numbers > average){
                saveNum.add(numbers);
            }
        }
        Collections.sort(saveNum);
        Collections.reverse(saveNum);
        int count = 0;
        for (Integer Num :saveNum) {
            if (count != 5) {
                System.out.printf("%d ", Num);
                count++;
            } else {
                break;
            }
        }
        if (saveNum.isEmpty()){
            System.out.println("No");
        }
    }
    public static int sum (List<Integer> num){
        int sum = 0;
        for (Integer cats : num){
            sum+=cats;
        }
        return sum;
    }
}
