package Ch12;

public class P399 {
	public static void main(String[] args) {
	GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
	powderPrinter.setMaterial(new Powder());
	powderPrinter.printing();
	
	GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
	plasticPrinter.setMaterial(new Plastic());
	plasticPrinter.printing();
	
}
}
