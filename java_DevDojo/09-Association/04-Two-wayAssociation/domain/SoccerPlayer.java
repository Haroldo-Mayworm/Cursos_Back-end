public class SoccerPlayer {

  private String name;
  private SoccerTeam team;

  public SoccerPlayer(String name) {
    this.name = name;
  }

  public void print() {
    System.out.println(this.name);
    if (team != null) {
      System.out.println(team.getName());
    }
  }

  // Getters
  public String getName() {
    return name;
  }

  public SoccerTeam getTeam() {
    return team;
  }

  // Setters
  public void setName(String name) {
    this.name = name;
  }

  public void setTeam(SoccerTeam team) {
    this.team = team;
  }
}
