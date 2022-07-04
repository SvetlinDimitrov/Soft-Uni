package ProgramingFundamentalsJava.Exercise_Lists;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> numArray = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        String commands = scanner.nextLine();
        int bomb = Integer.parseInt(commands.split(" ")[0]);
        int power = Integer.parseInt(commands.split(" ")[1]);
        int indexBomb =numArray.indexOf(bomb);



        while(numArray.contains(commands.split(" ")[0])){

            int left = Math.max(0 , bomb - power);
            int right = Math.min (bomb + power , numArray.size()-1);

            for (int i = right; i >= left; i--) {
                numArray.remove(i);
            }
        }
        int sum =0;
        for (String num : numArray){
            sum += Integer.parseInt(num);
        }
        System.out.println(sum);
    }
}
