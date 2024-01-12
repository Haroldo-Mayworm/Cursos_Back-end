import domain.SoccerPlayer;
import domain.SoccerTeam;

public class SoccerPlayerTest {

  public static void main(String[] args) {
    SoccerPlayer player1 = new SoccerPlayer("Ronaldo");
    SoccerTeam team1 = new SoccerTeam("Corintians");
    SoccerPlayer[] playersA = { player1 };

    player1.setTeam(team1);
    team1.setPlayers(playersA);

    System.out.println("___ Jogadores ___");
    player1.print();
    System.out.println("___ Times ___");
    team1.print();
  }
}
