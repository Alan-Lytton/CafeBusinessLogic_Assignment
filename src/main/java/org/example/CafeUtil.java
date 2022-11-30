package org.example;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * A util for cafe ordering and management.
 *
 * @since 11/29/2022
 * @author alanlytton
 */
public class CafeUtil {
    /**
     * Calculating cumulative weeks of orders
     *
     * @param numWeeks number of weeks provided by admin for single user's orders
     * @return the final sum of the weeks a single user has ordered
     */
    public int getStreakGoal(int numWeeks){
        int sumValue = 0;
        for (int i=0; i <= numWeeks; i++){
            sumValue += i;
        }
        return sumValue;
    }
    public double getOrderTotal(double[] prices){
        double total = 0.0;
        for (double price : prices) {
            total += price;
        }
        return total;
    }
    public void displayMenu(ArrayList<String> menuItems){
        String menuItem = "";
        for (int i = 0; i < menuItems.size(); i++){
            menuItem = menuItems.get(i);
            System.out.println(i + " " + menuItem);
        }
    }
    public void addCustomer(ArrayList<String> customers){
        String userName = System.console().readLine("Please enter your name:");
        System.out.printf("Hello, %s!\n",userName);
        System.out.printf("There are %s people in front of you\n", customers.size());
        customers.add(userName);
        System.out.println(customers);
    }
}
