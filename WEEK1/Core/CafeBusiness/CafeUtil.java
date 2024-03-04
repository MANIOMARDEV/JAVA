import java.util.ArrayList;
import java.util.Scanner;

public class CafeUtil {

    public int calculateStreakGoal() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        return sum;
    }

    // Ninja Bonus:
    public int calculateStreakGoal(int numWeeks) {
        int sum = 0;
        for (int i = 1; i <= numWeeks; i++) {
            sum += i;
        }
        return sum;
    }

    /* Given an array of item prices from an order, sum all of the prices in the array and return the total.
     */
    public double getOrderTotal(double[] prices) {
        double sum = 0;
        for (double price : prices) {
            sum += price;
        }
        return sum;
    }

    public void displayMenu(ArrayList<String> menuItems) {
        for (int count = 0; count < menuItems.size(); count++) {
            String message = (count + 1) + " " + menuItems.get(count); // Adjust index to start from 1
            System.out.println(message);
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");

        try (Scanner scanner = new Scanner(System.in)) {
            String userName = scanner.nextLine();

            printGreetingAndQueuePosition(userName, customers.size());

            customers.add(userName);

            printCustomerList(customers);
        }
    }

    private void printGreetingAndQueuePosition(String userName, int queueSize) {
        System.out.printf("Hello, %s%n", userName);
        System.out.printf("There are %d people in front of you%n", queueSize);
    }

    private void printCustomerList(ArrayList<String> customers) {
        System.out.println("Order ------  Customer Name%");
        for (int count = 0; count < customers.size(); count++) {
            System.out.printf("%d ------ %s%n", count + 1, customers.get(count));
        }
        System.out.println("------------------------");
    }
}

