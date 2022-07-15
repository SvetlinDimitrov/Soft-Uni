package ProgramingFundamentalsJava.Lab_Objects_and_Classes;


import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students20_06 {
    static class Student {
        String firstName;
        String secondName;
        String age;
        String city;

        Student(String name, String secondName, String age, String city) {
            this.firstName = name;
            this.secondName = secondName;
            this.age = age;
            this.city = city;
        }

        String getFirstName() {
            return this.firstName;
        }

        String getSecondName() {
            return this.secondName;
        }

        String getCity() {
            return this.city;
        }

        String getAge() {
            return this.age;
        }

        void setCity(String city) {
            this.city = city;
        }

        void setAge(String age) {
            this.age = age;
        }

        void getInfo() {
            System.out.printf("%s %s is %s years old%n", this.firstName, this.secondName, this.age);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Student> listStudent = new ArrayList<>();

        while (!input.equals("end")) {
            String[] words = input.split(" ");
            Student student = new Student(words[0], words[1], words[2], words[3]);
            boolean isThere = false;
            if (listStudent.isEmpty()) {
                listStudent.add(student);
            } else {
                for (int i = 0; i < listStudent.size(); i++) {
                    Student s = listStudent.get(i);
                    if (s.getFirstName().equals(student.getFirstName()) && s.getSecondName().equals(student.getSecondName())) {
                        isThere = true;
                        s.setCity(student.getCity());
                        s.setAge(student.getAge());
                        break;
                    }
                }
                if (!isThere) {
                    listStudent.add(student);
                }
                input = scanner.nextLine();
            }
        }
        String mainCity = scanner.nextLine();
        for (Student p : listStudent) {
            if (p.getCity().equals(mainCity)) {
                p.getInfo();
            }
        }

    }
}


