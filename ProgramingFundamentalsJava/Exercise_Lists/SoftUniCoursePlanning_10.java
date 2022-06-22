package ProgramingFundamentalsJava.Exercise_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String commands = scanner.nextLine();

        while(!commands.equals("course start")){

            if (commands.contains("Add")){
                String lessonToAdd = commands.split(":")[1];
                if(!input.contains(lessonToAdd)){
                    input.add(lessonToAdd);
                }
            }else if (commands.contains("Insert")){
                String lessonToInsert = commands.split(":")[1];
                int indexToInsert = Integer.parseInt(commands.split(":")[2]);
                if(!input.contains(lessonToInsert)){
                    input.add(indexToInsert , lessonToInsert);
                }
            }else if (commands.contains("Remove")){
                String lessonToRemove = commands.split(":")[1];
                String checkExercise = String.format("%s-Exercise",lessonToRemove);
                input.remove(lessonToRemove);
                input.remove(checkExercise);
            }
            else if (commands.contains("Swap")){
                String lesson1 = commands.split(":")[1];
                String lesson2 = commands.split(":")[2];
                String checkExercise1 = String.format("%s-Exercise",lesson1);
                String checkExercise2 = String.format("%s-Exercise",lesson2);
                if (input.contains(lesson1) && input.contains(lesson2)){
                    int place1 = input.indexOf(lesson1);
                    int place2 = input.indexOf(lesson2);
                    input.set(place2 , lesson1);
                    input.set(place1 , lesson2);
                }
                if(input.contains(checkExercise1)){
                    input.remove(checkExercise1);
                    int place = input.indexOf(lesson1);
                    input.add(place+1 , checkExercise1);
                }
                if(input.contains(checkExercise2)) {
                    input.remove(checkExercise2);
                    int place = input.indexOf(lesson2);
                    input.add(place + 1, checkExercise2);

                }
            }
            else if (commands.contains("Exercise")) {
                String lessonExercise = commands.split(":")[1];
                String checkExercise = String.format("%s-Exercise", lessonExercise);
                if (input.contains(lessonExercise) && !input.contains(checkExercise)) {
                    int indexLesson = input.indexOf(lessonExercise);
                    input.add(indexLesson + 1, checkExercise);
                } else {
                    input.add(lessonExercise);
                    input.add(checkExercise);
                }

            }


            commands = scanner.nextLine();
        }
        int count =0 ;
        for (String lessons : input){
            count++;
            System.out.printf("%d.%s%n",count,lessons);
        }
    }
}
//Exercise:{lessonTitle} -add Exercise in the schedule right after the lesson index, if the lesson exists and there is no exercise already, in the following format "{lessonTitle}-Exercise". If the lesson doesn't exist, add the lesson at the end of the course schedule, followed by the Exercise.
//Each time you Swap or Remove a lesson, you should do the same with the Exercises, if there are any, which follow the lessons.