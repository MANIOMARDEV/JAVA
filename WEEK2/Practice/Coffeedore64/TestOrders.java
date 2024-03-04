// Import necessary classes
import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {
        // Create a new instance of CoffeeKiosk
        CoffeeKiosk coff = new CoffeeKiosk();
        
        // Add menu items
        coff.addMenuItem("banana", 2.00);
        coff.addMenuItem("coffee", 1.50);
        coff.addMenuItem("latte", 4.50);
        coff.addMenuItem("cappuccino", 3.00);
        coff.addMenuItem("muffin", 4.00);
        
        // Create a new order
        coff.newOrder();
    }
}

