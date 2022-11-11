package com.carol.cursojava.aula13;

import java.util.Scanner;

public class OperadoresAritmeticos {
	public static void main(String[] args) {
    double valor1,valor2,salario;
		Scanner scan= new Scanner(System.in);	
		
		System.out.println("quanto você ganha por hora");
		valor1 = scan.nextDouble();
		
		System.out.println("quantas horas trabalha no mes?");
		valor2 = scan.nextDouble();
		
		salario= valor1 *valor2;
		
		System.out.println("Seu salario final do mes é :"+salario);
	
	}
}
