public class FruttiDiMare extends Pizza {
    public FruttiDiMare() {
        super("Frutti di mare");
        Dough dough = new Dough();
        TomatoSauce tomatoSauce = new TomatoSauce();
        Cheese cheese = new Cheese();
        Seafood seafood = new Seafood();
        this.addIngredient(dough);
        this.addIngredient(tomatoSauce);
        this.addIngredient(cheese);
        this.addIngredient(seafood);
    }

}
