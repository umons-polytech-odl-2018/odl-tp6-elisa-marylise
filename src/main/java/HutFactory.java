public class HutFactory implements AbstractFactory {
    /*public Pizza createMargherita() {
        return new MargheritaHut();
    }
    public Pizza createProsciutto() {
        return new ProsciuttoHut();
    }
    public Pizza createFruttiDiMare() {
        return new FruttiDiMareHut();
    }
    public Pizza createCarbonara() {
        return new CarbonaraHut();
    }*/


    //DP Singleton
    private static HutFactory hutFactory = null;
    private static int stock[];

    public static HutFactory getHutFactory() {
        if (hutFactory == null) {
            hutFactory = new HutFactory();
            stock = new int[4];
            for(int i = 0; i < 4 ; i++) {
                stock[i] = 2;
            }
        }
        return hutFactory;
    }

    // DP Abstract Factory
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
                    p = new MargheritaHut();
                    stock[i]--;
                    break;
                case 1 :
                    p = new ProsciuttoHut();
                    stock[i]--;
                    break;
                case 2 :
                    p = new FruttiDiMareHut();
                    stock[i]--;
                    break;
                case 3 :
                    p = new CarbonaraHut();
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
