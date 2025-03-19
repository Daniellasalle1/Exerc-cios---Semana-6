package ambiente_virtual_1;

import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("escreva um numero: ");
		double num = sc.nextInt();
		
		int cont = 1;
		
		while(cont <= 10){
			System.out.println(num + "*" + cont + "=" + (num * cont));
			cont++;
		}
		
		
		

	}

}
