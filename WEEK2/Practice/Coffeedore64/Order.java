import java.util.ArrayList;

public class Order {

    // MEMBER VARIABLES
    private String name; // default value of null
    private boolean ready; // default value false
    private ArrayList<Item> items; // defaults to null

    // CONSTRUCTOR
    // No arguments, sets name to "Guest", initializes items as an empty list.
    public Order() {
        name = "Guest";
        items = new ArrayList<>();
    }

    // OVERLOADED CONSTRUCTOR
    // Takes a name as an argument, sets name to this custom name.
    // Initializes items as an empty list.
    public Order(String name) {
        this.name = name;
        this.items = new ArrayList<>();
    }

    // GETTERS & SETTERS
    // getter for name
    public String getName() {
        return name;
    }

    // setter for name
    public void setName(String name) {
        this.name = name;
    }

    // getter for ready
    public boolean isReady() {
        return ready;
    }

    // setter for ready
    public void setReady(boolean ready) {
        this.ready = ready;
    }

    // Getter for items ArrayList
    public ArrayList<Item> getItems() {
        return items;
    }

    // Setter for items ArrayList
    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    // Method to add an item to the order
    public void addItem(Item item) {
        items.add(item);
    }

    // Method to get status message of the order
    public String getStatusMessage() {
        if (this.ready) {
            return "Your order is ready";
        } else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }

    // Method to calculate the total price of the order
    public double getOrderTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    // Method to display order details
    public void display() {
        System.out.println("Customer Name: " + this.name);

        for (Item item : items) {
            System.out.println(item.getName() + " $" + item.getPrice());
        }
        System.out.println("Total: $" + this.getOrderTotal());
    }
}


