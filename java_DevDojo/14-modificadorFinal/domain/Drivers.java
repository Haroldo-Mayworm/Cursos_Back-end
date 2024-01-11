package devDojo.modificadorFinal.domain;

public class Drivers {
    private String name;

    @Override
    public String toString() {
        return "Drivers-name = " + name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
