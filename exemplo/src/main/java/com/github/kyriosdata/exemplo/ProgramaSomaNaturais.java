package com.github.kyriosdata.exemplo;

import java.util.Scanner;

public class ProgramaSomaNaturais {
	/**
	 * 
	 * @param args Command Line Arguments
	 */
	
	public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int num = Integer.parseInt(leitor.nextLine());
        System.out.println(SomaNaturais.soma(num));
    }
}
