package devDojo.sobrecargaMetodos.dominio;

public class Movies {
    private String name;
    private String category;
    private int releaseYear;
    private int classification;

    public void print() {
        System.out.println(this.name);
        System.out.println(this.category);
        System.out.println(this.releaseYear);
    }

    public void init(String name, String category, int releaseYear) {
        this.name = name;
        this.category = category;
        this.releaseYear = releaseYear;
    }

    public void init(String name, String category, int releaseYear, int classification) {
        this.init(name, category, releaseYear);
        this.classification = classification;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setClassification(int classification) {
        this.classification = classification;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public String getCategory() {
        return this.category;
    }

    public int getReleaseYear() {
        return this.releaseYear;
    }

    public int getClassification() {
        return classification;
    }
}
