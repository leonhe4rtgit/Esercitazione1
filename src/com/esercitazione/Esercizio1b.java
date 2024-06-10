package com.esercitazione;

/*
 * Esercizio 1b
 * 
 * Scrivere un Programma Java che esegua le stesse operazioni 
 * dell’esercizio precedente, stampando i caratteri 
 * su un’unica riga.
 */

public class Esercizio1b {

	public static void main(String[] args) {
		// Oggetto di Tipo Stringa
		String nome = new String("Daniele");

		// Iniziale del nome
		String iniziale = nome.substring(0, 1);

		// Ultima lettere del nome
		String ultima = nome.substring(nome.length() - 1, nome.length());

		// Stampa delle lettere concatenate su un unica riga
		System.out.println(iniziale + ultima);

	}

}