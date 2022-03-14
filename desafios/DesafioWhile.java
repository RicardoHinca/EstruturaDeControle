package controle.desafios;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
// calcular as medias de uma turma nao sei quantos alunos tem na turma 
// vai digitar uma nota valida de 0 a 10 armazenar o valor dessa nota no total 
// quantas notas validas foi digitada	no final mostra a media 
// parar o programa quando ele digitar -1
	
		Scanner entrada = new Scanner(System.in);
		
		int quantidadeDeNotas = 0;
		double nota = 0; 
		double total = 0;
		
		while (nota != -1) {
			System.out.print("Informe a nota: ");
			nota = entrada.nextDouble();
			
			if (nota <= 10 && nota >= 0) {
			total += nota;
			quantidadeDeNotas++;
			} else {
				System.out.println("Nota Invalida!");				
			}
		}
		double media = total / quantidadeDeNotas;
		System.out.println("Media = " + media);
		
//		System.out.println("Digite sua Media: ");
//		double valor = entrada.nextDouble();
//		
//		if (valor > 10 || valor < 0)
//			System.out.println("Nota invalida!");
//		else if ()
		entrada.close();
	}
}
