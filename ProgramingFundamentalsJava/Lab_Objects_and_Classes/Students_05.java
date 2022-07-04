package ProgramingFundamentalsJava.Lab_Objects_and_Classes;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Students_05 {
    static class Student {
        String firstName ;
        String secondName;
        String age;
        String city;
        Student(String firstName , String secondName , String age , String city){
            this.firstName = firstName;
            this.secondName = secondName;
            this.age = age;
            this.city = city;
        }
        String getFirstName(){
           return this.firstName;
        }
        String getSecondName(){
            return this.secondName;
        }
        String getAge(){
            return this.age;
        }
        String getCity(){
            return this.city;
        }


        void getInfo() {
         System.out.printf("%s %s is %s years old%n" , this.firstName , this.secondName , this.age);
        }
    }
    private static List<String> words;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> listStudent= new ArrayList<>();
        String input = scanner.nextLine();
        while(!input.equals("end")){
            words=Arrays.stream(input.split(" ")).collect(Collectors.toList());
            Student student = new Student(words.get(0), words.get(1), words.get(2) , words.get(3) );
            listStudent.add(student);


            input = scanner.nextLine();
        }
        String town = scanner.nextLine();


        for(Student students : listStudent){
            if(students.getCity().equals(town)){
                students.getInfo();
            }
        }
    }

    private static String fullInfo(String firstName, String secondName, int age, String city) {
        return String.format("%s %s %d %s ",firstName , secondName , age , city);
    }

}
