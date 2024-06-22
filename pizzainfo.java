import java.util.List;

public class PizzaInfo {

    private String size;
    private String crustType;
    private List<String> toppings;
    private double price;

    // Constructor
    public PizzaInfo(String size, String crustType, List<String> toppings, double price) {
        this.size = size;
        this.crustType = crustType;
        this.toppings = toppings;
        this.price = price;
    }

    // Getter and Setter methods
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getCrustType() {
        return crustType;
    }

    public void setCrustType(String crustType) {
        this.crustType = crustType;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Method to display pizza information
    public void displayInfo() {
        System.out.println("Pizza Size: " + size);
        System.out.println("Crust Type: " + crustType);
        System.out.println("Toppings: " + String.join(", ", toppings));
        System.out.println("Price: $" + price);
    }

    // Method to add a topping
    public void addTopping(String topping) {
        this.toppings.add(topping);
        System.out.println("Topping '" + topping + "' added.");
    }

    // Method to remove a topping
    public void removeTopping(String topping) {
        if (this.toppings.contains(topping)) {
            this.toppings.remove(topping);
            System.out.println("Topping '" + topping + "' removed.");
        } else {
            System.out.println("Topping '" + topping + "' not found.");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        List<String> initialToppings = new ArrayList<>();
        initialToppings.add("Cheese");
        initialToppings.add("Pepperoni");

        PizzaInfo pizza = new PizzaInfo("Large", "Thin Crust", initialToppings, 15.99);
        pizza.displayInfo();

        pizza.addTopping("Mushrooms");
        pizza.displayInfo();

        pizza.removeTopping("Pepperoni");
        pizza.displayInfo();
    }
}
==============================================================================
