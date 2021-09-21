package elements;

public class ElementArray {
    public static void main(String[] args) {
        MetalElement magnesium = new MetalElement("Mg", 12, 24.30d);
        MetalElement aluminum = new MetalElement("Al", 13, 26.98d);

        NonMetalElement hydrogen = new NonMetalElement("H", 1, 1.00d);
        NonMetalElement helium = new NonMetalElement("He", 2, 4.00d);

        System.out.println("----------------------");
        magnesium.describeElement();
        System.out.println("----------------------");
        aluminum.describeElement();
        System.out.println("----------------------");
        hydrogen.describeElement();
        System.out.println("----------------------");
        helium.describeElement();
        System.out.println("----------------------");
    }
}
