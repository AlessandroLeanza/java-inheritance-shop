package javaInheritanceShop;

import shop.Prodotto;

//Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no

public class Televisori extends Prodotto{
	
	private int dimensioni;
	private boolean smart;
	
	public Televisori (String nome, String descrizione, double prezzo, String marca, int dimensioni, boolean smart) {
		super (nome, descrizione, prezzo,marca);
		this.dimensioni = dimensioni;
		this.smart = smart;
	}

	public int getDimensioni() {
		return dimensioni;
	}

	public void setDimensioni(int dimensioni) {
		this.dimensioni = dimensioni;
	}

	public boolean isSmart() {
		return smart;
	}

	public void setSmart(boolean smart) {
		this.smart = smart;
	}

	@Override
	public String toString() {
		return super.toString() + "Televisori dimensioni=" + dimensioni + ", "
				+ "smart=" + smart + "";
	}
	
	
	
}
