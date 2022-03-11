package controle.desafios;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		
		//Digitar o numero recerente a semana e me mostrar qual dia é
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com o dia da Semana desejado: ");
		double dia = entrada.nextDouble();
				
		if (dia >= 8 || dia <= 0)
			System.out.println("Dia da Semana Invalido!");
		else if (dia == 1)
			System.out.println("Hoje é Domingo!");
		else if (dia == 2)
			System.out.println("Hoje é Segunda!");
		else if (dia == 3)
			System.out.println("Hoje é Terça!");
		else if (dia == 4)
			System.out.println("Hoje é Quarta!");
		else if (dia == 5)
			System.out.println("Hoje é Quinta!");
		else if (dia == 6)
			System.out.println("Hoje é Sexta!");
		else
			System.out.println("Hoje é Sabado!");
		
		// if ("domingo".equalsIgnoreCase(dia))
		// Digitando a palavra da semana para aparecer o dia, usa equals pra transforma letras em numeros e ignore case M ou m
		
	
		
		entrada.close();	
	}
}
