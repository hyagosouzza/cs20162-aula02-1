package com.github.Jprnp.NumeroPrimo;

public class Primo {
	/**
	 * 
	 * @param n Número a verificar se é Primo
	 * @return Valor booleano - true se for primo e false se não for
	 */
	public static boolean isPrimo(int n) {
		int i = 2;
		
		if (n <= 1) {
			throw new IllegalArgumentException("Numero deve ser maior que 1");
		}
			
		while (i < n) {
			if (n % i == 0) {
				return false;
			}
			i++;
		}
		
		return true;
	}
}
