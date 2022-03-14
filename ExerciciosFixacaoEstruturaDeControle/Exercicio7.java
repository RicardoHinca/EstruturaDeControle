package controle.ExerciciosFixacaoEstruturaDeControle;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
//Criar um programa que enquanto estiver recebendo numeros positivos, imprime no console a soma dos numeros inseridos, 
//caso receba um numero negativo, encerre o programa. Tente utilizar a estrutura do while.
		
		Scanner entrada = new Scanner(System.in);

		int somadorDeNumeros = 0;
		int numero = 0;

		while (numero >= 0) {
			System.out.println("Digite um numero: ");
			numero = entrada.nextInt();
			if (numero >= 0) {
				somadorDeNumeros += numero; // Isso é igual a somadorDeNumeros = somadorDeNumeros + numero;
				System.out.printf("\nSoma até o momento: %d\n", somadorDeNumeros);
			}
		}
		entrada.close();
	}
}
