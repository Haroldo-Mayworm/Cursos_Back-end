package devDojo.constructors.test;

import devDojo.constructors.dominio.Games;

public class GamesTest {
    public static void main(String[] args) {
        Games game = new Games("Super Mario Bros.", "Nintendo");
        // game.init("Super Mario Bros.", "Nintendo", 1985);
        game.print();
    }
}
