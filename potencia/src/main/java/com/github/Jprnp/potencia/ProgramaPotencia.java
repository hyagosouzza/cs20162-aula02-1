package com.github.Jprnp.potencia;

import java.util.Scanner;

public class ProgramaPotencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		int x, y;

		while (true) {
			System.out.println("Base: ");
			while (true) {
				try {
					x = Integer.parseInt(read.nextLine());
					break;
				} catch (NumberFormatException e) {
					System.out.println("Inserir valor válido!");
				}
			}
			System.out.println("Expoente: ");
			while (true) {
				try {
					y = Integer.parseInt(read.nextLine());
					break;
				} catch (NumberFormatException e) {
					System.out.println("Inserir valor válido!");
				}
			}
			try {
				System.out.println("Resultado: " + Potencia.doPow(x, y));
				break;
			} catch (IllegalArgumentException e) {
				System.out.println("Valores negativos não permitidos");
			}
		}
		System.exit(0);
	}

}
