public class PizzaDemo {
    public static void main(String[] args) {

        // make two pizzas
        Pizza p1 = new Pizza("Large", "Thin", 2);
        Pizza p2 = new Pizza("Small", "Stuffed", 0);

        System.out.println("Pizza 1:");
        p1.displayPizza();

        System.out.println();
        System.out.println("Pizza 2:");
        p2.displayPizza();

        // add a topping and make pizza 2 bigger
        p2.addTopping();
        p2.setSize("Medium");

        System.out.println();
        System.out.println("Pizza 2 after changes:");
        p2.displayPizza();
    }
}
