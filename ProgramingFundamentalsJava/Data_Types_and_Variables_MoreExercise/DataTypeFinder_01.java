package ProgramingFundamentalsJava.Data_Types_and_Variables_MoreExercise;

import java.util.Scanner;

public class DataTypeFinder_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String something = scanner.nextLine();

        while(!something.equals("END")){

           boolean isInt = true;
           try {
               int number = Integer.parseInt(something);
           }catch(Exception e){
               isInt = false;
           }

           boolean isDouble = true;
           try{
               double doubleN = Double.parseDouble(something);
           }catch(Exception e){
               isDouble = false;
           }

           if (isInt){
               System.out.printf("%s is integer type%n",something);
           }else if (isDouble){
               System.out.printf("%s is floating point type%n",something);
           }else if (something.length() == 1){
               System.out.printf("%s is character type%n",something);
           }else if (something.equals("false") || something.equals("true")){
               System.out.printf("%s is boolean type%n",something);
           }else {
               System.out.printf("%s is string type%n",something);
           }


            something = scanner.nextLine();
        }
    }
}
