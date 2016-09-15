package com.github.Jprnp.somanaturais;

/**
 *
 * @author Jprnp
 */
public class SomaNaturais {    
	/**
	 * 
	 * @param n Quantidade de n�meros a somar
	 * @return Soma dos n primeiros n�meros naturais
	 */
    public static int soma(int n) {
    	if(n < 0) {
    		throw new IllegalArgumentException("Argumento menor que 1 n�o permitido");
    	}
    	
        int soma = 1, i = 2;
        
        while(n >= i) {
            soma += i;
            i    += 1;
        }
        
        if(n == 0) {
        	soma = 0;
        }
        
        return soma;
    }
}