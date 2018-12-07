import java.util.ArrayList;
import java.util.stream.*;

public class Pizza implements Food {
    private String name;
    private ArrayList<Ingredient> ingredient = new ArrayList<>();

    public Pizza(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        double totalPrice = 0;
        for (Ingredient ingredient: ingredient) {
            totalPrice += ingredient.getPrice();
        }
        return totalPrice;
    }

    public void addIngredient(Ingredient i){
        ingredient.add(i);
    }
}
