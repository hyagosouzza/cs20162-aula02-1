/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package somanaturais;

import java.util.Scanner;

/**
 *
 * @author Jprnp
 */
public class SomaNaturais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int num = Integer.parseInt(leitor.nextLine());
        System.out.println(soma(num));
    }
    
    public static int soma(int n) {
        int soma = 1, i = 2;
        
        while(n >= i) {
            soma += i;
            i    += 1;
        }
        return soma;
    }
}
