package br.com.Victor.lacodedecis�o;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		
		System.out.println("Digite os tr�s valores inteiros");
		a = leia.nextInt();
		b = leia.nextInt();
		c = leia.nextInt();
		
		if(a>=b && a>=c) {
			System.out.println( "Esse � o maior valor: " + a);
		}
		else if (b>=a && b>=c) {
			System.out.println("Esse � o maior valor: " + b);
			
		}else if(c>=a && c>=b) {
			System.out.println("Esse � o maior valor: " + c);
			
		}
		

	}

}
