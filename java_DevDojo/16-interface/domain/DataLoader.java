package devDojo.interfaces.domain;

public interface DataLoader {
    int MAX_DATA_SITE = 20;

    void load();

    default void checkPermission() {
        System.out.println("");
    }
}
