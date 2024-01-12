import domain.Player;

public class SoccerTeam {

  private String name;
  private SoccerPlayer[] players;

  public SoccerTeam(String name) {
    this.name = name;
  }

  public SoccerTeam(String nome, SoccerPlayer[] players) {
    this.name = name;
    this.players = players;
  }

  public void print() {
    System.out.println(this.name);
    if (players == null) return;
    for (SoccerPlayer player : players) {
      System.out.println(player.getName());
    }
  }

  // Getters
  public String getName() {
    return name;
  }

  public SoccerPlayer[] getPlayers() {
    return players;
  }

  //Setters
  public void setName(String name) {
    this.name = name;
  }

  public void setPlayers(SoccerPlayer[] players) {
    this.players = players;
  }
}
