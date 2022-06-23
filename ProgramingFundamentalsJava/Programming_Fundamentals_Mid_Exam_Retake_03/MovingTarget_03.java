package ProgramingFundamentalsJava.Programming_Fundamentals_Mid_Exam_Retake_03;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> num = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();
        while(!command.equals("End")){
            if (command.contains("Shoot")) {
                int indexShoot = Integer.parseInt(command.split(" ")[1]);
                int powerShoot = Integer.parseInt(command.split(" ")[2]);
                if (indexShoot <= num.size() - 1) {
                    int afterShoot = num.get(indexShoot) - powerShoot;
                    if (afterShoot <= 0) {
                        num.remove(indexShoot);
                    } else {
                        num.set(indexShoot, afterShoot);
                    }
                }
            }
            else if (command.contains("Add")) {
                int indexAdd = Integer.parseInt(command.split(" ")[1]);
                int valueAdd = Integer.parseInt(command.split(" ")[2]);
                if (indexAdd <= num.size() - 1) {
                    num.add(indexAdd, valueAdd);
                }else  {
                    System.out.println("Invalid placement!");
                }
            }
            else if (command.contains("Strike")){
                int indexStrike = Integer.parseInt(command.split(" ")[1]);
                int radiusStrike = Integer.parseInt(command.split(" ")[2]);
                int rangeRight = indexStrike + radiusStrike;
                int rangeLeft = indexStrike - radiusStrike;
                if(rangeLeft >= 0 && rangeRight <= num.size()-1){
                    for (int i = rangeLeft; i < indexStrike ; i++) {
                        num.set(i , -1);
                    }
                    for (int i = indexStrike; i <=rangeRight ; i++) {
                        num.set(i , -1);
                    }
                    num.removeIf(n-> n==-1);
                }else{
                    System.out.println("Strike missed!");
                }
            }


            command = scanner.nextLine();
        }
        String print = String.format("%d",num.get(0));
        for (int i = 1 ; i <= num.size()-1 ; i++){
            print+=String.format("|%d",num.get(i));
        }
        System.out.println(print);
    }
}
//commands are the following:
//•	"Shoot {index} {power}"
//   o	Shoot the target at the index if it exists by reducing its value by the given power (integer value).
//   o	Remove the target if it is shot. A target is considered shot when its value reaches 0.
//•	"Add {index} {value}"
//  o	Insert a target with the received value at the received index if it exists.
//  o	If not, print: "Invalid placement!"
//•	"Strike {index} {radius}"
//  o	Remove the target at the given index and the ones before and after it depending on the radius.
//  o	If any of the indices in the range is invalid, print: "Strike missed!" and skip this command.
// Example:  "Strike 2 2"