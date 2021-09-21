package elements;

public class NonMetalElement extends Element {
    public NonMetalElement(String symbol, int atomicNumber, double atomicWeight) {
        super(symbol, atomicNumber, atomicWeight);
    }

    @Override
    public void describeElement() {
        System.out.println("Symbol: " + this.getSymbol());
        System.out.println("Atomic Number: " + this.getAtomicNumber());
        System.out.println("Atomic Weight: " + this.getAtomicWeight());
        System.out.println("Nonmetals are poor conductors of electricity");
    }
}
