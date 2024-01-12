import domain.SoccerPlayer;
import domain.SoccerTeam;

public class SoccerPlayerTest {

  public static void main(String[] args) {
    SoccerPlayer player1 = new SoccerPlayer("Pelé");
    SoccerTeam team1 = new SoccerTeam("Santos");

    player1.setTeam(team1);
  }
}
