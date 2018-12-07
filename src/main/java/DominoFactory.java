public class DominoFactory implements AbstractFactory {
    /*public Pizza createMargherita() {
        return new Margherita();
    }
    public Pizza createProsciutto() {
        return new Prosciutto();
    }
    public Pizza createFruttiDiMare() {
        return new FruttiDiMare();
    }
    public Pizza createCarbonara() {
        return new Carbonara();
    }*/

    //DP Singleton
    private static DominoFactory dominoFactory = null;
    private static int stock[];

    public static DominoFactory getDominoFactory(){
        if (dominoFactory == null) {
            dominoFactory = new DominoFactory();
            stock = new int[4];
            for (int i = 0; i < 4; i++) {
                stock[i] = 2;
            }
        }
        return dominoFactory;
    }


    //DP Abstract Factory
    public Pizza createPizza(Pizza pizza){
        String name = pizza.getName();
        Pizza p;
        int i = 4;
        if (name == "Margherita") {
            i = 0;
        }
        if (name == "Prosciutto") {
            i = 1;
        }
        if (name == "Frutti di mare") {
            i = 2;
        }
        if (name == "Carbonara") {
            i = 3;
        }
        if (stock[i] > 0) {
            switch (i) {
                case 0 :
                    p = new Margherita();
                    stock[i]--;
                    break;
                case 1 :
                    p = new Prosciutto();
                    stock[i]--;
                    break;
                case 2 :
                    p = new FruttiDiMare();
                    stock[i]--;
                    break;
                case 3 :
                    p = new Carbonara();
                    stock[i]--;
                    break;
                default :
                    p = null;
            }
        }
        else {
            System.out.println("Cette pizza n'est plus en stock");
            p=null;
        }
        return p;
    }

}
