package QuizTime;

import java.util.Scanner;

public class Quiz {
    TrueOrFalse director = new TrueOrFalse();
    Scanner userInput = new Scanner(System.in);
    String questionStatment = new String();
    int questionAmount; // loop through how many questions to create
    int questionType;


    public void quizCreate(){
        System.out.println("How many questions would you like to create? (Enter a number)");
        questionAmount = userInput.nextInt();
            // This will decide on what object to add a question to.
        for (int num=0;num<questionAmount;num++) {
            System.out.println("What type of question would you like to create? (Enter a number 1-3)");
            questionType = userInput.nextInt();

            while (questionType < 1 || questionType > 3) {
                System.out.println("Enter a number between 1-3");
                questionType = userInput.nextInt();
            }
            director.prompt();
        }
    }
}
