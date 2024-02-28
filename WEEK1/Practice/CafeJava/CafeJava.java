public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app.
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        // Menu variables
        double mochaPrice = 3.5;
        double dripCoffeePrice = 4.5;
        double latteCoffeePrice = 5;
        double cappuccinoPrice = 10;

        // Customer name variables
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;

        // APP INTERACTION SIMULATION
        System.out.println(generalGreeting + customer1 + pendingMessage);

        // Noah's order
        if (isReadyOrder4) {
            System.out.println(generalGreeting + customer4 + readyMessage + " and " + displayTotalMessage + cappuccinoPrice);
        } else {
            System.out.println(generalGreeting + customer4 + pendingMessage);
        }

        // Sam just ordered 2 lattes, display total
        System.out.println(generalGreeting + customer2 + " " + displayTotalMessage + latteCoffeePrice * 2);
        // Ternary operator to print the appropriate message
        System.out.println(isReadyOrder2 ? customer2 + readyMessage : "Sorry " + customer2 + pendingMessage);
        // Changing the isReady flag value from true to false
        isReadyOrder2 = false;
        System.out.println(isReadyOrder2 ? customer2 + readyMessage : "Sorry " + customer2 + pendingMessage);

        // Jimmy's order
        System.out.println(generalGreeting + customer3 + " " + displayTotalMessage + mochaPrice);
        // New calculated total
        System.out.println(generalGreeting + customer3 + " " + displayTotalMessage + (latteCoffeePrice - mochaPrice));

        // After changing prices and flags
        System.out.println("After changing prices and flags:");
        mochaPrice = 5.5;
        dripCoffeePrice = 2.5;
        latteCoffeePrice = 6;
        cappuccinoPrice = 8;

        isReadyOrder1 = true;
        isReadyOrder2 = false;
        isReadyOrder3 = true;
        isReadyOrder4 = false;

        System.out.println(generalGreeting + customer1 + pendingMessage);
        // Noah's order
        if (isReadyOrder4) {
            System.out.println(generalGreeting + customer4 + readyMessage + " and " + displayTotalMessage + cappuccinoPrice);
        } else {
            System.out.println(generalGreeting + customer4 + pendingMessage);
        }

        // Sam just ordered 2 lattes, display total
        System.out.println(generalGreeting + customer2 + " " + displayTotalMessage + latteCoffeePrice * 2);
        // Ternary operator to print the appropriate message
        System.out.println(isReadyOrder2 ? customer2 + readyMessage : "Sorry " + customer2 + pendingMessage);
        // Changing the isReady flag value from true to false
        isReadyOrder2 = true;
        System.out.println(isReadyOrder2 ? customer2 + readyMessage : "Sorry " + customer2 + pendingMessage);

        // Jimmy's order
        System.out.println(generalGreeting + customer3 + " " + displayTotalMessage + mochaPrice);
        // New calculated total
        System.out.println(generalGreeting + customer3 + " " + displayTotalMessage + (latteCoffeePrice - mochaPrice));
    }
}