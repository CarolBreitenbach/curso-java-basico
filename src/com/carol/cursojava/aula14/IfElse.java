package com.carol.cursojava.aula14;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {

		Scanner scan =new Scanner(System.in);
		
		System.out.println("Entre com sua idade");
		int idade =scan.nextInt();
		
		if(idade >= 18) {
			
			System.out.println("É maior de idade");
		} else {
			System.out.println("É menos de idade");
		}
		
		
		//barato<= 10
		//10<valor<15-pedir desconto
		//15<= valor17 pesquisar mais
		//>= 17 muito caro 
		System.out.println("Digite um valor: ");
		double valor = scan.nextDouble();
		
		

		if(valor<= 10) {
			
			System.out.println("Esta barato pode comprar");
		} else if 
		(valor< 10 && valor<15) {
		
			System.out.println("Pedir desconto");
		}
		else if 
		(valor>= 15 && valor<17) {
		
			System.out.println("Pesquisar mais");
		}
		else if 
		(valor>=17) {
		
			System.out.println("Esta muito caro");
		}
		
		
		
		
	}
}
