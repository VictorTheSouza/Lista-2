package br.com.Victor.lacodedecis�o;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double a;
		double x;
		double y;
		
		System.out.println("Digite seu n�mero");
		a = leia.nextDouble();
		
		if(a%2==0) {
			x = Math.pow(a,0.5);
			System.out.println("Esse n�mero � par, e sua raiz quadrada �: " + x);}
		else if(a%2!=0) {
			y = a*a;
				System.out.println("Esse n�mero � impar, e elevado ao quadrado �: " + y);
			
			
			
		}
		
	
		
		
	}

}
