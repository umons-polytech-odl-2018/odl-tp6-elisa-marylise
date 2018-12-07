public class HutFactory implements AbstractFactory {
    public Pizza createMargherita() {
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
    }
}
