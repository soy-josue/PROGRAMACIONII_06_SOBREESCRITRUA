package umg.gt.actividades06;

public class Dog2 extends Dog {
	private double portion;

	public double getPortion() {
		return portion;
	}

	public void setPortion(double portion) {
		this.portion = portion;
	}

	@Override
	public void printToConsole() {
		super.printToConsole();
		System.out.println(" portion: " + this.portion);
	}
}