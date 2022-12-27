package Testeur_Classe;
import Team.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class Test_partiel {
	private static final Scanner console= new Scanner(System.in);
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	private static String inputOutput(String message) {
        System.out.println(message);
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String returnString = "";
	    try {
	        returnString = br.readLine();
	    }
	    catch (IOException e){
	        System.out.println("Error reading in value");
	        //mainMenu();
	    }
	    return returnString;
    }
	
	public static void main(String[] args) {
		StatEquipe stat;
		stat=new StatEquipe();
		Equipe equipe;
		equipe=new Equipe("Real",2022,"Ancelloti","Bernabeu",stat,"Espagne");
		//equipe.afficherInfosEquipe();
		//equipe.afficherStat();
		
		StatJoueur stat_joueur=new StatJoueur();
		Joueur joueur;
		joueur= new Joueur("John",20,"Haitienne",stat_joueur,Position.AT,75,"gauche",75000);
		//joueur.afficherInfosJoueur();
		//joueur.afficherStat();
		
		equipe.rechercherJoueur("John");
		equipe.ajouterJoueur(joueur);
		String player;
		player= inputOutput("Entrez le message");
		//System.out.println(player);
		equipe.rechercherJoueur(player);
		//equipe.afficherInfosEquipe();
		//equipe.enleverJoueur("John");
		//equipe.afficherInfosEquipe();
		
		equipe.rechercherJoueur("John");
	}
}
