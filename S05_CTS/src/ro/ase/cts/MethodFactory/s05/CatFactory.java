package ro.ase.cts.MethodFactory.s05;

public class CatFactory implements AnimalFactory {
	public Animal createAnimal() {
		return new Cat();
	}
}