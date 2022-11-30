/*Ecrire un programme java qui demande à l’utilisateur de saisir un nombre entier 
et de lui afficher que le nombre est pair ou impair selon la valeur tapée.
Utiliser l'opérateur modulo %2 qui va donner le reste de la division par 2 */

import java.util.Scanner;

public class Exo5 {
    public static void main(String[] args)
    {

    System.out.println ("Veuillez saisir un nombre entier:   ");
    Scanner entier = new Scanner (System.in);
    int x =entier.nextInt ();

    //Operateur modulo % qui va permettre de récupérer le reste de la division par 2, pour savoir si l'entier est pair ou impair
    int r = x %2;
    if (r==0){
        System.out.println(" Le nombre que vous avez tapé est pair");
    }
    else {
        System.out.println (" Le nombre que vous avez tapé est impair");
    }
    entier.close();
    }
    
}




