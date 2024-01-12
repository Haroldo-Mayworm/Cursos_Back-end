package devDojo.heranca.domain;

public class Aployee extends People {
    private double salary;

    public Aployee(String name, String cpf, Address address, double salary) {
        super(name, cpf, address);
        this.salary = salary;
    }

    public void print() {
        super.print();
        System.out.println(this.salary);
    }

    public void salaryReport() {
        System.out.println("Eu, " + this.name + ", recebi " + this.salary + "!");
    }

    // Getters
    public double getSalary() {
        return salary;
    }

    // Setters
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
