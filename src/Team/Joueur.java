package Team;

public class Joueur {
	private String nom;
	private int age;
	private String nationalite;
	private StatJoueur statistiques;
	private Position position;
	private int niveau;     // note designant l'impact actuel du joueur sur une echelle de 0 a 100. 
	private String pied_fort;
	private int salaire; //par mois.
	
	public Joueur(String nom, int age, String nationalite, StatJoueur statistiques, Position position, int niveau,
			String pied_fort, int salaire) {
		
		this.nom = nom;
		this.age = age;
		this.nationalite = nationalite;
		this.statistiques = statistiques;
		this.position = position;
		this.niveau = niveau;
		this.pied_fort = pied_fort;
		this.salaire = salaire;
	} 	


	public StatJoueur getStatistiques() {
		return statistiques;
	}


	public String getNom() {
		return nom;
	}



	private void afficherNom() {
		System.out.println("Nom: " + nom);
	}
	
	private void afficherAge() {
		System.out.println("Age: " + age);
	}
	
	private void afficherNationalite() {
		System.out.println("Nationalite: " + nationalite);
	}
	
	private void afficherPosition() {
		System.out.println("Position: " + position);
	}
	
	private void afficherNiveau() {
		System.out.println("Niveau: " + niveau);
	}
	
	private void afficherPiedFort() {
		System.out.println("Pied fort: " + pied_fort);
	}
	
	private void afficherSalaire() {
		System.out.println("Salaire: " + salaire);
	}
	
	public void afficherInfosJoueur() {
		System.out.println("Informations du joueur "+ nom);
		afficherNom();
		afficherAge();
		afficherNationalite();
		afficherPosition();
		afficherNiveau();
		afficherPiedFort();
		afficherSalaire();
		System.out.println();
	}
	
	public void afficherStat() {
		System.out.println("Statistiques du joueur "+nom);
		statistiques.afficherStatJoueur();
		System.out.println();
	}
}
