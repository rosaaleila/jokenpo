import java.util.Random;
import java.util.Scanner;

public class Jokenpo {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		Random gerador = new Random();
	
		int partidas = 0;
		int contador = 1;
		int vitoriasJog = 0;			
		int vitoriasPC = 0;
		String decisao = "S";
			
		while (decisao.equals("s") || decisao.equals("S")) {
			System.out.println("Bem-vindo ao jogo jokenpo!");
			System.out.println();
				
			System.out.print("Digite quantas partidas você deseja que a brincadeira tenha: ");
			partidas = leitor.nextInt();
				
			if (partidas % 2 == 0 || partidas < 3) {
			System.out.println("Por favor, tente novamente e digite um número ímpar e/ou maior e/ou igual a 3!!!");
			System.out.println();
			System.out.print("Digite quantas partidas você deseja que a brincadeira tenha: ");
			partidas = leitor.nextInt();
			} 
				
			System.out.println();
			System.out.println("Opções dísponiveis: ");
			System.out.println();
			System.out.println("1 - Pedra");
			System.out.println("2 - Papel");
			System.out.println("3 - Tesoura");
			System.out.println();
				
			while (contador <= partidas) {	
				vitoriasJog = 0;			
				vitoriasPC = 0;
				int escolhaJog = 0;
				int escolhaPC = 0;
				String jogadaJog;
				String jogadaPC;
					
				System.out.println("Partida " + contador);
				System.out.println();
					
				System.out.print("Digite sua escolha: ");
				escolhaJog = leitor.nextInt();
					
				escolhaPC = gerador.nextInt(3) + 1;
					
				if (escolhaJog == 1) {
					jogadaJog = "Pedra";
				} else if (escolhaJog == 2) {
					jogadaJog = "Papel";
				} else {
					jogadaJog = "Tesoura";
				}
					
				if (escolhaPC == 1) {
					jogadaPC = "Pedra";
				} else if (escolhaPC == 2) {
					jogadaPC = "Papel";
				} else {
					jogadaPC = "Tesoura";
				}
					
					
				if (escolhaPC == 3) {
					if (escolhaJog == 2) {
						System.out.println("Você escolheu " + jogadaJog);
						System.out.println("O computador escolheu " + jogadaPC);
						System.out.println("Computador venceu!");
						System.out.println();
						vitoriasPC++;
					} else if (escolhaJog == 1) {
						System.out.println("Você escolheu " + jogadaJog);
						System.out.println("O computador escolheu " + jogadaPC);
						System.out.println("Você venceu!");
						System.out.println();
						vitoriasJog++;
					} else {
						System.out.println("Houve um empate!");
						vitoriasJog++;
						vitoriasPC++;
					}
				} else if (escolhaPC == 2) {
					if (escolhaJog == 3) {
						System.out.println("Você escolheu " + jogadaJog);
						System.out.println("O computador escolheu " + jogadaPC);
						System.out.println("Você venceu!");
						System.out.println();
						vitoriasJog++;
					} else if (escolhaJog == 1) {
						System.out.println("Você escolheu " + jogadaJog);
						System.out.println("O computador escolheu " + jogadaPC);
						System.out.println("Computador venceu!");
						System.out.println();
						vitoriasPC++;
					} else {
						System.out.println("Houve um empate!");
					}
				} else if (escolhaPC == 1) {
					if (escolhaJog == 3) {
						System.out.println("Você escolheu " + jogadaJog);
						System.out.println("O computador escolheu " + jogadaPC);
						System.out.println("Computador venceu!");
						System.out.println();
						vitoriasPC++;
					} else if (escolhaJog == 2) {
						System.out.println("Você escolheu " + jogadaJog);
						System.out.println("O computador escolheu " + jogadaPC);
						System.out.println("Você venceu!");
						System.out.println();
						vitoriasJog++;
					} else {
						System.out.println("Houve um empate!");
					}
				}
				
				contador++;
				
				
				if (vitoriasPC > vitoriasJog) {
					System.out.printf("Computador venceu por %d x %d", vitoriasPC, vitoriasJog);
					System.out.println();
					} else {
					System.out.printf("Você venceu por %d x %d", vitoriasJog, vitoriasPC);
					System.out.println();
					}
					
					System.out.print("Deseja jogar mais vezes? Digite S para SIM ou N para NÃO: ");
					decisao = leitor.next();
				} 
				
			}
		
		
		leitor.close();
		
	}

}
