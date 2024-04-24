package curso24_04;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int valor, soma = 0, media, i=0;


		while (i <= 4) {
			System.out.print("Informe um número: ");
			valor= ler.nextInt();
			soma=soma+valor;
			System.out.println( "o valor da soma " + soma);
			i++;

		}


		media = soma/5;
		System.out.println( "o valor da media " + media);


	}

}
