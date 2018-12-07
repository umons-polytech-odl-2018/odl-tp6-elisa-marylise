public class DominoFactory implements AbstractFactory {
    public Pizza createMargherita() {
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
    }
}
