public class Margherita extends Pizza {
    public Margherita() {
        super("Margherita");
        Dough dough = new Dough();
        TomatoSauce tomatoSauce = new TomatoSauce();
        Cheese cheese = new Cheese();
        this.addIngredient(dough);
        this.addIngredient(tomatoSauce);
        this.addIngredient(cheese);
    }
}
