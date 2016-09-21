package com.github.Jprnp.potencia;

public class Potencia 
{
	/**
	 * 
	 * @param x base
	 * @param y expoente
	 * @return Resultado Potência
	 */
    public static int doPow(int x, int y) {
    	if((x < 0) || (y < 0)) {
    		throw new IllegalArgumentException("Valores negativos não são "
    				+ "permitidos");
    	}
    	int pows = 1, i = 1;
    	while(i <= y) {
    		pows = Multiplicacao.getProduto(pows, x);
    		i++;
    	}
    	return pows;
    }
}
