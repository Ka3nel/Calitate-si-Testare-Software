package ro.ase.cts.abstractFactory.s05;

public class WindowsButton implements Button {
	
	public WindowsButton() {
		System.out.println("WindwosButton created!");
	}

	public void show() {
		System.out.println("This is a Windows Button");
	}
}
