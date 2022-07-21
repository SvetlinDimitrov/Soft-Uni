package ProgramingFundamentalsJava.Maps_Lambda_and_Stream_API_Exercise;

import java.util.*;

public class Orders_04_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String , Map<Double, Integer>> shoppingMap = new LinkedHashMap<>();

        while(!input.equals("buy")){
            String nameProduct = input.split(" ")[0];
            double price = Double.parseDouble(input.split(" ")[1]);
            int quantity = Integer.parseInt(input.split(" ")[2]);

            if(!shoppingMap.containsKey(nameProduct)){
                shoppingMap.put(nameProduct , new LinkedHashMap<>());
                shoppingMap.get(nameProduct).put(price , quantity);
            }else{
                int currentQuantity = 0;
                double currentPrice =0;
                for(Map.Entry<String , Map<Double, Integer>> mainMap: shoppingMap.entrySet()){
                    for(Map.Entry<Double , Integer> secondMain : mainMap.getValue().entrySet()){
                        if(mainMap.getKey().equals(nameProduct)){
                            currentPrice = secondMain.getKey();
                            currentQuantity = secondMain.getValue();
                        }
                    }
                }
                shoppingMap.get(nameProduct).remove(currentPrice , currentQuantity);
                shoppingMap.get(nameProduct).put(price , currentQuantity+quantity);
            }
            input = scanner.nextLine();
        }
        for(Map.Entry<String , Map<Double, Integer>> mainMap: shoppingMap.entrySet()){
            System.out.printf("%s -> ",mainMap.getKey());
            for(Map.Entry<Double , Integer> secondMain : mainMap.getValue().entrySet()){
                System.out.printf("%.2f%n",secondMain.getKey()* secondMain.getValue());
            }
        }
    }
}
