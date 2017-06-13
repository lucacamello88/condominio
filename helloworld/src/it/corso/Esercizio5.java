package it.corso;

import java.util.Scanner;

public class Esercizio5 {
      public static void main(String[] args) {
  		Scanner scanner = new Scanner (System.in);
  		System.out.println("Inseri dimensione array");
  		int dimensione = scanner.nextInt();
		int [] array = new int[dimensione];

		for(int i = 0; i < array.length; i++){
			System.out.println("Inserire prossimo numero");
			array[i] = scanner.nextInt();
			
			
				
		}
		System.out.println("Inserimento completato");
		int pari = 0; 
		int dispari = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i] % 2 == 0) {
				pari ++;
			} else {
				dispari ++;
			}
			
			
		}
		System.out.println("Numeri pari =" + pari);
		System.out.println("Numeri dispari =" + dispari);
		
		
	}
}
