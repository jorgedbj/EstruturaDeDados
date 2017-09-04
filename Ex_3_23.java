// C-3.23 Suppose you are designing a multiplayer game that has n ≥ 1000 players, numbered 1 to n,
// interacting in an enchanted forest. The winner of this game is the first player who can meet all
// the other players at least once (ties are allowed). Assuming that there is a method meet(i, j),
// which is called each time a player i meets a player j (with i ≠ j), describe a way to keep track
// of the pairs of meeting players and who is the winner.

import java.util.ArrayList;
import java.util.Random;

public class MeetGame {
	private Player[] players;
	private int totalPlayers;

	public class Player {
		int playerNumber;
		ArrayList<Integer> meets;

		// Inicialização Player
		public Player (int n) {
			this.playerNumber = n;
			this.meets = new ArrayList<Integer>();
		}
	}

	public MeetGame (int n) {
		if (n < 1000) { return; }
		totalPlayers = n;
		players = new Player[totalPlayers];
		for (int i=0; i < totalPlayers; i++) {
			players[i] = new Player(i);
		}
	}

	public void meet(int i, int j) {
		if (i == j) { return; }
		if (!players[i].meets.contains(j)) {
			players[i].meets.add(j);
			players[j].meets.add(i);
		}
	}

	public int getTotalPlayers() {
		return this.totalPlayers;
	}

	public ArrayList<Integer> winner () {
		ArrayList<Integer> winners = new ArrayList<Integer>();
		for(int i=0; i < getTotalPlayers(); i++) {
			if (players[i].meets.size() == getTotalPlayers()-1) {
				winners.add(players[i].playerNumber);
			}
		}
		return winners;
	}

	public String toString (ArrayList<Integer> vencedores) {
		String saida = "Vencedor(es) = (";
		for (int i=0; i < vencedores.size(); i++) {
			saida = saida + vencedores.get(i);
			if (i < vencedores.size()-1) {
				saida = saida + ", ";
			}
		}
		saida = saida + ")";
		return saida;
	}

	public static void main(String args[]) {
		MeetGame game;
		Random r = new Random();
		game = new MeetGame(1000);

		// Inicializa o jogo
		while(game.winner().size() == 0) {
			// Executa os meet's
			for (int i=0; i < game.getTotalPlayers(); i++) {
				game.meet(i, r.nextInt(game.getTotalPlayers()));
			}
		}

		// Imprime vencedor(es)
		System.out.println(game.toString(game.winner()));
	}
}
