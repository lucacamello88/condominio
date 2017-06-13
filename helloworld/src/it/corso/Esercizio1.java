package it.corso;

public class Esercizio1 {

	public static void main(String[] args) {
		metodoWhile();
		metodoDoWhile();
		metodoFor();

	}

	private static void metodoFor() {
		int somma = 0;
		for (int numero = 0; numero <= 30; numero += 3) {
			somma += numero;
		}

		System.out.println("Somma nel for" + somma);
	}

	private static void metodoDoWhile() {
		int numero = 0;
		int somma = 0; 
		do {
			if (numero % 3 == 0){
				somma += numero; 
			}
		
		numero++;
		}
		 while (numero <= 30 && numero >= 0); {
     System.out.println("Somma nel DoWhile" + somma);	

    }
	
		

		}

	private static void metodoWhile() {
		int numero = 0;
		int somma = 0;
		while (numero % 3 == 0 && numero <= 30 && numero >= 0) {
			if (numero % 3 == 0) {
				somma += numero; // somma = somma + numero;

			}
			numero++; // numero = numero + 1;

		}
		System.out.println(somma);
	}

}
