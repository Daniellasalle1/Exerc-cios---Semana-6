package ambiente_virtual_1;

import java.util.Scanner;

public class q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("escreva a quantidade de alunos: ");
		int alunos = sc.nextInt();
		
		int acumulador = 0;
		
		for(int i = 0;i <= alunos;i++) {
			System.out.print("digite a nota do aluno de numero " + i);
			double notas = sc.nextDouble();
			
			acumulador += notas;
		}
		
		System.out.println("a media das notas é: " + (acumulador / alunos));
		
		
		
	}

}
