import javax.swing.*;
import java.util.Random;

public class QuizGame {

    static int usersAnswers, correctAnswers;
    static String displayProblem = "";

    public static void main(String[] args) {
        createProblem();
        getUserAnswer();
        checkAnswer();
    }
    public static void showResults(){
        JOptionPane.showMessageDialog(null, displayProblem);
    }

    public static void checkAnswer(){
        if (usersAnswers == correctAnswers){
            displayProblem = "YOUR CORRECT";
        }else{
            displayProblem = "YOUR DUMB TRY AGAIN";
        }
        showResults();
    }
    public static void getUserAnswer(){
        usersAnswers = input(displayProblem);
    }

    public static void createProblem() {
        int choice = input("Choose \nAdd(1)  \nSub(2) or \nMult(3) \ndivide(4)");

        if (choice <= 4){
            if(choice >=1){
                if (choice ==1){
                    addProblem();
                }
                if(choice ==2 ){
                    subProblem();
                }
                if(choice == 3){
                  MulProblem();
                }
                if (choice ==4){
                    divideProblem();
                }
            }else{
                JOptionPane.showMessageDialog(null,"Invalid");
                System.exit(0);
            }

    }else{
        JOptionPane.showMessageDialog(null, "Invalid");
    }

}
    public static void addProblem(){
        int number1 = randomNum();
        int number2 = randomNum();


        correctAnswers = number1 + number2;

        displayProblem = number1 + " + " + number2;
    }

    public static void subProblem() {
        int number1 = randomNum();
        int number2 = randomNum();


        correctAnswers = number1 + number2;

        displayProblem = number1 + " - " + number2;
    }
    public static void MulProblem() {
        int number1 = randomNum();
        int number2 = randomNum();


        correctAnswers = number1 + number2;

        displayProblem = number1 + " X " + number2;
    }
    public static void divideProblem() {
        int number1 = randomNum();
        int number2 = randomNum();


        correctAnswers = number1 / number2;

        displayProblem = number1 + " / " + number2;
    }
    public static int randomNum(){
        Random random = new Random();
        return random.nextInt(20)+ 1;
    }
        public static int input(String message){
        return Integer.parseInt(JOptionPane.showInputDialog(message));
        }
}

