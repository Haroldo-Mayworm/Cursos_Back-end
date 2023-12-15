package devDojo.associacao.arrayComObjetos.domain;

public class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(this.name);
    }

    // Getters
    public String getName() {
        return name;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }
}
