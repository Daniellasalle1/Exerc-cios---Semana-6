package ambiente_virtual_1;

import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("escreva um numero: ");
		double num = sc.nextInt();
		
		int soma = 0;
		
		for(int i = 0; i <= num; i++) {
			soma += i;
		}
		
		System.out.println("a soma é: " + soma);
		
		
		
		
		
		

	}

}
