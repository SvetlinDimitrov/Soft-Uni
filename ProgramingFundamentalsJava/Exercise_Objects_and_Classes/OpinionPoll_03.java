package ProgramingFundamentalsJava.Exercise_Objects_and_Classes;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OpinionPoll_03 {

    static class Person {
        private String name;
        private int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;

        }

        int getAge() {
            return this.age;
        }


        public void getInfo() {
            System.out.printf("%s - %d%n",this.name , this.age);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = Integer.parseInt(scanner.nextLine());
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < times; i++) {
            String command = scanner.nextLine();
            Person person = new Person(command.split(" ")[0], Integer.parseInt(command.split(" ")[1]));
            if(person.getAge() > 30) {
                people.add(person);
            }
        }
        for(Person pop : people){
            pop.getInfo();
        }
    }
}
