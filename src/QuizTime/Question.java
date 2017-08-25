package QuizTime;

import java.util.ArrayList;
import java.util.Scanner;

public class Question {

    Scanner userInput = new Scanner(System.in);
    ArrayList<String> questionStatement = new ArrayList<String>();
    public boolean correct;


    public void questions(){
        System.out.println("What is the question");
        String usersStatement = userInput.nextLine();
        questionStatement.add(usersStatement);
    }

    public void questionPrint(){
        for (int num=0;num<questionStatement.size();num++){
            System.out.println(questionStatement.get(num));
        }
    }
}

