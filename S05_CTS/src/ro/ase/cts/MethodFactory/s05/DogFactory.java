package ro.ase.cts.MethodFactory.s05;

public class DogFactory implements AnimalFactory {
	public Animal createAnimal() {
		return new Dog();
	}
}