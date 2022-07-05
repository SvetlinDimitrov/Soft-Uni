package ProgramingFundamentalsJava.Exercise_Objects_and_Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderbyAge_07 {
    static class Person {
        String name;
        String id;
        int age;

        Person(String name, String id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }

        int getAge(){
            return this.age;
        }

        void getInfo(){
            System.out.printf( "%s with ID: %s is %d years old.%n",this.name,this.id,this.age);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Person> personList = new ArrayList<>();

        while(!input.equals("End")){
            String name = input.split(" ")[0];
            String id = input.split(" ")[1];
            int age = Integer.parseInt(input.split(" ")[2]);
            Person person = new Person(name,id,age);
            personList.add(person);
            input = scanner.nextLine();

        }
        sortt(personList);
        for (Person person : personList){
            person.getInfo();
        }
    }

    private static void sortt(List<Person> personList) {
        for (int i = 0; i < personList.size(); i++) {
            int copy = i;
            for (int j = i+1; j < personList.size() ; j++) {
                if(personList.get(copy).getAge() > personList.get(j).getAge()){
                    copy = j;
                }
            }
            swapp(i , copy , personList);
        }
    }

    private static void swapp(int i, int copy, List<Person> personList) {
        List<Person> saveList = new ArrayList<>();
        saveList.add(0 , personList.get(i));
        personList.set(i , personList.get(copy));
        personList.set(copy , saveList.get(0));
    }
}
