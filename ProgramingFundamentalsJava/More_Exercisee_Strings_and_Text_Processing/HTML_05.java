package ProgramingFundamentalsJava.More_Exercisee_Strings_and_Text_Processing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HTML_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> save = new ArrayList<>();
        save.add(0, "<h1>");
        save.add(save.size() , "    "+ scanner.nextLine());
        save.add(save.size() , "</h1>");
        save.add(save.size() , "<article>");
        save.add(save.size() , "    "+ scanner.nextLine());
        save.add(save.size() , "</article>");


        String input = scanner.nextLine();
        while(!input.equals("end of comments")){

            save.add(save.size(), "<div>");
            save.add(save.size(), "    " + input);
            save.add(save.size(), "</div>");



            input = scanner.nextLine();
        }
        for (String word : save){
            System.out.println(word);
        }
    }
}
