package ro.ase.cts.abstractFactory.s05;

public class WindowsMenu implements Menu{
	
	public WindowsMenu() {
		System.out.println("WindwosMenu created!");
	}

	public void show() {
		System.out.println("This is a Windows Menu");
	}
}
