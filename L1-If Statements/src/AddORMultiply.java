import javax.swing.*;

import static com.sun.javafx.fxml.expression.Expression.multiply;

public class AddORMultiply {

    /*
    Write two methods, one that adds two numbers and second that multiplies them.
    Then, write a main method that prompts the user to enter 2 numbers.

    If the first one is larger than the second, mutiply and display the result
    If not, add them and display the results.
     */


    public static void main(String[] args) {
        double numinput = Double.parseDouble(JOptionPane.showInputDialog("Put a num in"));
        double numinputTwo = Double.parseDouble(JOptionPane.showInputDialog("Put a num in"));
            double result = 0;

        if(numinput > numinputTwo){
            result = times(numinput,numinputTwo);
        }
        if (numinput<=numinputTwo){
            result = add(numinput,numinputTwo);
        }
        JOptionPane.showInputDialog(null, "The result is " + result);

    }


    public static double add (double num1, double num2){
        return num1+num2;
    }
    public static double times (double num1, double num2){
        return num1 * num2;
    }
}



