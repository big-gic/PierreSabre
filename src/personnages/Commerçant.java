package personnages;

public class Commer�ant extends Humain{
	
	public Commer�ant(String nom, int argent) {
		super(nom, "th�", argent);
	}
	
	public int seFaireExtorquer() {
		perdreArgent(getArgent());
		parler("Damn ! Quelqu'un m'a tout vol�. Le monde est vraiment trop injuste, c'est dingue.");
		return getArgent();
	}
	
	public void recevoir(int argent) {
		gagnerArgent(argent);
		parler("Sacrebleu ! "+argent+" sous !!! Merci mon brave.");
	}
}
