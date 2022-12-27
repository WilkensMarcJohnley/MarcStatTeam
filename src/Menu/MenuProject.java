package Menu;

import Team.*;
import java.util.Scanner;



public class MenuProject {
	private static final Scanner console= new Scanner(System.in);
	
	//methode pour initialiser l'equipe avec ses stats a 0
	public static Equipe initialisationEquipe() {
		System.out.println("********Initialisation de l'equipe********");
		System.out.println("******************************************");
		System.out.println();
		
		StatEquipe stat=new StatEquipe();
		
		Equipe equipe;
		
		System.out.println("Entrez le nom de l'equipe: ");
		String nom_equipe= console.next();
		
		System.out.println("Entrez l'annee du debut de la saison: ");
		int saison= console.nextInt();
		
		System.out.println("Entrez le nom du coach principal de l'equipe: ");
		String coach= console.next();
		
		System.out.println("Entrez le nom du stade de l'equipe: ");
		String stade= console.next();
		
		System.out.println("Entrez le pays ou evolue l'equipe: ");
		String pays = console.next();
		
		equipe= new Equipe(nom_equipe,saison,coach,stade,stat,pays);
		
		return equipe;
		
	}
	
	//methode pour initialiser un joueur avec ses stats a 0
	public static Joueur initialisationJoueur() {
		System.out.println("********Initialisation d'un joueur********");
		System.out.println("******************************************");
		System.out.println();
		
		
		StatJoueur stat= new StatJoueur();
		
		Joueur joueur;
		System.out.println("Entrez le nom du joueur: ");
		String nom_joueur= console.next();
		
		System.out.println("Entrez l'age du joueur: ");
		int age= console.nextInt();
		
		System.out.println("Entrez la nationalite du joueur: ");
		String nationalite= console.next();
		
		System.out.println("Entrez la position du joueur (AT ou MT ou DC ou GB): ");
		String pos= console.next();
		Position position;
		switch (pos) {
			case "AT":	position=Position.AT;
						break;
						
			case "MT":	position=Position.MT;
						break;
				
			case "DC": position=Position.DC;
						break;
						
			default:	position=Position.GB;
						break;
		}
		
		System.out.println("Entrez le niveau du joueur (entre 0-100): ");
		int niveau= console.nextInt();
		
		System.out.println("Entrez le pied fort du joueur: ");
		String pied_fort= console.next();
		
		System.out.println("Entrez le salaire du joueur: ");
		int salaire= console.nextInt();
		
		joueur=new Joueur(nom_joueur,age,nationalite,stat,position,niveau,pied_fort,salaire);
		
		return joueur;
		
	}
	
	public static int trouverIndiceJoueur(Equipe equipe) {
		System.out.println("Entrez le nom du joueur");
		String nom=console.next();
		return equipe.estPresentJoueur(nom);
	}
	
	public static StatJoueur trouverStatJoueur(Equipe equipe) {
		int indice_1=trouverIndiceJoueur(equipe);
		if (indice_1>=0) {
			return (equipe.getJoueur()[indice_1]).getStatistiques();
		} else {
			return null;
		}
		
	}
	
