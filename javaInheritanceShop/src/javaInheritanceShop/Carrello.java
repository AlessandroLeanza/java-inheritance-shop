package javaInheritanceShop;

import java.util.Scanner;

import shop.Prodotto;

//Create una classe Carrello con metodo main, in cui chiedete all’utente di valorizzare 
//un carrello di prodotti con dati inseriti tramite scanner.
//Durante la richiesta di valorizzazione chiedete all’utente se sta inserendo uno 
//Smarphone o un Televisore o Cuffie e in base alla scelta dell’utente utilizzate il 
//costruttore opportuno.
//Al termine dell’inserimento stampate il carrello (fate l’override del metodo 
//toString per restituire le informazioni da stampare per ogni classe)

public class Carrello {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Scegli il cosa vuoi valorizzare tra:"
				+ " \n - Smartphone \n - Televisore \n - Cuffie");
		
		String valorizzazione = scan.nextLine();
		
//		Prodotto p = null;
		
		switch (valorizzazione) {
		
		case "smartphone": 
			
			Prodotto smartphone = new Smartphone("", "", 0, "", 0, 0);
			
			//p = new Smartphone("", "", 0, "", 0, 0);
			smartphone.setMarca("Apple");
			smartphone.setNome("Iphone");
			smartphone.setPrezzo(1200);
			System.out.println(smartphone);
			break;
			
		case "televisori":
			
			Prodotto televisori = new Televisori("", "", 0, "", 0, false);
			
			//p = new Televisori("", "", 0, "", 0, false);
			televisori.setMarca("Samsung");
			televisori.setNome("Smart Tv");
			televisori.setPrezzo(600);
			System.out.println(televisori);
			break;
			
		case "cuffie":
			
			Prodotto cuffie = new Cuffie("", "", 0, "", "", "", "");
			
			//p = new Cuffie ("", "", 0, "", "", "", "");
			cuffie.setMarca("Apple");
			cuffie.setNome("Apple air3");
			cuffie.setPrezzo(350);
			System.out.println(cuffie);
			break;
			
		default:
			System.out.println("I dati inseriti non sono corretti");
			
		}
		
//		Prodotto prodotto = new Prodotto("", "", 0, "");
//		
//		prodotto.setMarca("Generico");
//		prodotto.setNome("Generico");
//		prodotto.setPrezzo(0);
//		
//		System.out.println(prodotto);
//		
//		Prodotto smartphone = new Smartphone("", "", 0, "", 0, 0);
//		
//		smartphone.setMarca("Apple");
//		smartphone.setNome("Iphone");
//		smartphone.setPrezzo(1200);
//		
//		System.out.println(smartphone);
//		
//		Prodotto televisori = new Televisori("", "", 0, "", 0, false);
//	
//		televisori.setMarca("Samsung");
//		televisori.setNome("Smart Tv");
//		televisori.setPrezzo(600);
//		
//		System.out.println(televisori);
//		
//		Prodotto cuffie = new Cuffie("", "", 0, "", "", "", "");
//		
//		cuffie.setMarca("Apple");
//		cuffie.setNome("Apple air3");
//		cuffie.setPrezzo(350);
//		
//		System.out.println(cuffie);
//		
	}

//	@Override
//	public String toString() {
//		return "Carrello getClass()=" + getClass() + ", hashCode()=" + hashCode() + 
//				", toString()=" + super.toString()
//				+ "";
//	}

}
