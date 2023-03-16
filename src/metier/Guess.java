package metier;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import model.Dictionnaire;

public class Guess {

	private Map<Integer, Dictionnaire> mapMots = new HashMap<Integer, Dictionnaire>();
	
	//TO-DO
	public void initData() {
		Dictionnaire d;
		Scanner sc = new Scanner(System.in);
		for(int i = 1; i<4; i++) {
			System.out.println("Entrer le mot "+i);			
			String mot = sc.next();
			sc.nextLine();
			System.out.println("Entrer la definition du mot "+i);
			String def = sc.nextLine();
			d = new Dictionnaire(mot,def);
			this.mapMots.put(i, d);
		}
		System.out.println(this.mapMots.toString());
	}
	
	//TO-DO
	public int random() {
		return (int) ((Math.random()*10) % this.mapMots.size()) + 1;
	}
	
	public void affiche(char[] tab) {
		for(char st: tab)
			System.out.print(st+"-");
		System.out.println();
	}
	
	public void GuessWord() {
		int p = random();
		System.out.println("p = "+p);
		Dictionnaire d = this.mapMots.get(p);
		String mot = d.getMot();
		char[] test = new char[mot.length()];
		for(int i=0; i < test.length; i++)
			test[i]='*';
		affiche(test);
		int j = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Devine le mot");
		while (j < mot.length()) {
			System.out.println("Entre une lettre du mot");
			char lettre = s.next().charAt(0);
			int pos = mot.indexOf(lettre);
			if(pos != -1) {
				System.out.print("Bien, continue : ");
				test[pos] = lettre;
			}
				
			else 
				System.out.print("Essai encore : ");
			affiche(test);
			j++;
		}
		System.out.println();
		System.out.println("Fin du jeu");
		System.out.println(d.toString());
	}
}
