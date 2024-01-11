package devDojo.classesAbstratas.test;

import devDojo.classesAbstratas.domain.Developer;
import devDojo.classesAbstratas.domain.Employed;
import devDojo.classesAbstratas.domain.Manager;

public class EmployedTest {
    public static void main(String[] args) {
        Manager manager = new Manager("Pedro", 22000);
        Developer developer = new Developer("Will", 8000);

        manager.print();

        System.out.println(manager);
        System.out.println(developer);
    }
}
