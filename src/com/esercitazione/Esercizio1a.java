package com.esercitazione;

/*
 * Esercizio 1a
 * Scrivere un Programma Java che crei un oggetto 
 * String che rappresenti il proprio nome e stampi 
 * il primo e l’ultimo carattere del nome 
 * su due righe differenti.
 */

public class Esercizio1a {

	public static void main(String[] args) {

		// Oggetto di Tipo Stringa
		String nome = new String("Daniele");

		// Iniziale del nome
		String iniziale = nome.substring(0, 1);

		// Ultima lettere del nome
		String ultima = nome.substring(nome.length() - 1, nome.length());

		// Stampa delle lettere
		System.out.println(iniziale);
		System.out.println(ultima);

	}

}
