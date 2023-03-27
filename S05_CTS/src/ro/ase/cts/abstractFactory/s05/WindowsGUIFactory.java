package ro.ase.cts.abstractFactory.s05;

public class WindowsGUIFactory implements GUIFactory{

	@Override
	public Button createButton() {
		return new WindowsButton();
	}

	@Override
	public Menu createMenu() {
		return new WindowsMenu();
	}

}
