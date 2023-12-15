package devDojo.associacao.associacaoBidirecional.domain;

public class SoceerPlayer {
    private String name;
    private SoceerTeam team;

    public SoceerPlayer(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(this.name);
        if(team != null) {
            System.out.println(team.getName());
        }
    }

    // Getters
    public String getName() {
        return name;
    }

    public SoceerTeam getTeam() {
        return team;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setTeam(SoceerTeam team) {
        this.team = team;
    }
}
