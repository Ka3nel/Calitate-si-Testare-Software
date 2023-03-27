package ro.ase.cts.abstractFactory.s05;

public class Main {

	public static void main(String[] args) {
		GUIFactory guif1, guif2;
		
		guif1 = new WindowsGUIFactory();
		guif1.createButton();
		guif1.createMenu();
		
		guif2 = new MacGUIFactory();
		guif2.createButton();
		guif2.createMenu();
	}
}
