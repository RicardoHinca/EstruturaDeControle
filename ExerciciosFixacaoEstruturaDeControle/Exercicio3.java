package controle.ExerciciosFixacaoEstruturaDeControle;

import java.util.Scanner;

	public class Exercicio3 {

		public static void main(String[] args) {
						
//Criar um programa que receba duas notas parciais, calcular a média final. 
//Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado", 
//se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação", 
//caso contrário imprime no console "Reprovado".
			
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Entre com a primeira parcial: ");
			double primeiraParcial = entrada.nextDouble();
			
			System.out.println("Entre com a segunda parcial: ");
			double segundaParcial = entrada.nextDouble();
			
			double nota = (primeiraParcial + segundaParcial) / 2;
			
			if (nota >10 || nota <= 0)
				System.out.println("Nota Invalida");
			else if (nota >= 7)
				System.out.println("Aprovado!! \nSua nota foi: " + nota + " Parabens!");
			else if (nota <= 6.9 && nota >= 4)
				System.out.println("Recuperação!! \nSua nota foi: " + nota);
			else
				System.out.println("Reprovado!! \nSua nota foi: " + nota);
							
			entrada.close();
		
		}
}
