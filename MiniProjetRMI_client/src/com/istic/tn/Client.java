package com.istic.tn;

import java.rmi.Naming;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		try {
			InterfaceVoitureTaxi ivt = (InterfaceVoitureTaxi) Naming.lookup("rmi://localhost:1099/VoitureTaxi");
			Scanner sc = new Scanner(System.in);
			System.out.println("Donner l'id");
			int id = sc.nextInt();
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Donner Marque");
			String marque = sc1.nextLine();
			System.out.println("Donner Couleur");
			String couleur = sc1.nextLine();
			System.out.println("Donner Prix");
			float prix = sc1.nextFloat();
			
			VoitureTaxi voiture = new VoitureTaxi(id,marque,couleur,prix);
			VoitureTaxi voiture2 = new VoitureTaxi(2,"marque","noir",12300);
			VoitureTaxi voiture3 = new VoitureTaxi(3,"marque2","rouge",14440);
			
			System.out.println(ivt.ajouterVoiture(voiture));
			System.out.println(ivt.ajouterVoiture(voiture2));
			System.out.println(ivt.ajouterVoiture(voiture3));
						
			System.out.println("Plus cher voiture(id): "+ivt.plusCher());
			
			System.out.println(ivt.verifTaxi(voiture));
			System.out.println(ivt.verifTaxi(voiture2));
			
			System.out.println("liste des marques: "+ivt.rechercheMarqueTaxi());
			
			
		}catch(Exception e) {
			System.out.println ("Erreur d’accès à l’objet distant");
			System.out.println (e.toString());
		}

	}

}
