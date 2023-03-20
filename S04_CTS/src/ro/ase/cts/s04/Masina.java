package ro.ase.cts.s04;

public class Masina {
	public double lungime;
	public double greutate;
	public double pret;
	public String nume;
	
	public Masina() {
		this.lungime = 0;
		this.greutate = 0;
		this.pret = 0;
		this.nume = "";
	}
	
	public Masina(double lungime, double greutate, double pret, String nume) {
		this.lungime = lungime;
		this.greutate = greutate;
		this.pret = pret;
		this.nume = nume;
	}
	
	public Masina(Masina m) {
		this.lungime = m.lungime;
		this.greutate = m.greutate;
		this.pret = m.greutate;
		this.nume = m.nume;
	}
	
}
