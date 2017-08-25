package QuizTime;

import java.util.Scanner;


public class Quiz {
    Question geography = new Question();
    Scanner userInput = new Scanner(System.in);
    int amountOfQuestions = 4;

    public void questionAmount(){
        System.out.println("How many question would you like to ask?");
        amountOfQuestions = userInput.nextInt();
    }

    public void questionList(){
        questionAmount();
        for(int num=0;num<amountOfQuestions;num++) {
            geography.questions();
        }
        for(int num=0;num<amountOfQuestions;num++){

        }
        geography.questionPrint();
    }
}
