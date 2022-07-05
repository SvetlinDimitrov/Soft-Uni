package ProgramingFundamentalsJava.Exercise_Objects_and_Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleCatalogue_06 {
    static class Vechicle {
        String type;
        String model;
        String color;
        double horsePower;

        Vechicle(String type, String model, String color, double horsePower) {
            this.type = type;
            this.model = model;
            this.color = color;
            this.horsePower = horsePower;

        }

        String getModel() {
            return this.model;
        }

        void getInfo() {
            System.out.printf("Type: %s%n", this.type);
            System.out.printf("Model: %s%n", this.model);
            System.out.printf("Color: %s%n", this.color);
            System.out.printf("Horsepower: %.0f%n", this.horsePower);
        }

        String getType() {
            return this.type;
        }

        double getHorsePower() {
            return this.horsePower;
        }
        void setType(String type){
            this.type = type;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Vechicle> vechicleList = new ArrayList<>();
        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String type = input.split(" ")[0];
            String model = input.split(" ")[1];
            String color = input.split(" ")[2];
            double horsePower = Double.parseDouble(input.split(" ")[3]);
            Vechicle vechicle = new Vechicle(type, model, color, horsePower);
            vechicleList.add(vechicle);
            input = scanner.nextLine();
        }
        double carHorsePower = 0;
        double truckHorsePower = 0;
        int countCars = 0;
        int countTrucks = 0;
        String secondInput = scanner.nextLine();
        while (true) {

            for (Vechicle vechicle : vechicleList) {

                if (vechicle.getType().equals("car") || vechicle.getType().equals("Car") ) {
                    vechicle.setType("Car");
                    carHorsePower += vechicle.getHorsePower();
                    countCars++;
                }
                if (vechicle.getType().equals("truck") || vechicle.getType().equals("Truck")  ) {
                    vechicle.setType("Truck");
                    truckHorsePower += vechicle.getHorsePower();
                    countTrucks++;
                }

                if (vechicle.getModel().equals(secondInput)) {
                    vechicle.getInfo();
                }
            }
            if(secondInput.equals("Close the Catalogue")){
                break;
            }
            secondInput = scanner.nextLine();
        }
        if(countCars==0){
            System.out.printf("Cars have average horsepower of: %.2f.%n",carHorsePower  * 1.0);
        }else {
            System.out.printf("Cars have average horsepower of: %.2f.%n", carHorsePower / countCars * 1.0);
        }
        if(countTrucks==0){
            System.out.printf("Trucks have average horsepower of: %.2f.%n",truckHorsePower  * 1.0);
        }else {
            System.out.printf("Trucks have average horsepower of: %.2f.%n", truckHorsePower / countTrucks * 1.0);
        }
    }
}
