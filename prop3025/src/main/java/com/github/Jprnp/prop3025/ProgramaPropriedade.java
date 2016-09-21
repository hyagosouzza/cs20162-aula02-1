package com.github.Jprnp.prop3025;

import java.util.Scanner;

public class ProgramaPropriedade {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int num;
		
		System.out.println("Qual número verificar?");
		while(true) {
			try {
				num = Integer.parseInt(read.nextLine());
				break;
			}
			catch(NumberFormatException e) {
				System.out.println("Digitar um número válido!");
			}
		}
		if(Propriedade.testeProp(num)) {
			System.out.println("O número " + num + " possui a propriedade");
		}
		else {
			System.out.println("O número " + num + " não possui a propriedade");	
		}
		System.exit(0);
	}

}
