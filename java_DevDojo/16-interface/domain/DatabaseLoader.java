package devDojo.interfaces.domain;

public class DatabaseLoader implements DataLoader, DataRemove {
    @Override
    public void load() {
        System.out.println("Loading data from DB...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checking permissions on the DB...");
    }

    @Override
    public void remove() {
        System.out.println("Removing data from DB...");
    }
}
