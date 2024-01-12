import domain.Player;

public class PlayerTest {

  public static void main(String[] args) {
    Player player1 = new Player("Garrincha");
    Player player2 = new Player("Zico");
    Player player3 = new Player("Sócrates");
    Player players[] = { player1, player2, player3 };

    for (Player player : players) {
      player.print();
    }
  }
}
