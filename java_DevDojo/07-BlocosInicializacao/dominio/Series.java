package devDojo.blocosInicialização.dominio;

public class Series {
    private String name;
    private int[] episodes;

    {
        episodes = new int[50];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
    }

    public Series() {
        for (int episodes : this.episodes) {
            System.out.print(episodes + " ");
        }
    }
}
