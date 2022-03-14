package controle.ExerciciosFixacaoEstruturaDeControle;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
// Refatorar o exercicio 04, utilizando a estrutura switch.
		
		int contador = 0;
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o número: ");
		int numero = entrada.nextInt();
		
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contador++;
			}
		}

		switch (contador) {

		case 0:
			System.out.println("\nO numero: " + numero + " é primo.");
			break;

		default:
			System.out.println("\nO numero: " + numero + " não é primo.");

		}

		entrada.close();
		
	}
}
