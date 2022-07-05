package ProgramingFundamentalsJava.More_Exercise_Objects_and_Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RawData_02 {
    static class Car {
        String model;
        int engineSpeed;
        int enginePower;
        int cargoWeight;
        String cargoType;
        double tire1Pressure;
        double tire1Age;
        double tire2Pressure;
        double tire2Age;
        double tire3Pressure;
        double tire3Age;
        double tire4Pressure;
        double tire4Age;

        Car(String model ,int engineSpeed ,int enginePower ,int cargoWeight ,String cargoType ,double tire1Pressure  ,double tire1Age,double tire2Pressure,double tire2Age,double tire3Pressure,double tire3Age,double tire4Pressure,double tire4Age ){
            this.model = model;
            this.engineSpeed = engineSpeed;
            this.enginePower = enginePower;
            this.cargoWeight = cargoWeight;
            this.cargoType = cargoType;
            this.tire1Pressure = tire1Pressure;
            this.tire1Age = tire1Age;
            this.tire2Pressure = tire2Pressure;
            this.tire2Age = tire2Age;
            this.tire3Pressure = tire3Pressure;
            this.tire3Age = tire3Age;
            this.tire4Pressure = tire4Pressure;
            this.tire4Age = tire4Age;
        }
        String getCargoType() {
            return this.cargoType;
        }

        boolean BestEnginePower() {
            return this.enginePower > 250;
        }

        boolean StableTire1Pressure() {
            return this.tire1Pressure < 1;
        }

        boolean StableTire2Pressure() {
            return this.tire2Pressure < 1;
        }

        boolean StableTire3Pressure() {
            return this.tire3Pressure < 1;
        }

        boolean StableTire4Pressure() {
            return this.tire4Pressure < 1;
        }
        String getModel(){
            return this.model;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = Integer.parseInt(scanner.nextLine());
        List<Car> carList = new ArrayList<>();

        for (int i = 0; i < times; i++) {
            String[] car = scanner.nextLine().split(" ");
            String model = car[0];
            int engineSpeed = Integer.parseInt(car[1]);
            int enginePower = Integer.parseInt(car[2]);
            int cargoWeight = Integer.parseInt(car[3]);
            String cargoType = car[4];
            double tire1Pressure = Double.parseDouble(car[5]);
            double tire1Age = Double.parseDouble(car[6]);
            double tire2Pressure = Double.parseDouble(car[7]);
            double tire2Age = Double.parseDouble(car[8]);
            double tire3Pressure = Double.parseDouble(car[9]);
            double tire3Age = Double.parseDouble(car[10]);
            double tire4Pressure = Double.parseDouble(car[11]);
            double tire4Age = Double.parseDouble(car[12]);
            Car c = new Car(model,engineSpeed,enginePower,cargoWeight,cargoType,tire1Pressure,tire1Age,tire2Pressure,tire2Age,tire3Pressure,tire3Age,tire4Pressure,tire4Age);
            carList.add(c);
        }
        String idk = scanner.nextLine();

        if (idk.equals("fragile")){
            for (int i = 0; i < carList.size(); i++) {
                if(carList.get(i).getCargoType().equals("fragile")){
                    if(carList.get(i).StableTire1Pressure() || carList.get(i).StableTire2Pressure()
                    || carList.get(i).StableTire3Pressure() || carList.get(i).StableTire4Pressure()){
                        System.out.println(carList.get(i).getModel());
                    }
                }
            }
        }else if (idk.equals("flamable")){
            for (int i = 0; i < carList.size(); i++) {
                if(carList.get(i).getCargoType().equals("flamable")){
                    if(carList.get(i).BestEnginePower()){
                        System.out.println(carList.get(i).getModel());
                    }
                }

            }
        }
    }
}
