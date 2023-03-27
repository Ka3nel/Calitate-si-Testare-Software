package ro.ase.cts.abstractFactory.s05;

public class MacButton implements Button {

	public MacButton() {
		System.out.println("MacButton created!");
	}

	public void show() {
		System.out.println("This is a Mac Button");
	}

}
