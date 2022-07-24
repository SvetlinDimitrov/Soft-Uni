package ProgramingFundamentalsJava.More_Exercises_Associative_Arrays_Lambda_and_Stream_API;


import javax.xml.transform.SourceLocator;
import java.io.FileFilter;
import java.util.*;

public class MOBAChallenger_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //"{player} -> {position} -> {skill}"
        String input = scanner.nextLine();
        Map<String, Map<String, Integer>> mainMap = new TreeMap<>(Comparator.reverseOrder());

        while (!input.equals("Season end")) {
            if (input.contains(" vs ")) {
                String fighter1 = input.split(" vs ")[0];
                String fighter2 = input.split(" vs ")[1];
                if (mainMap.containsKey(fighter1) && mainMap.containsKey(fighter2)) {
                    List<String> fight = new ArrayList<>();
                    fight.add(0, null);
                    fight = FightOrNot(mainMap.get(fighter1), mainMap.get(fighter2));
                    if (fight.get(0) != null) {
                        fight.remove(null);
                        for (int i = 0; i < fight.size(); i++) {
                            if (mainMap.get(fighter1).get(fight.get(i)) > mainMap.get(fighter2).get(fight.get(i))) {
                                mainMap.get(fighter2).remove(fight.get(i));
                            } else if (mainMap.get(fighter1).get(fight.get(i)) < mainMap.get(fighter2).get(fight.get(i))) {
                                mainMap.get(fighter1).remove(fight.get(i));
                            }
                        }
                    }
                }
            } else {
                String name = input.split(" -> ")[0];
                String position = input.split(" -> ")[1];
                int skill = Integer.parseInt(input.split(" -> ")[2]);
                if (!mainMap.containsKey(name)) {
                    mainMap.put(name, new HashMap<>());
                    mainMap.get(name).put(position, skill);
                } else {
                    if (!mainMap.get(name).containsKey(position)) {
                        mainMap.get(name).put(position, skill);
                    } else {
                        if (mainMap.get(name).get(position) < skill) {
                            mainMap.get(name).put(position, skill);
                        }
                    }
                }
            }

            input = scanner.nextLine();
        }


        Map<String, Map<String, Integer>> mainMapSorted = new TreeMap<>(Comparator.reverseOrder());


        for (Map.Entry<String, Map<String, Integer>> entryMain : mainMap.entrySet()) {
            mainMapSorted.put(entryMain.getKey(), new LinkedHashMap<>());
            entryMain.getValue()
                    .entrySet()
                    .stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .forEachOrdered(x -> mainMapSorted.get(entryMain.getKey()).put(x.getKey(), x.getValue()));
        }

        LinkedHashMap<String, Integer> halfSorted = new LinkedHashMap<>();
        Map<String, Integer> halfMap = new HashMap<>();
        for (Map.Entry<String, Map<String, Integer>> entryMain : mainMapSorted.entrySet()) {
            for (Map.Entry<String, Integer> entry : entryMain.getValue().entrySet()) {
                halfMap.put(entryMain.getKey(), GetMaxValue(entryMain));
            }

        }
        halfMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> halfSorted.put(x.getKey(), x.getValue()));


        // Print
        for (Map.Entry<String, Integer> entryPrint : halfSorted.entrySet()) {
            System.out.printf("%s: %d skill%n",entryPrint.getKey(),entryPrint.getValue());

            for (Map.Entry<String, Map<String, Integer>> entryMain : mainMapSorted.entrySet()) {
                if(entryPrint.getKey().equals(entryMain.getKey())) {
                    for (Map.Entry<String, Integer> entry : entryMain.getValue().entrySet()) {
                        System.out.printf("- %s <::> %d%n",entry.getKey() , entry.getValue());
                    }
                }
            }
        }
    }

    private static int GetMaxValue(Map.Entry<String, Map<String, Integer>> entryMain) {
        int sum = 0;
        for (Map.Entry<String, Integer> entry : entryMain.getValue().entrySet()) {
            sum += entry.getValue();
        }
        return sum;
    }

    private static ArrayList<String> FightOrNot(Map<String, Integer> fighter1, Map<String, Integer> fighter2) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> listToReturn = new ArrayList<>();
        listToReturn.add(0, null);
        for (Map.Entry<String, Integer> entry : fighter1.entrySet()) {
            list.add(entry.getKey());
        }

        for (Map.Entry<String, Integer> entry : fighter2.entrySet()) {
            for (int i = 0; i < list.size(); i++) {
                if (entry.getKey().equals(list.get(i))) {
                    listToReturn.add(0, entry.getKey());
                }
            }
        }
        return listToReturn;
    }
}
