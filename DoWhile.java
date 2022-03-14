package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
// if (expressao) sentença; ou {bloco de codigo}
// while (expressao) sentenca; ou {blco de codigo}
// for (inicializacao; expressao; modificacao (incremento, decremento)); ou {bloco de codigo}
// do {bloco de codigo} while (expressao);  .... unica que acaba com ponto e virgula
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		
		do {
			System.out.println("Voce precisa falar as palavras magicas...");
			System.out.print("Quer Sair?");
			texto = entrada.nextLine();
		} while (!texto.equalsIgnoreCase("Por Favor"));
		
		System.out.println("Obrigado");		
		entrada.close();
	}
}
