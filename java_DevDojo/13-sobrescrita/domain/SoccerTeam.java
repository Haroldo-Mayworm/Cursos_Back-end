package devDojo.sobrescrita.domain;

public class SoccerTeam {
    private String name;

    @Override
    public String toString() {
        return "time = " + this.name;
    }

    public SoccerTeam(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
