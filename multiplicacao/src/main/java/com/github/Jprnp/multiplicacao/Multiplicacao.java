package com.github.Jprnp.multiplicacao;

public class Multiplicacao {
	/**
	 * 
	 * @param n Fator 1 da multiplicação
	 * @param u Fator 2 da multiplicação
	 * @return Produto entre os dois números
	 */
	public static int getProduto(int n, int u) {
		int prod = 0, totParcel, parcela;
		
		if((n < 0) ||(u < 0)) {
			throw new IllegalArgumentException("Só são permitidos inteiros positivos aqui.");
		}
		
		if(n < u) {
			totParcel = n;
			parcela   = u;
		}
		else {
			totParcel = u;
			parcela   = n;
		}
		
		for(int i = 0; i < totParcel; i++) {
			prod += parcela;
		}
		
		return prod;
	}
}
