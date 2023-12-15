package devDojo.associacao.associacaoBidirecional.domain;

import devDojo.associacao.arrayComObjetos.domain.Player;

public class SoceerTeam {
    private String name;
    private SoceerPlayer[] players;

    public SoceerTeam(String name) {
        this.name = name;
    }

    public SoceerTeam(String nome, SoceerPlayer[] players) {
        this.name = name;
        this.players = players;
    }

    public void print() {
        System.out.println(this.name);
        if (players == null) return;
        for (SoceerPlayer player : players) {
            System.out.println(player.getName());
        }
    }

    // Getters
    public String getName() {
        return name;
    }

    public SoceerPlayer[] getPlayers() {
        return players;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPlayers(SoceerPlayer[] players) {
        this.players = players;
    }
}
