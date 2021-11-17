import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class Prom {

    /* In order to purchase a ticket to go to prom,
    you must be a Junior or Senior, have no disciplinary
    records and have $40 to pay for it.
     */

    public static void main(String[] args) {
        int grade = Integer.parseInt(JOptionPane.showInputDialog("what grade you in?"));
        int diss = Integer.parseInt(JOptionPane.showInputDialog("How many suspensions you have"));
        int money = Integer.parseInt(JOptionPane.showInputDialog("How much money no decimals or else"));


        
        if (grade>=11) {

            if(diss >=1){
                System.out.println("You cant go");
            }else{
                if(money>=40){
                    System.out.println("you can go bro.");
                }else{
                    System.out.println("you cant go lol broke boy");
                }

            }
        }else{
            System.out.println("you cant go to prom");
        }
    }
}
