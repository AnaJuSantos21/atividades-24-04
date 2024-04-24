package curso24_04;

import java.util.Scanner;

public class atividade3conversao {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int impar = 0, par = 0, num,i=1;
		
		while (i <= 10) {
			System.out.print("Informe o " + i + "° número: ");
		num = ler.nextInt();
		if (num % 2 ==0)
			par = par + 1 ;
		else
			impar = impar +1; 
		 i++;

	    }
		System.out.println("Quantidade de par: "+par);
		System.out.println("Quantidade de impar: "+impar);
		ler.close();
	}



	}

