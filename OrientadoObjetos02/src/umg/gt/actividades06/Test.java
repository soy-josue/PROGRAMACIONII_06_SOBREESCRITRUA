package umg.gt.actividades06;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog2[] dogs = insertDog();
		printDogsOnConsole(dogs);
		feed(dogs);
		System.out.println("After eating------------");
		printDogsOnConsole(dogs);

	}

	private static void feed(Dog2[] dogs) {
		for (int i = 0; i < dogs.length; i++) {
			double weightBeforefeeding = dogs[i].getWeight();
			dogs[i].setWeight(weightBeforefeeding + dogs[i].getPortion());
		}

	}

	private static void printDogsOnConsole(Dog2[] dogs) {
		for (int i = 0; i < dogs.length; i++) {
			dogs[i].printToConsole();
		}

	}

	private static Dog2[] insertDog() {

		Dog2[] dogs = new Dog2[4];

		// list of Dogs
		String[] names = { "Coco", "Sultan", "Boby", "Zuma" };
		String[] colours = { "cafe", "negro", "gris", "azul" };
		double[] weight = { 1.5, 75, 3.5, 45.1 };
		double[] portion = { 0.2, 1, 0.2, 0.8 };

		for (int i = 0; i < dogs.length; i++) {
			Dog2 dog = new Dog2();
			dog.setName(names[i]);
			dog.setColour(colours[i]);
			dog.setWeight(weight[i]);
			dog.setPortion(portion[i]);
			dogs[i] = dog;

		}
		return dogs;
	}
}
