package Team;

public enum Position {
	AT("Attaquant"),GB("Gardien de But"),DC("Defenseur central"),MT("Milieu de terrain");
	
	private String nom;

	private Position(String nom) {
		this.nom = nom;
	}
	
	public String toString() {
		return nom;
	}

	
}
