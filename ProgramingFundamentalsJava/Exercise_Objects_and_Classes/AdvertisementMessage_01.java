package ProgramingFundamentalsJava.Exercise_Objects_and_Classes;

import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] Phrases = {"Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
        String[] Events = {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
        String[] Authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] Cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};
        System.out.printf("%s %s %s – %s",randomString(Phrases) , randomString(Events) , randomString(Authors) , randomString(Cities));
    }

    public static String randomString(String[] word) {
        Random rd = new Random();
        return word[rd.nextInt(word.length)];
    }
}
