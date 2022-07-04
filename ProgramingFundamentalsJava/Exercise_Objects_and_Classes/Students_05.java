package ProgramingFundamentalsJava.Exercise_Objects_and_Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    String firstName;
    String secondName;
    double grade;

    Student(String firstName , String secondName , double grade){
        this.firstName = firstName;
        this.secondName = secondName;
        this.grade = grade;
    }

    double getGrade (){
        return this.grade;
    }

    void getInfo() {
        System.out.printf("%s %s: %.2f%n", this.firstName , this.secondName , this.grade);
    }

}

public class Students_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = Integer.parseInt(scanner.nextLine());
        List<Student> allStudents = new ArrayList<>();
        for (int i = 0; i < times; i++) {
            String input = scanner.nextLine();
            String firstName = input.split(" ")[0];
            String secondName = input.split(" ")[1];
            double grade = Double.parseDouble(input.split(" ")[2]);
            Student student = new Student(firstName,secondName,grade);
            allStudents.add(student);
        }
        sort(allStudents);
        for (Student stud : allStudents){
            stud.getInfo();
        }
    }
    public static void sort(List<Student>students){
        for (int i = 0; i <= students.size()-1; i++) {
            int save = i;
            for (int j = i+1; j <= students.size()-1 ; j++) {
                if(students.get(i).getGrade() < students.get(j).getGrade()){
                    save = j;
                }
            }
            swwap(students,i,save);
        }
    }

    private static void swwap(List<Student> students, int i, int save) {
        List<Student> saveList = new ArrayList<>();
        saveList.add(students.get(i));
        students.set(i ,students.get(save));
        students.set(save ,saveList.get(0) );
    }
}
