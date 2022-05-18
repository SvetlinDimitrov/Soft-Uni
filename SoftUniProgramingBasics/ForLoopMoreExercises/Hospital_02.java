package SoftUniProgramingBasics.ForLoopMoreExercises;

import java.util.Scanner;

public class Hospital_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int doctor = 7 ;
        int pregledani = 0;
        int nepregledani = 0;
        for (int i = 1 ; i<=n ; i++){
            int Patient = Integer.parseInt(scanner.nextLine());
            if ( doctor ==Patient){
                pregledani =pregledani+ doctor ;
            }else if ( doctor > Patient){
                pregledani = pregledani + Patient;
            }else{
                pregledani = pregledani + doctor;
                nepregledani = nepregledani +(Patient - doctor) ;
            }
            if ( pregledani < nepregledani){
                doctor+=1;
            }

        }
        System.out.printf("Treated patients: %d.%n", pregledani);
        System.out.printf("Untreated patients: %d.", nepregledani);
    }
}
//•	На първия ред – периода, за който трябва да направите изчисления. Цяло число в интервала [1 ... 1000]
//•	На следващите редове(равни на броят на дните) – броя пациенти, които пристигат за преглед за текущия ден. Цяло число в интервала [0…10 000]
