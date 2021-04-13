package univas.br.edu;
import java.util.*;
import classes.*;


public class StartApp {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		ArrayList <Competidor> competidores = new ArrayList <Competidor> ();
		
		println("A corrida vai começar!");
		
		for(int i = 0; i<5; i++) {
			println("Faça seu cadastro");
			Competidor competidor = new Competidor();
			println("Qual o seu apelido?");
			String nick = scan.nextLine();
			competidor.setApelido(nick);
			
			println("Qual veículo você utilizará?\n1-CARRO	2-MOTO");
			int teste = scan.nextInt();
			scan.nextLine();
			if(teste == 1) {
				Veiculo moto = new Veiculo ();
				competidor.setVeiculo(moto);
			}else {
				Veiculo carro = new Veiculo ();
				competidor.setVeiculo(carro);
			}
			
			competidores.add(competidor);
		}
		
		Random aleatorio = new Random ();
		
		for (int i = 0; i<5;i++) {
			for (int j = 0; j<10; j++) {
				//não consegui indetificar meu problema a tempo de entregar a prova, mas ele ta nesse for
				competidores.get(i).getVeiculo().acelerar(aleatorio.nextInt((20 - 5) + 1) + 5);
				
			}
		}
		
		int vencedor = 0;
		for (int i = 0; i<5; i++) {
			
			if(competidores.get(i).getVeiculo().getVelocidadeAtual() > vencedor) {
				vencedor = competidores.get(i).getVeiculo().getVelocidadeAtual();
			}
		}
		
		println("O vencedor da corrida foi:");
		println(competidores.get(vencedor).getApelido());
		
		
	}
	
	public static void println (String frase) {
		System.out.println("\n" + frase + "\n");
		
		/* Esse metodo so tem a finalidade de facilitar a minha vida, pq é chato ficar escrevendo 
		 * toda hora System.out.println(), saudesde printf e scanf da linguagem C
		 */
		
	}

}
