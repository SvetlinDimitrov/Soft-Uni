package ProgramingFundamentalsJava.Maps_Lambda_and_Stream_API_Exercise;

import java.util.*;

public class Orders_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String , List<Double>> map = new LinkedHashMap<>();

        while(!input.equals("buy")){
            String name = input.split(" ")[0];
            double price = Double.parseDouble(input.split(" ")[1]);
            double quantity = Double.parseDouble(input.split(" ")[2]);
            if(!map.containsKey(name)){
                map.put(name , new ArrayList<>());
                map.get(name).add(price);
                map.get(name).add(quantity);

            }else{
                map.get(name).set(0 , price);
                double currentQuantity = map.get(name).get(1);
                map.get(name).set(1 , currentQuantity+quantity);
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String , List<Double>> entry : map.entrySet()){
            System.out.printf("%s -> %.2f%n" , entry.getKey(), entry.getValue().get(0) * entry.getValue().get(1));
        }
    }
}
