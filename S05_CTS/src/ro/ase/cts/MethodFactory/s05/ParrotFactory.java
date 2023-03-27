package ro.ase.cts.MethodFactory.s05;

public class ParrotFactory implements AnimalFactory {
	public Animal createAnimal() {
		return new Parrot();
	}
}