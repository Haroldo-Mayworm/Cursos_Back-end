package devDojo.associacao.associacaoUnilateral_1xN.test;

import devDojo.associacao.associacaoUnilateral_1xN.domain.SoceerPlayer;
import devDojo.associacao.associacaoUnilateral_1xN.domain.SoceerTeam;

public class SoceerPlayerTest {
    public static void main(String[] args) {
        SoceerPlayer player1 = new SoceerPlayer("Pelé");
        SoceerTeam team1 = new SoceerTeam("Santos");

        player1.setTeam(team1);
    }
}
