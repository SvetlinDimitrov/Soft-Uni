package ProgramingFundamentalsJava.Exercise_Regular_Expressions;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.InflaterInputStream;

public class Race_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] racers = scanner.nextLine().split(", ");
        List<String> racerss = new ArrayList<>(Arrays.asList(racers));
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("([A-Za-z]+)");
        Pattern pattern1 = Pattern.compile("\\d");
        Map<String , Integer> map = new HashMap<>();
        StringBuilder name = new StringBuilder();

        while (!input.equals("end of race")) {
            int sum = 0;
            Matcher matcher = pattern.matcher(input);

            while (matcher.find()) {
                name.append(matcher.group());
            }

            Matcher matcher1 = pattern1.matcher(input);

            while(matcher1.find()){
                sum+=Integer.parseInt(matcher1.group());
            }
            if(!map.containsKey(name.toString())) {
                map.put(name.toString(), sum);
            }else{
                int currentSpeed = map.get(name.toString());
                map.put(name.toString() , currentSpeed+sum);
            }
            name.delete(0 , name.length());

            input = scanner.nextLine();
        }
        LinkedHashMap<String , Integer> sortedMap = new LinkedHashMap<>();
        map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEachOrdered(x-> sortedMap.put(x.getKey() , x.getValue()));
        int count =1;
        for(Map.Entry<String , Integer> entry : sortedMap.entrySet()){
            if(count>3){
                break;
            }
            if(racerss.contains(entry.getKey())) {
                switch (count) {
                    case 1:
                        System.out.printf("1st place: %s%n", entry.getKey());
                        break;
                    case 2:
                        System.out.printf("2nd place: %s%n", entry.getKey());
                        break;
                    case 3:
                        System.out.printf("3rd place: %s%n", entry.getKey());
                }
                count++;
            }
        }
    }
}
