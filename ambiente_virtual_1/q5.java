package ambiente_virtual_1;

import java.util.Scanner;

public class q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 System.out.print("Digite o número inicial do intervalo: ");
	        int inicio = sc.nextInt();
	        
	        System.out.print("Digite o número final do intervalo: ");
	        int fim = sc.nextInt();
	        
	        System.out.println("Números primos no intervalo:");
	        
	        for (int num = inicio; num <= fim; num++) {
	            if (num > 1) {
	                boolean Primo = true;
	                
	                for (int i = 2; i <= (int) Math.sqrt(num); i++) {
	                    if (num % i == 0) {
	                        Primo = false;
	                        break;
	                    }
	                }
	                
	                if (Primo) {
	                    System.out.print(num + " ");
	                }
	            }
	        }
		
		

	}

}
