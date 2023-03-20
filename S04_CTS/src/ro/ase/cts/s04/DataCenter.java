package ro.ase.cts.s04;

public class DataCenter {
	public Server sistem;
	
	public Masina[]masini;
	
	public void AdaugareMasina(Masina m) {
		if (sistem.getInstance() != null) {
			masini.add(m);
		}
	}
	
	public void ModificareMasina(int pozitie, Masina m) {
		if (sistem.getInstance() != null) {
			masini[pozitie] = m;
		}
	}
}
