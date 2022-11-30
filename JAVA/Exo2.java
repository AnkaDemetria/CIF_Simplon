/*Exercice Initiation JAVA variable et condition
Un programme qui demande à l’utilisateur de saisir un nombre et qui affiche le double de ce nombre.*/

import java.util.Scanner;//chargement de l'outil Scanner pour prendre en charge les saisies clavier en Java
public class Exo2{ //Création d'une classe Java
    public static void main(String[] args) {
        Scanner nombre=new Scanner(System.in);
        //affichage d'un message à l'écran demandant à l'utilisateur de taper un nombre entier ou avec des chiffres après la virgule
                   System.out.println("Veuillez saisir un nombre : ");
                   double x=nombre.nextDouble();
                   double y=2.0*x;
                   System.out.println("le double de " + x +" est " + y);	
                    nombre.close();// ça fonctionne aussi sans cette ligne mais c'est mieux de la mettre pour fermer la commande utilisateur
            }
        }