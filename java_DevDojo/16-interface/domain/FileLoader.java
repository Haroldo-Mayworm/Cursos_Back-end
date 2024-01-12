package devDojo.interfaces.domain;

public class FileLoader implements DataLoader, DataRemove {
    @Override
    public void load() {
        System.out.println("Loading data from a file...");
    }

    @Override
    public void remove() {
        System.out.println("Removing data from a file...");
    }
}
