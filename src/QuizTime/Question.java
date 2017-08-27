package QuizTime;

import java.util.Scanner;

public class Question {
    Scanner userInput = new Scanner(System.in);
    String questionString = new String();
    int questionAnswer;

    // Takes in the user input from the quiz class to dictate which method to run

    public void prompt(){
        System.out.println("What is the question?");
        questionString = userInput.nextLine();
    }
}

