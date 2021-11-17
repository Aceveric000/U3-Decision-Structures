import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class ShippingCosts {

    /*
    A Shipping Company charges the following rates
    for each 100 miles shipped:

    2lbs or less ..................... $1.10
    over 2lbs but less than 6lbs ..... $2.20
    over 6lbs but less than 10lbs .... $3.70
    over 10lbs ....................... $4.80

    Write a program to calculate the shipping price. The
    distance is not prorated, in other words, the price doesn't
    increase until the next 100 miles, i.e. 150 miles for a 3lbs
    package is still just $2.20.

    Example Run:
    Weight: 5.6lbs
    Distance: 345 miles
    Price: $6.60

    As always, your program should include a method.


     */
    public static void main(String[] args) {

        double weight = 5.6;
        Double.parseDouble(JOptionPane.showInputDialog("wight?"));
        int milesShipped = 345;
        Integer.parseInt(JOptionPane.showInputDialog("miles?"));
        double shippingRate = 0;
        double cost;

        if (weight >= 10) {
            shippingRate = 4.80;
        } else {
            if (weight >= 6) {
                shippingRate = 3.70;
            } else {
                if (weight >= 3) {
                    shippingRate = 1.10;
                }
            }
        }
        cost = cost(shippingRate, milesShipped);
        JOptionPane.showMessageDialog(null, "cost is " + cost);

    }
        private static double cost ( double shippingRate, int milesShipped){
            int costMult = milesShipped / 100 + 1;
            if (costMult == 0)
                costMult = 1;
            return shippingRate * costMult;
        }
    }


