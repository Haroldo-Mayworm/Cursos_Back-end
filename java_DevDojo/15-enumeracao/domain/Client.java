package enumeracao.domain;

public class Client {
    private String name;
    private TypeClient typeClient;
    private TypePayment typePayment;

    public Client(String name, TypeClient typeClient, TypePayment typePayment) {
        this.name = name;
        this.typeClient = typeClient;
        this.typePayment = typePayment;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name = '" + name + '\'' +
                ", typeClient = " + typeClient +
                ", typePayment = " + typePayment +
                '}';
    }

    public String getName() {
        return name;
    }

    public TypeClient getTypeClient() {
        return typeClient;
    }

    public TypePayment getTypePayment() {
        return typePayment;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTypeClient(TypeClient typeClient) {
        this.typeClient = typeClient;
    }

    public void setTypePayment(TypePayment typePayment) {
        this.typePayment = typePayment;
    }
}
