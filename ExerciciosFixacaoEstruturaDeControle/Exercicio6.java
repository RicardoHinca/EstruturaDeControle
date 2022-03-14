package controle.ExerciciosFixacaoEstruturaDeControle;

//import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
//Jogo da adivinhacao: Tentar adivinhar um numero entre 0 - 100. Armazene um numero aleatório em uma variavel. 
//O Jogador tem 10 tentativas para adivinhar o numero gerado. 
//Ao final de cada tentativa, imprima a quantidade de tentativas restantes, 
//e imprima se o numero inserido e maior ou menor do que o numero armazenado.
		
		Scanner entrada = new Scanner(System.in);
		
		int continuar;
		int numeroSorteado = 50;
		int tentativas;
		int numero;

//	do {
//		System.out.println("Sorteando numero entre 0 e 100...\n");
//		Random numeroAleatorio = new Random();
//		numeroSorteado = numeroAleatorio.nextInt(101);

		System.out.println("Começamos o jogo! Sera que consegue me vencer? \n" 
								+ "Adivinhe o numero escolhido.");
		tentativas = 0;

		do {
			tentativas++;
			System.out.printf("Tentativa %d: ", tentativas);
			numero = entrada.nextInt();

			if (numero > numeroSorteado) {
				System.out.printf("\nO numero sorteado e menor que %d\n\n", numero);

			} else if (numero < numeroSorteado) {

				System.out.printf("\nO numero sorteado e maior que %d\n\n", numero);
				
				} else {

				System.out.printf("\nParabens! Voce acertou o numero em %d tentativas!\n\n", tentativas);

				}

		} while (tentativas < 11); //(numero != numeroSorteado);

			System.out.println("Voce perdeu, excedeu o número máximo de tentativas! ");
			continuar = entrada.nextInt();

//	} while (continuar != 0);

		entrada.close();	
	}
}