	public static void mainMenu() {
		System.out.println("**************************MarcStatTeam************************");
		System.out.println("*************************MENU PRINCIPAL**********************");
		System.out.println("*************************************************************");
		System.out.println();
		
		System.out.println("Si c'est votre premiere utilisation du logiciel, veuillez initialiser l'equipe");
		System.out.println();
		
		Equipe equipe=initialisationEquipe();
		Joueur joueur=initialisationJoueur();
		equipe.ajouterJoueur(joueur);
		
		System.out.println("1.Afficher Infos & Stat de l'equipe");
		System.out.println("2.Ajout d'un joueur");
		System.out.println("3.Enlever joueur");
		System.out.println("4.Afficher Infos des joueurs");
		System.out.println("5.Afficher Stat des joueurs");
		System.out.println("6.Afficher Stat d'un joueur");
		System.out.println("7.Afficher Infos d'un joueur");
		System.out.println("8.Rechercher joueur");
		System.out.println("9.Mise a jour buts Marques d'un joueur");
		System.out.println("10.Mise a jour buts encaisses d'un joueur");
		System.out.println("11.Mise a jour carton jaune d'un joueur");
		System.out.println("12.Mise a jour carton rouge d'un joueur");
		System.out.println("13.Mise a jour match joue de l'equipe");
		System.out.println("14.Mise a jour match gagne de l'equipe");
		System.out.println("15.Mise a jour match nul de l'equipe");
		System.out.println("16.Mise a jour match perdu de l'equipe");
		System.out.println("17.Mise a jour match joue d'un joueur");
		System.out.println("18.Mise a jour match gagne d'un joueur");
		System.out.println("19.Mise a jour match nul d'un joueur");
		System.out.println("20.Mise a jour match perdu d'un joueur");
		System.out.println("0.Exit");
		
		System.out.println("Veuillez entrer un chiffre entre 0 et 20");
		
		int choix=console.nextInt();
		
		do {
			if (choix==1) {  equipe.afficherInfosEquipe();
			 equipe.afficherStat();
		}
			 
	else if (choix==2) { joueur=initialisationJoueur();
			equipe.ajouterJoueur(joueur);
			}
			
	else if (choix==3) { System.out.println("Entrez le nom du joueur: ");
	        String player=console.next();
			equipe.enleverJoueur(player);
			}
			
	else if (choix==4) { equipe.afficherInfosdeTouslesJoueurs();
				}
			
	else if (choix==5) { equipe.afficherStatdeTouslesJoueurs();
				}
			
	else if (choix==6) { int indice=trouverIndiceJoueur(equipe);
			Joueur[] tab_joueur=equipe.getJoueur();
			if (indice!=-1) {
				tab_joueur[indice].afficherStat();
			}
			}
			
	else if (choix==7) { System.out.println("Entrez le nom du joueur");
			String nom_1=console.next();
			equipe.rechercherJoueur(nom_1);
	       }
			
	else if(choix==8) { System.out.println("Entrez le nom du joueur");
			String nom_2=console.next();
			equipe.rechercherJoueur(nom_2);
			 }
			
	else if(choix==9){ StatJoueur stat_1=trouverStatJoueur(equipe);
			System.out.println("Entrez le nombre de buts marques du joueur");
			int nb_but=console.nextInt();
			if (stat_1!=null) {
				stat_1.majButsMarques(nb_but);
			}
			stat_1.majButsMarques(nb_but);
			 }
			
	else if(choix==10) { StatJoueur stat_2=trouverStatJoueur(equipe);
			 System.out.println("Entrez le nombre de buts encaisses du joueur");
			 int nb_but_1=console.nextInt();
			 if (stat_2!=null) {
				 stat_2.majButsEncaisses(nb_but_1);
				}
			 
			}
			 
	else if(choix==11) { StatJoueur stat_3=trouverStatJoueur(equipe);
			if (stat_3!=null) {
				stat_3.majCartonJaune();
				}
			  }
			 
	else if(choix==12) { StatJoueur stat_4=trouverStatJoueur(equipe);
				if (stat_4!=null) {
					stat_4.majCartonRouge();
					}
			  }
			 
	else if(choix==13) { (equipe.getStatistiques()).majMatchJoue();
				}
			 
	else if (choix==14) { (equipe.getStatistiques()).majMatchGagne();
			  }
			 
	else if(choix==15) { (equipe.getStatistiques()).majMatchNul();
			  }
			 
	else if(choix==16) { (equipe.getStatistiques()).majMatchPerdu();
			  }
			 
	else if(choix==17) { StatJoueur stat_5=trouverStatJoueur(equipe);
			if (stat_5!=null) {
				stat_5.majMatchJoue();
			}
		}
			 
	else if(choix==18) { StatJoueur stat_6=trouverStatJoueur(equipe);
				if (stat_6!=null) {
					stat_6.majMatchGagne();
				}
			  }
			 
	else if(choix==19) { StatJoueur stat_7=trouverStatJoueur(equipe);
				if (stat_7!=null) {
					stat_7.majMatchNul();
				}
			 
			  }
			 
else if(choix==20) { StatJoueur stat_8= trouverStatJoueur(equipe);
			 if (stat_8!=null) {
				 stat_8.majMatchPerdu();
			}
			 
			  }
			 
else {System.out.println("Fermeture du logiciel");
			  }
	
	System.out.println("Veuillez entrer un chiffre entre 0 et 20");
	choix=console.nextInt();
		} while (choix>0 && choix <21);
		
 }
	
	public static void main(String[] args) {
		mainMenu();
	}
	
	
}
