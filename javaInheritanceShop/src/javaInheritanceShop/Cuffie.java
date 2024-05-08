package javaInheritanceShop;

import shop.Prodotto;

//Cuffie, caratterizzate dal colore e se sono wireless o cablate


public class Cuffie extends Prodotto{
	
	private String colore;
	private String cuffieWireless;
	private String cuffieCablate;
	
	public Cuffie (String nome, String descrizione, double prezzo, String marca, String colore, String cuffieCablate, String cuffieWireless) {
		super (nome, descrizione, prezzo,marca);
		this.colore = colore;
		this.cuffieCablate = cuffieCablate;
		this.cuffieWireless = cuffieWireless;
		
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public String getCuffieWireless() {
		return cuffieWireless;
	}

	public void setCuffieWireless(String cuffieWireless) {
		this.cuffieWireless = cuffieWireless;
	}

	public String getCuffieCablate() {
		return cuffieCablate;
	}

	public void setCuffieCablate(String cuffieCablate) {
		this.cuffieCablate = cuffieCablate;
	}
	
	
}
