package demo;

import java.util.Scanner;

public class Vezba {

	public static void main(String[] args) {
		
		String film = "Hari : Kamen";
		
		String reg = "[a-zA-z]";
		String skriveniFilm = film.replaceAll(reg, "_");
		
		String skriveni[] = skriveniFilm.split("");
		for(int i = 0; i < skriveni.length; i++) {
			System.out.print(skriveni[i] + " ");
		}
		System.out.println();
		
		int brojSlova = 0;
		char slovo1; 
		for(int i = 0; i < film.length(); i ++) {
			slovo1 = film.charAt(i);
			if(slovo1 != ':' && slovo1 !=' ' && slovo1 !=',' && slovo1 !='-') {
				brojSlova++;
			}
		}
		System.out.println("Broj slova " + brojSlova);
		
		boolean prikaz = true;
		
		do {
			Scanner unos = new Scanner(System.in);
			System.out.print("Unesite slovo - ");
			String slovce = unos.nextLine();
			String slovce1 = slovce.toUpperCase();
			String slovce2 = slovce.toLowerCase();
			
			char karakter;
			String slovo = null; 
			
			
			//for(int i = 0; i < film.length(); i++) {
			
				for(int p = 0; p <skriveni.length; p++) {
					karakter = film.charAt(p);
					slovo = Character.toString(karakter);
					
					if (slovce1.equals(slovo)) {
						skriveni[p] = slovce1;
						brojSlova--;
						System.out.println("Broj slova " + brojSlova);
					}
					if (slovce2.equals(slovo)) {
						skriveni[p] = slovce2;
						brojSlova--;
						System.out.println("Broj slova " + brojSlova);
					}
					
				}
				
			//}
			
			
			for(int i =0; i < skriveni.length; i++) {
				System.out.print(skriveni[i] + " ");
			}
			System.out.println();
			
			
		} while (prikaz == true && brojSlova != 0);
		
		
	}

}
