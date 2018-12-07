public class Prosciutto extends Pizza {
    public Prosciutto() {
        super("Prosciutto");
        Dough dough = new Dough();
        TomatoSauce tomatoSauce = new TomatoSauce();
        Cheese cheese = new Cheese();
        Ham ham = new Ham();
        this.addIngredient(dough);
        this.addIngredient(tomatoSauce);
        this.addIngredient(cheese);
        this.addIngredient(ham);
    }
}
