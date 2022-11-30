//Exo Un programme qui demande deux nombres à l’utilisateur et qui les affiche en sens inverse.

import java.util.Scanner;


public class Exo4 {
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

/*CORRECTION EXO INTERNET/ 
Ecrire un programme java qui permet d'échanger les valeurs de deux nombres saisies par l'utilisateur.

import java.util.Scanner;
public class EchangerDeuxNombres {
public static void main(String[] args) {
double x, y;
System.out.println("Saisissez la valeur de x :");
Scanner sc1=new Scanner(System.in);
x=sc1.nextDouble();
System.out.println("Saisissez la valeur de y :");
Scanner sc2=new Scanner(System.in);
y=sc2.nextDouble();
double z;
z=x;
x=y;
y=z;
System.out.println("La valeur de x est : "+x); 
System.out.println("La valeur de yest : "+y);
	}
} */