package javaInheritanceShop;

import shop.Prodotto;

//Smarphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria

public class Smartphone extends Prodotto{
	private int codiceImei;
	private int quantitaMemoria;
	
	public Smartphone (String nome, String descrizione, double prezzo, String marca, int codiceImei, int quantitaMemoria) {
		super (nome, descrizione, prezzo,marca);
		this.codiceImei = codiceImei;
		this.quantitaMemoria = quantitaMemoria;
	}
	
	public int getQuantitaMemoria() {
		return quantitaMemoria;
	}
	public void setQuantitaMemoria(int quantitaMemoria) {
		this.quantitaMemoria = quantitaMemoria;
	}
	public int getCodiceImei() {
		return codiceImei;
	}
}
