/*Exercices Initiation JAVA variable et condition
Un programme qui demande deux nombres à l’utilisateur et qui affiche le maximum des deux.*/

import java.util.Scanner;
public class Exo3 {
		public static void main(String[] args) {
	//affichage à l'écran d'un message demandant à l'utilisateur de taper le premier nombre
		System.out.println("Veuillez saisir le premier nombre :");
	//récupération de la saisie clavier à l'aide de la classe Scanner
		Scanner sc1=new Scanner(System.in);//on peut appeler la classe sc1 ou nombre1 ou ce qu'on veut
		float x=sc1.nextFloat();// je récupère la valeur saisie sur la variable de type float avec la méthode nextFloat
		//affichage à l'écran d'un message demandant à l'utilisateur de taper le premier nombre
			System.out.println("Veuillez saisir le 2 ème nombre :");
			//récupération de la saisie clavier à l'aide de la classe Scanner
			Scanner sc2=new Scanner(System.in);
			float y=sc2.nextFloat();		
//comparaison des deux nombres
		if(x<=y){
System.out.println("Le maximum des deux nombres "+x+" et "+y+" est égale à  " + y);//concaténation de y qui devient "+y"
		}
	else{ 
        System.out.println("Le maximum des deux nombres "+x+" et "+y+" est égale à  " + x);		//pour indiquer valeur de x:"+x+"
		}
		sc1.close() ; 
		sc2.close(); 
			}
		}