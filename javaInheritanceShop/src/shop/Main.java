package shop;

public class Main {

	public static void main(String[] args) {
		
		Prodotto prodotto = new Prodotto("Libro", "Cucina", 22, "Mondadori");
		System.out.println(prodotto.getNome());
		System.out.println(prodotto.getDescrizione());
		System.out.println(prodotto.getPrezzo());
		System.out.println(prodotto.getCodice());
		System.out.println(prodotto.prezzoPiuIva());
		System.out.println(prodotto.nomeConcatenato());
	}

}
