package devDojo.modificadorFinal.domain;

public /*final*/ class Cars {
    private String name;
    public static final double SPEED_LIMIT = 299;
    public final Drivers DRIVER = new Drivers();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
