package ro.ase.cts.s04;

public class Server {
	int portNr = 0;
	String name = " ";
	private static Server instance = null;
	
	private Server() {
		this.portNr = 0;
		this.name = " ";
		Server.instance = this;
	}
	
	private Server(int port, String name) {
		this.portNr = port;
		this.name = name;
		Server.instance = this;
	}
	
	public static Server getInstance() {
		if(Server.instance == null) {
			Server.instance = new Server(8080, "server nou");
			return Server.instance;
		}
		else {
			return Server.instance;
		}
	}
	
	public String showStatus() {
		return "Serverul " + name + " ruleaza pe portul " + portNr;
	}
}
