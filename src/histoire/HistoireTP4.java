package histoire;

import personnages.Humain;

public class HistoireTP4 {


	public static void main(String[] args) {
		Humain moi = new Humain("Ludovic","garpacho",54);
		moi.direBonjour();
		moi.acheter("une boisson", 12);
		moi.boire();
		moi.acheter("un jeu", 2);
		moi.acheter("un kimono", 50);
	}
}