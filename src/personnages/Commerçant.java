package personnages;

public class Commerçant extends Humain{
	
	public Commerçant(String nom, int argent) {
		super(nom, "thé", argent);
	}
	
	public int seFaireExtorquer() {
		perdreArgent(getArgent());
		parler("Damn ! Quelqu'un m'a tout volé. Le monde est vraiment trop injuste, c'est dingue.");
		return getArgent();
	}
	
	public void recevoir(int argent) {
		gagnerArgent(argent);
		parler("Sacrebleu ! "+argent+" sous !!! Merci mon brave.");
	}
}
