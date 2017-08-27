package QuizTime;

import java.util.HashMap;
import java.util.Scanner;

public class Question {
    HashMap<String,Integer> questionHolder  = new HashMap<>();
    Scanner userInput = new Scanner(System.in);
    String questionString = new String();
    int questionAnswer;
    int usersAnswer;

    public void addQuestion(){
        System.out.println("Add a question");
        questionString = userInput.nextLine();
        System.out.println("Enter an integer number for the answer");
        questionAnswer = userInput.nextInt();
        questionHolder.put(questionString, questionAnswer);
    }

    public void printQuestion() {
        for (String key : questionHolder.keySet()) {
            System.out.println(key);
        }
        usersAnswer = userInput.nextInt();
        for(int value : questionHolder.values()){
            if(usersAnswer == value ){
                System.out.println("Correct");
            }
            else{
                System.out.println("Incorrect");
            }
        }
    }

    public void runner(){
        addQuestion();
        printQuestion();
    }
}

