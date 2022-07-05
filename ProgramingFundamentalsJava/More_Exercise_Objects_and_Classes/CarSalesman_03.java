package ProgramingFundamentalsJava.More_Exercise_Objects_and_Classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CarSalesman_03 {
    static class Car {
        // model, engine, weight, and color.
        String model;
        String engine;
        String weight;
        String color;


        Car(String model, String engine, String weight, String color) {
            this.model = model;
            this.engine = engine;
            this.weight = weight;
            this.color = color;
        }

        String getModel() {
            return this.model;
        }

        String getEngine() {
            return this.engine;
        }

        String getWeight() {
            return this.weight;
        }

        String getColor() {
            return this.color;
        }
    }

    static class Engine {
        //model, power, displacement, and efficiency.
        String model;
        String power;
        String displacement;
        String efficiency;

        Engine(String model, String power, String displacement, String efficiency) {
            this.model = model;
            this.power = power;
            this.displacement = displacement;
            this.efficiency = efficiency;
        }

        String getModel() {
            return this.model;
        }

        String getPower() {
            return this.power;
        }

        String getDisplacement() {
            return this.displacement;
        }

        String getEfficiency() {
            return this.efficiency;
        }

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = Integer.parseInt(scanner.nextLine());
        List<Engine> engineList = new ArrayList<>();


        for (int i = 0; i < times; i++) {
            String model = "";
            String power = "";
            String displacement = "n/a";
            String efficiency = "n/a";

            String[] stringArr = scanner.nextLine().split("\\s+");
            for (int j = 0; j < stringArr.length; j++) {
                switch (j) {
                    case 0:
                        model = stringArr[0];
                        break;
                    case 1:
                        power = stringArr[1];
                        break;
                    case 2:
                        displacement = stringArr[2];
                        break;
                    case 3:
                        efficiency = stringArr[3];
                        break;
                }
            }
            Engine engine = new Engine(model, power, displacement, efficiency);
            engineList.add(engine);
        }



        times = Integer.parseInt(scanner.nextLine());
        List<Car> carList = new ArrayList<>();

        for (int i = 0; i < times; i++) {
            String modelCar = "";
            String engineCar = "";
            String weight = "n/a";
            String color = "n/a";
            String[] stringArr = scanner.nextLine().split("\\s+");
            for (int j = 0; j < stringArr.length; j++) {
                switch (j) {
                    case 0:
                        modelCar = stringArr[0];
                        break;
                    case 1:
                        engineCar = stringArr[1];
                        break;
                    case 2:
                        weight = stringArr[2];
                        break;
                    case 3:
                        color = stringArr[3];
                        break;
                }
            }
            Car car = new Car(modelCar, engineCar, weight, color);
            carList.add(car);
        }


        for (Car cari : carList) {
            for (Engine engine1 : engineList) {
                if (cari.getEngine().equals(engine1.getModel())) {
                    System.out.printf("%s:%n",cari.getModel());
                    System.out.printf("  %s:%n",engine1.getModel());
                    System.out.printf("    Power: %s%n",engine1.getPower());
                    System.out.printf("    Displacement: %s%n",engine1.getDisplacement());
                    System.out.printf("    Efficiency: %s%n",engine1.getEfficiency());
                    System.out.printf("  Weight: %s%n",cari.getWeight());
                    System.out.printf("  Color: %s%n",cari.getColor());
                }
            }
        }
    }
}
