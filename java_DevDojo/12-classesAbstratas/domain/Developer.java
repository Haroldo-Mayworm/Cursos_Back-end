package devDojo.classesAbstratas.domain;

public class Developer extends Employed{
    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void calculateBonus() {
        this.salary = this.salary + this.salary * 0.05;
    }

    @Override
    public String toString() {
        return "Developer {" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
