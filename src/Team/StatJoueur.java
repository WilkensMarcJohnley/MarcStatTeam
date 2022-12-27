package Team;

public class StatJoueur extends StatEquipe{
	 
	 @Override
	public void majButsMarques(int nb_but) {
		nb_buts_marques+=nb_but;
		super.majButsMarques(nb_but);
	}
	 
	 @Override
	public void majCartonJaune() {
		nb_carton_jaune++;
		super.majCartonJaune();
	}
	 
	 @Override
	public void majCartonRouge() {
		nb_carton_rouge++;
		super.majCartonRouge();
	}
	 
	 @Override
	public void majButsEncaisses(int nb_buts) {
		nb_buts_encaisses+=nb_buts;
		super.majButsEncaisses(nb_buts);
	}
	 
	public void afficherStatJoueur() {
		afficherMatchsjoues();
		afficherMatchsGagnes();
		afficherMatchsNuls();
		afficherMatchsPerdus();
		afficherButsMarques();
		afficherButsEncaisses();
		afficherCartonJaune();
		afficherCartonRouge();
	}
	 
}
