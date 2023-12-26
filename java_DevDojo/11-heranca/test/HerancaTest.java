package devDojo.heranca.test;

import devDojo.heranca.domain.Address;
import devDojo.heranca.domain.Aployee;
import devDojo.heranca.domain.People;

public class HerancaTest {
    public static void main(String[] args) {
        Address address = new Address();
        address.setStreet("Rua abc");
        address.setCep("123456789");

        People people = new People("Pedro","12398745691", address);
        //people.setName("Pedro");
        //people.setCpf("12398745691");
        //people.setAddress(address);

        Aployee aployee = new Aployee("Felipe", "95195263255", address, 1423.50);
        //aployee.setName("Felipe");
        //aployee.setCpf("95195263255");
        //aployee.setAddress(address);
        //aployee.setSalary(1423.50);

        people.print();
        System.out.println("_____________________________");
        aployee.print();
        System.out.println("_____________________________");
        aployee.salaryReport();

    }
}
