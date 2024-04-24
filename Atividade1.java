package curso24_04;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int valor,i=0;
		
		System.out.print("Informe um número: ");
		valor= ler.nextInt();
		
		 while (i <= valor){
			
			if (i%2!=0) {
				System.out.println("Os números impares são: " +i);
			}
		i++;
		}

	}

}


