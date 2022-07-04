package ProgramingFundamentalsJava.Exercise_Objects_and_Classes;

import java.util.Scanner;

public class Articles_02 {
    static class Articles {
        private String title;
        private String content;
        private String author;

        Articles(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        void Edit(String content) {
            this.content = content;
        }

        void ChangeAuthor(String author){
            this.author = author;
        }

        void Rename ( String title){
            this.title = title;
        }

        public String toString(){
            return this.title + " - "+  this.content+": "+this.author;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String something = scanner.nextLine();
        Articles articles = new Articles(something.split(", ")[0],something.split(", ")[1] , something.split(", ")[2]);
        int changes = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= changes; i++) {
            String commands = scanner.nextLine();
            if(commands.contains("Edit")){
                articles.Edit(commands.split(": ")[1]);
            }else if ( commands.contains("ChangeAuthor")){
                articles.ChangeAuthor(commands.split(": ")[1]);
            }else if (commands.contains("Rename")){
                articles.Rename(commands.split(": ")[1]);
            }
        }
        System.out.println(articles.toString());
    }
}
