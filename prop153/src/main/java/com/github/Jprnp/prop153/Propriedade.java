package com.github.Jprnp.prop153;

public class Propriedade {
	/**
	 * 
	 * @param n Número a ser checado
	 * @return Se o numero possui a mesma propriedade que 153
	 */
	public static boolean testeProp(int n) {
		if((n < 0) || (n > 999)) {
			throw new IllegalArgumentException("Permitidos números somente "
					+ "entre os valores 0 e 999");
					
		}
		return (Math.pow((n / 100), 3) + Math.pow(((n / 10) % 10), 3) 
		        + Math.pow((n % 10), 3) == n);
	}
	
}
