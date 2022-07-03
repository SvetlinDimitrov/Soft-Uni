package ProgramingFundamentalsJava.Lab_Objects_and_Classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Songs_04 {
    private static class Song {
        String word;
        String song;

        Song(String word, String song) {
            this.word = word;
            this.song = song;
        }

        boolean IsEqual(String wordToCheck) {
            return wordToCheck.equals(word);
        }

        public String getSong() {
            return song;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = Integer.parseInt(scanner.nextLine());
        List<String> words = new ArrayList<>();
        List<String> wordsCurrent = new ArrayList<>();
        for (int i = 0; i < times; i++) {
            words.add(scanner.nextLine());
        }
        String inclusiveWord = scanner.nextLine();

        for (int i = 0; i < words.size(); i++) {
            wordsCurrent = Arrays.stream(words.get(i).split("_")).collect(Collectors.toList());
            Song song = new Song(wordsCurrent.get(0), wordsCurrent.get(1));
            if (inclusiveWord.equals("all")) {
                System.out.println(song.getSong());
            } else if (song.IsEqual(inclusiveWord)) {
                System.out.println(song.getSong());
            }
        }


    }
}
