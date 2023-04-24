package ro.ase.cts.FacadeEx2.s09;

public class MasinaSport implements Automobil {
	String descriere;
	
	public MasinaSport(String descriere) {
		this.descriere = descriere;
	}

	@Override
	public String descriere() {
		return descriere;
	}
}