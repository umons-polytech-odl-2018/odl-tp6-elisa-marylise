public class Ingredient implements Food {
    //DP Composite
    private String name;
    private double price = 0;

    public Ingredient(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
