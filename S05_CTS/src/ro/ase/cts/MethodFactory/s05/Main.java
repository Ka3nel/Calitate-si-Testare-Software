package ro.ase.cts.MethodFactory.s05;

public class Main {

	public static void main(String[] args) {

		AnimalFactory af1, af2, af3;
		
		af1 = new DogFactory();
		af1.createAnimal();
		
		af2 = new CatFactory();
		af2.createAnimal();
		
		af3 = new ParrotFactory();
		af3.createAnimal();
	}
}
