package personnages;

public class Humain {
	private String nom;
	private String boissonPref;
	private int argent;
	
	public Humain(String nom, String boissonPref, int argent) {
		this.nom = nom;
		this.boissonPref = boissonPref;
		this.argent = argent;
	}
	
	public int getArgent() {
		return argent;
	}
	
	public void parler(String texte) {
		System.out.println("("+nom + ") - " + texte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m�appelle "+nom+" et j�aime boire du "+boissonPref);
	}
	
	public void boire() {
		parler("MIAM MIAM, un bon verre de "+boissonPref+"! GLOUPS! BURP");
	}
	
	public void acheter(String bien, int prix) {
		if (prix<argent) {
			parler("J'ai "+argent+" sous en poche. Je vais pouvoir m'offrir "+bien+" � "+prix+" sous");
			perdreArgent(prix);
		}else {
			parler("Je n'ai plus que "+argent+" sous en poche. Je ne peux m�me pas m'offrir "+bien+" � " + 
					prix+" sous. La desh");
		}
	}
	
	public void gagnerArgent(int gain) {
		argent = argent+gain;
	}
	
	public void perdreArgent(int perte) {
		argent = argent-perte;
	}
}
