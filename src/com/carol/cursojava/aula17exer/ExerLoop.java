package com.carol.cursojava.aula17exer;

import java.util.Scanner;

public class ExerLoop {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Aula Loiane Groner
		// exer1
		/*
		 * boolean notaValida=false; do {
		 * 
		 * System.out.println("Entre com uma nota :"); double nota= scan.nextDouble();
		 * 
		 * 
		 * if(nota >=0 && nota <=10) { notaValida=true;
		 * System.out.println("Você digitou: " + nota); }else { notaValida=false;
		 * System.out.println("Nota invalida, digite novamente."); }
		 * 
		 * }while (!notaValida);
		 * 
		 * 
		 * //exer2
		 * 
		 * boolean senhaValida=false; do {
		 * 
		 * System.out.println("Entre com o usuario :"); String usuario= scan.next();
		 * System.out.println("Entre com a senha :"); String senha= scan.next();
		 * 
		 * 
		 * if(usuario.equals(senha)) { senhaValida=false;
		 * System.out.println("Usuario e senha iguais, favor digitar novamente."); }else
		 * { senhaValida=true;
		 * System.out.println("Usuario e senha cadastrados com sucesso!!"); } }while
		 * (!senhaValida);
		 * 
		 * 
		 * //exer3 boolean infoValida = false;
		 * 
		 * String nome; int idade; double salario; String sexo; String estadoC;
		 * 
		 * do {
		 * 
		 * System.out.println("Digite o nome: "); nome = scan.next(); if (nome.length()
		 * >= 3) { infoValida = true; } else { infoValida = false;
		 * System.out.println("Nome precisa no minimo de 3 caracteres"); } } while
		 * (!infoValida);
		 * 
		 * do { System.out.println("Digite a idade: "); idade = scan.nextInt(); if
		 * (idade >= 0 && idade <= 150) { infoValida = true; } else { infoValida =
		 * false; System.out.println("Idade precisa ser entre 0 até 150 anos"); } }
		 * while (!infoValida);
		 * 
		 * do { System.out.println("Digite o salario: "); salario = scan.nextDouble();
		 * 
		 * if (salario > 0) { infoValida = true; } else { infoValida = false;
		 * System.out.println("O salario precisa sermaior que 0"); } } while
		 * (!infoValida); do { System.out.println("Digite o sexo: "); sexo =
		 * scan.next(); if (sexo.equals("f") || sexo.equals("F") || sexo.equals("M") ||
		 * sexo.equals("m")) { infoValida = true; } else { infoValida = false;
		 * System.out.println("O sexo deve ser digitado 'f' ou 'm'"); } } while
		 * (!infoValida); do { System.out.println("Digite o Estado Civil: "); estadoC =
		 * scan.next();
		 * 
		 * if (estadoC.equals("s") || estadoC.equals("c") || estadoC.equals("v") ||
		 * estadoC.equals("d")) { infoValida = true; } else { infoValida = false;
		 * System.out.println("O estado civil deve ser digitado 's' , 'c' , 'v' , 'd'");
		 * }
		 * 
		 * } while (!infoValida);
		 * 
		 * 
		 * System.out.println("Nome: " + nome); System.out.println("Idade: " +idade);
		 * System.out.println("Salario: " +salario); System.out.println("Sexo: " +sexo);
		 * System.out.println("Estado Civil: " +estadoC);
		 * 
		 * 
		 * 
		 * 
		 * //exer4 int popA=80000; int popB=200000; int cont =0;
		 * 
		 * 
		 * while (popA < popB) {
		 * 
		 * popA += (popA/100)*3; popB += (popB/100)*1.5; cont++;
		 * 
		 * } System.out.println("População A:" +popA); System.out.println("População B:"
		 * +popB); System.out.println("Qtd anos:" +cont);
		 * 
		 * 
		 * 
		 * //exer5 int cont =0; System.out.println("Digite a população A: "); double
		 * popA = scan.nextDouble();
		 * 
		 * System.out.println("Digite a taxa população A: "); double taxaA =
		 * scan.nextDouble();
		 * 
		 * System.out.println("Digite a população B: "); double popB =
		 * scan.nextDouble();
		 * 
		 * System.out.println("Digite taxa população B: "); double taxaB =
		 * scan.nextDouble();
		 * 
		 * while (popA < popB) {
		 * 
		 * popA += (popA/100)*taxaA; popB += (popB/100)*taxaB; cont++;
		 * 
		 * } System.out.println("População A:" +popA); System.out.println("População B:"
		 * +popB); System.out.println("Qtd anos:" +cont);
		 * 
		 * 
		 * 
		 * 
		 * 
		 * //exer6
		 * 
		 * for (int i=1; i<=20;i++) { System.out.println(i); }
		 * 
		 * for (int i=1; i<=20;i++) { System.out.print(i +" "); }
		 * 
		 * //exer7
		 * 
		 * int num; int maior = Integer.MIN_VALUE;
		 * 
		 * for (int i=1; i<=5;i++) { System.out.println("Entre com um numero:"); num =
		 * scan.nextInt();
		 * 
		 * if (num >maior) { maior= num; } }
		 * 
		 * System.out.println("O maior numero é :"+maior);
		 * 
		 

		// exer8

		int num;
		int media;
		int soma = 0;
		for (int i = 1; i <= 5; i++) {

			System.out.println("Entre com um numero:");
			num = scan.nextInt();
			soma += num;

		}

		media = soma / 5;

		System.out.println("a soma é :" + soma);
		System.out.println("a media é :" + media);
*/
		
	//	
	//	int n1=1,n2=2;
		
		//for( int qtd =50; qtd>0; qtd--) {
	//		System.out.println(n1 + "");
		//	int n3=n1+n2;
		////	n1=n2;
		//	n2=n3;
			
	//}
		
		/*
		
		 int n1 = 1;
	        int n2 = 2; 
	        int sum;
	        do {
	        
	        	System.out.print(n1 + " "); 
	            int t = n1 + n2; 
	            n1 = n2;  
	            n2 = t; 
	       
	            if (n1 % 2 == 0) {
	            sum+= n1;
	         
	            }
	          
	        } while (n1 <= 4000000); 
	    
	        System.out.print(sum); */
	        
	        
	        
	        
	        int n1 = 1;
	        int n2 = 2; 
	        int sum;
	        
	        
	        
	        while(n1 <= 4000000) {
	        	System.out.print(n1 + " "); 
	            int t = n1 + n2; 
	            n1 = n2;  
	            n2 = t; 
	       
	         //   if (n1 % 2 == 0) {
	          //  sum+= n1;
	         
	            }
	        	
	        	
	        	
	        	
	        //	numero++;
	          // soma = soma + numero;
	           // printf("%d\n", soma);
	//        } 
	        
	        
	        
	        
	        
	        
	     
	        
	 
		
		// exer9
		// exer10
		// exer11
		// exer12
		// exer13
		// exer14
		// exer15
		// exer16
		// exer17
		// exer18
		// exer19
		// exer20

	
	

		
				
				
	}

}
