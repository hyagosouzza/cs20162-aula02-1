package com.github.Jprnp.prop3025;

public class Propriedade {
	/**
	 * 
	 * @param n Número a ser checado
	 * @return Se o numero possui a mesma propriedade que 3025
	 */
	public static boolean testeProp(int n) {
		if((n < 0) || (n > 9999)) {
			throw new IllegalArgumentException("Permitidos números somente "
					+ "entre os valores 0 e 9999");
					
		}
		return (Math.pow(((n / 100) + (n % 100)), 2) == n);
	}
	
}
