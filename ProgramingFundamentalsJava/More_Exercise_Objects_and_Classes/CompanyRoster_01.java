package ProgramingFundamentalsJava.More_Exercise_Objects_and_Classes;

import java.util.*;

public class CompanyRoster_01 {
    static class Employee {

        String name;
        double salary;
        String position;
        String department;
        String email;
        int age;

        Employee(String name, double salary, String position, String department, String email, int age) {
            this.name = name;
            this.salary = salary;
            this.position = position;
            this.department = department;
            this.email = email;
            this.age = age;
        }

        double getSalary(){
            return this.salary;
        }

        String getDepartment(){
            return  this.department;
        }

        public void getInfor() {
            //name, salary, email, and age
            System.out.printf("%s %.2f %s %d%n" , this.name,this.salary,this.email , this.age);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = Integer.parseInt(scanner.nextLine());
        List<Employee> employeeList = new ArrayList<>();

        for (int i = 0; i < times; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String name = "";
            double salary = 0;
            String position = "";
            String department = "";
            String email = "n/a";
            int age = -1;

            for (int j = 0; j < input.length; j++) {
                switch (j) {
                    case 0:
                        name = input[0];
                        break;
                    case 1 :
                        salary = Double.parseDouble(input[1]);
                        break;
                    case 2 :
                        position = input[2];
                        break;
                    case 3 :
                        department = input[3];
                        break;
                    case 4:
                        try {
                            age = Integer.parseInt(input[4]);
                        } catch (Exception e) {
                            email = input[4];
                        }
                        break;
                    case 5:
                        age = Integer.parseInt(input[5]);
                        break;
                }
            }
            Employee person = new Employee(name , salary , position , department , email , age);
            employeeList.add(person);
        }
        employeeList.sort(Comparator.comparingDouble(Employee::getSalary).reversed());
        String aveDepartment="";
        double average = Double.MIN_VALUE;
        for (int i = 0; i < employeeList.size(); i++) {
            double currentEmployee = employeeList.get(i).getSalary();
            int count = 1;
            for (int j = 0; j < employeeList.size(); j++) {
                if (j != i) {
                    if (employeeList.get(i).getDepartment().equals(employeeList.get(j).getDepartment())) {
                        currentEmployee += employeeList.get(j).getSalary();
                        count++;
                    }
                }
            }
            if(average < currentEmployee/count){
                average =  currentEmployee/count;
                aveDepartment = employeeList.get(i).getDepartment();
            }

        }
        System.out.printf("Highest Average Salary: %s%n",aveDepartment);

        for (Employee person : employeeList){
            if(person.getDepartment().equals(aveDepartment)){
                person.getInfor();
            }
        }

    }
}
