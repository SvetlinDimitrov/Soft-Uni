package ProgramingFundamentalsJava.Lab_Lists;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> num = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            List<String> commands = Arrays.stream(input.split(" ")).collect(Collectors.toList());
            switch (commands.get(0)){

                case "Contains":
                    int numberSearch = Integer.parseInt(commands.get(1));
                    if(num.contains(numberSearch)){
                        System.out.println("Yes");
                    }else{
                        System.out.println("No such number");
                    }
                    break;

                case "Print":
                    String even ="";
                    String odd = "";
                    for (int i = 0; i <= num.size()-1 ; i++) {
                        if (num.get(i)%2==0 )even+=String.format("%d ",num.get(i));
                        if(num.get(i)%2!=0) odd+=String.format("%d ",num.get(i));
                    }
                    if(commands.get(1).equals("even")){
                        System.out.println(even);
                    }else{
                        System.out.println(odd);
                    }
                    break;
                case "Get":
                    int sum =0;
                    for (int i = 0; i <=num.size()-1 ; i++) {
                        sum+=num.get(i);
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    System.out.println(Filter(num , commands.get(1) , Integer.parseInt(commands.get(2))));
                    break;



            }
            input = scanner.nextLine();
        }
    }
    public static String Filter (List<Integer>num , String comm , int number){
        String print = "";
        for (int i = 0; i <= num.size()-1; i++) {
            switch (comm){
                case ">":
                    if (num.get(i) > number){
                        print += String.format("%d ",num.get(i));
                    }
                    break;
                case ">=":
                    if (num.get(i) >= number){
                        print += String.format("%d ",num.get(i));
                    }
                    break;
                case "<":
                    if (num.get(i) < number){
                        print += String.format("%d ",num.get(i));
                    }
                    break;
                case "<=":
                    if (num.get(i) <= number){
                        print += String.format("%d ",num.get(i));
                    }
                    break;
            }
        }
        return print;
    }
}
