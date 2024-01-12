package devDojo.interfaces.test;

import devDojo.interfaces.domain.DatabaseLoader;
import devDojo.interfaces.domain.FileLoader;

public class DataLoaderTest {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        fileLoader.load();
        System.out.println("----------------------------------------");
        databaseLoader.remove();
        fileLoader.remove();
        System.out.println("----------------------------------------");
        databaseLoader.checkPermission();
    }
}
