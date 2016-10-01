package com.github.Jprnp.NumeroPrimo;

import java.util.Scanner;

public class ProgramaPrimo {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int num;
		
		System.out.println("Qual numero verificar?");
		while(true) {
			try {
				num = Integer.parseInt(read.nextLine());
				break;
			}
			catch(IllegalArgumentException e) {
				System.out.println("Digitar um número válido!");
			}
		}
		if(Primo.isPrimo(num)) {
			System.out.println("O número " + num + " e Primo");
		}
		else {
			System.out.println("O número " + num + " nao e Primo");	
		}
		
		System.exit(0);
	}
}
