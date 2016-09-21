package com.github.Jprnp.multiplicacao;

import java.util.Scanner;

public class ProgramaMultiplicacao {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner read = new Scanner(System.in);
		
		int n = read.nextInt();
		int u = read.nextInt();
		
		System.out.println("O produto é: " + Multiplicacao.getProduto(n, u));
		
		System.exit(0);
	}
}
