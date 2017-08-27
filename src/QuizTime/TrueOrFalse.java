package QuizTime;

import java.util.HashMap;
import java.util.Scanner;

public class TrueOrFalse extends Question {
    HashMap<String,Integer> holderForQandA = new HashMap<>();
    Scanner userInput = new Scanner(System.in);
    int questionAnswer;


    public void addAnswer(){
        System.out.println("Enter 1 if True or 2 if False(Enter 1 or 2)");
        questionAnswer = userInput.nextInt();
        }
}
