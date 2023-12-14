package devDojo.constructors.dominio;

public class Games {
    private String name;
    private String developers;
    private int releaseYear;

    public Games(String name, String developers) {
        this.name = name;
        this.developers = developers;
    }

    public Games(String name, String developers, int releaseYear) {
        this(name, developers);
        this.releaseYear = releaseYear;
    }

    public void print() {
        System.out.println(this.name);
        System.out.println(this.developers);
        System.out.println(this.releaseYear);
    }

    /*public void init(String name, String developers) {
        this.name = name;
        this.developers = developers;
    }

    public void init(String name, String developers, int releaseYear) {
        this.init(name, developers);
        this.releaseYear = releaseYear;
    }*/
}
