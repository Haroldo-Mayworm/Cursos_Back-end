package modificadorAcesso.test;

import modificadorAcesso.dominio.People;

public class PeopleTest {
    public static void main(String[] args) {
        People person = new People();
        person.setName("Ronaldo");
        person.setAge(45);
        person.print();
    }
}
