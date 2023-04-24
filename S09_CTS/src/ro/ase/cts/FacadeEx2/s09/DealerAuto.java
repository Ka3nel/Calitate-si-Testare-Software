package ro.ase.cts.FacadeEx2.s09;

public class DealerAuto {
	private MasinaFamilie masinaFamilie;
	private MasinaElectrica masinaElectrica;
	private MasinaSport masinaSport;
	
	public DealerAuto() {
		masinaFamilie = new MasinaFamilie("masina familie");
		masinaElectrica = new MasinaElectrica("masina electrica");
		masinaSport = new MasinaSport("masina sport");
	}
	
	public String descriereMasinaSport() {
		return masinaSport.descriere;
	}
	
	public String descriereMasinaFamilie() {
		return masinaFamilie.descriere;
	}
	
	public String descriereMasinaElectrica() {
		return masinaElectrica.descriere;
	}
}
