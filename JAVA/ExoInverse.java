//Exo Un programme qui demande deux nombres à l’utilisateur et qui les affiche en sens inverse.

import java.util.Scanner;


public class ExoInverse {
    public static void main(String[] args) {
    System.out.println("Veuillez saisir le premier nombre :");
		Scanner nombre1=new Scanner(System.in);
		float x=nombre1.nextFloat();
		//affichage à l'écran d'un message demandant à l'utilisateur de taper le premier nombre
	System.out.println("Veuillez saisir le deuxième nombre :");
		Scanner nombre2=new Scanner(System.in);
		float y=nombre2.nextFloat();	
        //affichage à l'écran d'un message demandant à l'utilisateur de taper le 2eme nombre
    System.out.println("L'inverse des 2 nombres x et y est "+y+" "+x+"");}
}