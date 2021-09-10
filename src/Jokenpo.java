import java.util.Random;
import java.util.Scanner;

public class Jokenpo {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		Random gerador = new Random();
		
		String decisao = "S";
		int vitoriasJog = 0;			
		int vitoriasPC = 0;
		
		// criando laço principal
		
		while (decisao.equals("s") || decisao.equals("S")) {
			
			//zerando variaveis
			
			vitoriasJog = 0;			
			vitoriasPC = 0;
			int escolhaJog = 0;
			int escolhaPC = 0;
			String jogadaJog;
			String jogadaPC;
			int partidas = 0;
			int contador = 1;
			int empates = 0;
		
			System.out.println("Bem-vindo ao jogo jokenpo!");
			System.out.println();
				
			System.out.print("Digite quantas partidas você deseja que o jogo tenha: ");
			partidas = leitor.nextInt();
				
			//verificando se o num de partidas é valido
			
			while (partidas % 2 == 0 || partidas < 3) {
			System.out.println("Por favor, tente novamente e digite um número ímpar e/ou maior e/ou igual a 3!!!");
			System.out.println();
			System.out.print("Digite novamente quantas partidas você deseja que o jogo tenha: ");
			partidas = leitor.nextInt();
			} 
				
			System.out.println();
			System.out.println("Opções dísponiveis: ");
			System.out.println();
			System.out.println("1 - Pedra");
			System.out.println("2 - Papel");
			System.out.println("3 - Tesoura");
			System.out.println();
			
			// laco de repeticao das partidas
				
			while (contador <= partidas) {
					
				System.out.println("Partida " + contador);
				System.out.println();
					
				System.out.print("Digite sua escolha: ");
				escolhaJog = leitor.nextInt();
				
				escolhaPC = gerador.nextInt(3) + 1;
				
				//verificando se a escolha do usuario é valida
				
				while (escolhaJog < 1 || escolhaJog > 3) {
					System.out.println("Por favor, escolha um valor válido.");
					System.out.print("Digite novamente sua escolha: ");
					escolhaJog = leitor.nextInt();
					System.out.println();
				}
					
				//anotando escolha do jogador/pc em string
				
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
					
				//verificando vencedores e empates
				
				if (escolhaPC == 3 && escolhaJog == 2 || escolhaPC == 2 && escolhaJog == 1 || escolhaPC == 1 && escolhaJog == 3) {
					System.out.println("Você escolheu " + jogadaJog);
					System.out.println("O computador escolheu " + jogadaPC);
					System.out.println("Computador venceu!");
					System.out.println();
					vitoriasPC++;
				} else if (escolhaJog == 3 && escolhaPC == 2 || escolhaJog == 2 && escolhaPC == 1 || escolhaJog == 1 && escolhaPC == 3) {
					System.out.println("Você escolheu " + jogadaJog);
					System.out.println("O computador escolheu " + jogadaPC);
					System.out.println("Você venceu!");
					System.out.println();
					vitoriasJog++;
				} else {
					System.out.println("Houve um empate!"); 
					System.out.println();
					empates++;
				}
					
				//finalizando contador caso as vitorias sejam suficientes para nao podermos desempatar
				
				if (vitoriasPC >= partidas / 2 + 1 || vitoriasJog >= partidas / 2 + 1) {
					contador = partidas;
				}
				
				// criando rodadas extras
				
				if (contador == partidas) {
					while (empates == (partidas / 2) || vitoriasPC == vitoriasJog) {
					System.out.println("Partida bônus!!");
					System.out.println();
						
					System.out.print("Digite sua escolha: ");
					escolhaJog = leitor.nextInt();
						
					while (escolhaJog < 1 || escolhaJog > 3) {
						System.out.println("Por favor, escolha um valor válido.");
						System.out.print("Digite novamente sua escolha: ");
						escolhaJog = leitor.nextInt();
						System.out.println(); 
					}
						
					if (escolhaPC == 3 && escolhaJog == 2 || escolhaPC == 2 && escolhaJog == 1 || escolhaPC == 1 && escolhaJog == 3) {
						System.out.println("Você escolheu " + jogadaJog);
						System.out.println("O computador escolheu " + jogadaPC);
						System.out.println("Computador venceu!");
						System.out.println();
						vitoriasPC++;
					} else if (escolhaJog == 3 && escolhaPC == 2 || escolhaJog == 2 && escolhaPC == 1 || escolhaJog == 1 && escolhaPC == 3) {
						System.out.println("Você escolheu " + jogadaJog);
						System.out.println("O computador escolheu " + jogadaPC);
						System.out.println("Você venceu!");
						System.out.println();
						vitoriasJog++;
					} else {
						System.out.println("Houve um empate!"); 
						System.out.println();
						empates++;
					}
					
					//fim das rodadas
					
					} 
				} 
						contador++;
			} //while2
			
			//verificando vencedor
			
			if (vitoriasPC > vitoriasJog) {
				System.out.printf("Computador venceu por %d x %d", vitoriasPC, vitoriasJog);
				System.out.println();
			} else {
				System.out.printf("Você venceu por %d x %d", vitoriasJog, vitoriasPC);
				System.out.println();
			}
			
			//verificando escolha
			
			System.out.println("Deseja jogar novamente? Digite S para SIM e N para NÃO: ");
			decisao = leitor.next();
			
			if (decisao.equals("S") || decisao.equals("s")) {
				System.out.println("Vamos lá!");
				System.out.println();
			} else if (decisao.equals("N") || decisao.equals("n")) {
				System.out.println("Te vejo na próxima!");
				System.out.println("Fim.");
			} else {
				System.out.println("Por favor, digite uma opção válida.");
				System.out.println("Deseja jogar novamente? Digite S para SIM e N para NÃO: ");
				decisao = leitor.next();
			}
				
			} // while1 
				
				leitor.close();
				
				}
}
