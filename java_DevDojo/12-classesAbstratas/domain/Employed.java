package devDojo.classesAbstratas.domain;

public abstract class Employed extends People {
    protected String name;
    protected double salary;


    public Employed(String name, double salary) {
        this.name = name;
        this.salary = salary;
        calculateBonus();
    }

    @Override
    public void print() {
        System.out.println("Priting...");
    }

    public abstract void calculateBonus();
}
