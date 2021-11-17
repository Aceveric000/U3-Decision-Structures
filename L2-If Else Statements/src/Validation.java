import javax.swing.*;

public class Validation {

    /*
    Let's create a simple program that validates
    a user's input.

    Let's say a user must enter a number greater than 10.
     */


    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("put num greater then 10"));

        if (num>10){
            JOptionPane.showMessageDialog(null,"YOU DID IT");
        }else{
            JOptionPane.showMessageDialog(null, "Num is not greaTER THEN 10");
        }
    }
}
