package com.github.Jprnp.somanaturais;

/**
 *
 * @author Jprnp
 */
public class SomaNaturais {    
	/**
	 * 
	 * @param n Quantidade de números a somar
	 * @return Soma dos n primeiros números naturais
	 */
    public static int soma(int n) {
        int soma = 1, i = 2;
        
        while(n >= i) {
            soma += i;
            i    += 1;
        }
        return soma;
    }
}