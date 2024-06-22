import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PizzaType {
    private String name;
    private String size;
    private String crustType;
    private List<String> toppings;
    private double price;

    // Constructor
    public PizzaType(String name, String size, String crustType, List<String> toppings, double price) {
        this.name = name;
        this.size = size;
        this.crustType = crustType;
        this.toppings = new ArrayList<>(toppings);
        this.price = price;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
        return new ArrayList<>(toppings);
    }

    public void setToppings(List<String> toppings) {
        this.toppings = new ArrayList<>(toppings);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Method to display pizza information
    public void displayInfo() {
        System.out.println("Pizza Name: " + name);
        System.out.println("Size: " + size);
        System.out.println("Crust Type: " + crustType);
        System.out.println("Toppings: " + String.join(", ", toppings));
        System.out.println("Price: $" + String.format("%.2f", price));
    }

    // Method to add a topping
[O    public void addTopping(String topping) {
        

