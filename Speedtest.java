import java.util.Scanner;

public class Speedtest {
    public static void main (String[]args){
        String sentence = "I don't need it to be easy I want it to be worth it";
        System.out.println("Welcome to Typing test Application");
        System.out.println("Write following Sentence\n"+sentence+"\n");
        Scanner input = new Scanner(System.in);
        long start_time = System.currentTimeMillis();
        String my_sentence = input.nextLine();
        long end_time = System.currentTimeMillis();
        long total_time = end_time - start_time;
        double seconds = total_time/ 1000;
        double words = sentence.split(" ").length;
        double wpm = (words/seconds)*60;
        System.out.println("Total words per minutes :  " + wpm);
        System.out.println("Total time you take : "+seconds+" Seconds");
        if (sentence.equals(my_sentence)){
            System.out.println("You did a great job .your accurecy is 100%");

        }
        else System.out.println("Your accurecy is below 100%. But it's okay try again.");


    }
}
