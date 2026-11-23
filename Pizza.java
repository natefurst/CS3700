public class Pizza {

    // attributes
    private String size;
    private String crust;
    private int toppings;

    // constructor
    public Pizza(String size, String crust, int toppings) {
        this.size = size;
        this.crust = crust;
        this.toppings = toppings;
    }

    // getters and setters
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getCrust() {
        return crust;
    }

    public int getToppings() {
        return toppings;
    }

    // adds one topping to the pizza
    public void addTopping() {
        toppings = toppings + 1;
    }

    // figures out the price
    // small = $8, medium = $10, large = $12, each topping is $1.50
    public double calculatePrice() {
        double price = 0;

        if (size.equals("Small")) {
            price = 8;
        } else if (size.equals("Medium")) {
            price = 10;
        } else if (size.equals("Large")) {
            price = 12;
        }

        price = price + (toppings * 1.50);
        return price;
    }

    // prints out the pizza info
    public void displayPizza() {
        System.out.println("Size: " + size);
        System.out.println("Crust: " + crust);
        System.out.println("Toppings: " + toppings);
        System.out.println("Price: $" + calculatePrice());
    }
}
