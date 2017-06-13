package it.corso;

import java.util.Scanner;

public class Esercizio2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci il primo numero");
		double primoNumero = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Inserisci il secondo numero");
		double secondoNumero = scanner.nextDouble();
		scanner.nextLine();
		
		double x = Operazioni.somma(primoNumero, secondoNumero);
		System.out.println("La somma dei due numeri è: " + x);
		
		double sott = Operazioni.sottrazione(primoNumero, secondoNumero);
		System.out.println("La sottrazione dei due numeri è:" + sott);
		
		double molt = Operazioni.moltiplicazione(primoNumero, secondoNumero);
		System.out.println("La moltiplicazione dei due numeri è:" + molt);
		
		double div = Operazioni.divisione(primoNumero, secondoNumero);
		System.out.println("La divisione dei due numeri è:" + div);
				
		
	}

}
