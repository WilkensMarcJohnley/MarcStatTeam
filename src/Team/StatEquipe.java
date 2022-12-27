package Team;

public class StatEquipe {
	protected int nb_match_joue=0;
	protected int nb_match_gagne=0;
	protected int nb_match_nul=0;
	protected int nb_match_perdu=0;
	protected int nb_buts_marques=0;
	protected int nb_buts_encaisses=0;
	protected int nb_carton_rouge=0;
	protected int nb_carton_jaune=0;
	
	public void majMatchJoue() {
		nb_match_joue++;
	}
	
	public void majMatchGagne() {
		nb_match_gagne++;
	}
	
	public void majMatchNul() {
		nb_match_nul++;
	}
	
	public void majMatchPerdu() {
		nb_match_perdu++;
	}
	
	public void majCartonJaune() {
		nb_carton_jaune++;
	}
	
	public void majCartonRouge() {
		nb_carton_rouge++;
	}
	
	public void majButsMarques(int nb_but) {
		nb_buts_marques+=nb_but;
	}
	
	public void majButsEncaisses(int nb_buts) {
		nb_buts_encaisses+=nb_buts;
	}
	
	public int diffDeBut() {
		return nb_buts_marques-nb_buts_encaisses;
	}
	
	public void afficherMatchsjoues() {
		System.out.println("Matchs joues: " + nb_match_joue);
	}
	
	public void afficherMatchsGagnes() {
		System.out.println("Matchs gagnes: " + nb_match_gagne);
	}
	
	public void afficherMatchsPerdus() {
		System.out.println("Matchs perdus: " + nb_match_perdu);
	}
	
	public void afficherMatchsNuls() {
		System.out.println("Matchs nuls: "+ nb_match_nul);
	}
	
	public void afficherButsEncaisses() {
		System.out.println("Buts encaisses: " + nb_buts_encaisses);
	}
	
	public void afficherButsMarques() {
		System.out.println("Buts marques: " + nb_buts_marques);
	}
	
	public void afficherCartonJaune() {
		System.out.println("Cartons jaunes: " + nb_carton_jaune);
	}
	
	public void afficherCartonRouge() {
		System.out.println("Cartons rouges: " + nb_carton_rouge);
	}
	
	public void afficherStatEquipe() {
		afficherMatchsjoues();
		afficherMatchsGagnes();
		afficherMatchsNuls();
		afficherMatchsPerdus();
		afficherButsMarques();
		afficherButsEncaisses();
		System.out.println("On a une difference de but de: "+ diffDeBut()+ " buts");
		afficherCartonJaune();
		afficherCartonRouge();
		
	}
	
}
