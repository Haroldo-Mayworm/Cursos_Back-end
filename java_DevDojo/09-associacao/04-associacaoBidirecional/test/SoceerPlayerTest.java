package devDojo.associacao.associacaoBidirecional.test;


import devDojo.associacao.associacaoBidirecional.domain.SoceerPlayer;
import devDojo.associacao.associacaoBidirecional.domain.SoceerTeam;

public class SoceerPlayerTest {
    public static void main(String[] args) {
        SoceerPlayer player1 = new SoceerPlayer("Ronaldo");
        SoceerTeam team1 = new SoceerTeam("Corintians");
        SoceerPlayer[] playersA = {player1};

        player1.setTeam(team1);
        team1.setPlayers(playersA);

        System.out.println("___ Jogadores ___");
        player1.print();
        System.out.println("___ Times ___");
        team1.print();
    }
}
