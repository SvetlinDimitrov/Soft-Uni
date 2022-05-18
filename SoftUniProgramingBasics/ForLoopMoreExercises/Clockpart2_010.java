package SoftUniProgramingBasics.ForLoopMoreExercises;

public class Clockpart2_010 {
    public static void main(String[] args) {
        for ( int i =0 ; i <= 23 ; i++){
            for ( int m = 0 ; m<=59 ; m++){
                for ( int s = 0 ; s<=59 ; s++){
                    System.out.printf("%d : %d : %d%n ", i, m , s);
                }
            }
        }
    }
}
