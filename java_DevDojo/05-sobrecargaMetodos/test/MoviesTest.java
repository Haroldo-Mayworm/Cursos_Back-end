package devDojo.sobrecargaMetodos.test;

import devDojo.sobrecargaMetodos.dominio.Movies;

public class MoviesTest {
    public static void main(String[] args) {
        Movies movie = new Movies();
        movie.init("Clube da Luta", "Ação", 1999, 18);
        movie.print();
    }
}
