package Team;

public class Equipe {
	private String nom;
	private int saison; // annee de debut;
	private Joueur[] joueur= new Joueur [50];
	private int nb_joueur=0;
	private String stade;
	private StatEquipe statistiques;
	private String coach;
	private String pays;
	
	
	public Equipe(String nom, int saison, String coach, String stade,
			StatEquipe statistiques,String pays) {
		
		this.nom = nom;
		this.saison = saison;
		this.coach = coach;
		this.stade = stade;
		this.statistiques = statistiques;
		this.pays=pays;
	}

	public String getNom() {
		return nom;
	}

	public String getStade() {
		return stade;
	}
	
	public StatEquipe getStatistiques() {
		return statistiques;
	}

	public Joueur[] getJoueur() {
		return joueur;
	}
	
	private void afficherNom() {
		System.out.println("Nom: " + nom);
	}
	
	private void afficherSaison() {
		System.out.println("Saison: " + saison);
	}
	
	private void afficherCoach() {
		System.out.println("Coach: " + coach);
	}
	
	private void afficherStade() {
		System.out.println("Stade: " + stade);
	}
	
	private void afficherEffectif() {
		System.out.println("Effectif: " + nb_joueur);
	}
	
	private void afficherPays() {
		System.out.println("Pays: " + pays);
	}
	
	
	
	public void afficherInfosEquipe() {
		System.out.println("Information de l'equipe");
		afficherNom();
		afficherSaison();
		afficherCoach();
		afficherStade();
		afficherEffectif();
		afficherPays();
		System.out.println();
		
	}
	
	public int estPresentJoueur(String nom_joueur) { //verifier si un joueur est present dans l'equipe
		for (int i = 0; i < nb_joueur; i++) {
			if (joueur[i].getNom()==nom_joueur) {
				return i; //retourne l'indice du joueur s'il est present ou -1 il ne l'est pas.
			}
		}
		return -1;
	}
	
	

	public void rechercherJoueur(String nom_joueur) {
		int indice=estPresentJoueur(nom_joueur);
		if (indice>=0) {
			joueur[indice].afficherInfosJoueur();
		} else {
			System.out.println("Ce joueur ne fait pas parti de l'equipe.");
		}
	}
	
	public void ajouterJoueur(Joueur player) {
		assert nb_joueur<50;
		joueur[nb_joueur]=player;
		nb_joueur++;
	}
	
	public void enleverJoueur(String player) {
		assert nb_joueur>0;
		int indice=estPresentJoueur(player);
		assert indice>=0;
		joueur[indice]=joueur[nb_joueur-1];
		joueur[nb_joueur-1]=null;
		nb_joueur--;
		
	}
	
	public void afficherInfosdeTouslesJoueurs() {
		for (int i = 0; i < nb_joueur; i++) {
			joueur[i].afficherInfosJoueur();
		}
	}
	
	public void afficherStatdeTouslesJoueurs() {
		for (int i = 0; i < nb_joueur; i++) {
			joueur[i].afficherStat();
		}
	}
	
	public void afficherStat() {
		System.out.println("Statistiques de l'equipe");
		statistiques.afficherStatEquipe();
		System.out.println();
	}
	
}
