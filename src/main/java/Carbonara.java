public class Carbonara extends Pizza {
    public Carbonara() {
        super("Carbonara");
        Dough dough = new Dough();
        WhiteCream whiteCream = new WhiteCream();
        Cheese cheese = new Cheese();
        Ham ham = new Ham();
        this.addIngredient(dough);
        this.addIngredient(whiteCream);
        this.addIngredient(cheese);
        this.addIngredient(ham);
    }
}
