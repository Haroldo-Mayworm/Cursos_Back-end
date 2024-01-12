package devDojo.heranca.domain;

public class People {
    protected String name;
    protected String cpf;
    protected Address address;

    public People(String name, String cpf, Address address) {
        this.name = name;
        this.cpf = cpf;
        this.address = address;
    }

    public void print() {
        System.out.println(this.name);
        System.out.println(this.cpf);
        System.out.println(this.address.getStreet() + " - " + this.address.getCep());
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public Address getAddress() {
        return address;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
