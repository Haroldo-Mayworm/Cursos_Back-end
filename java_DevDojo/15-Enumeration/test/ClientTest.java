import domain.Client;
import domain.TypeClient;
import domain.TypePayment;

public class ClientTest {

  public static void main(String[] args) {
    Client client01 = new Client("Pedro",TypeClient.PESSOA_FISICA,TypePayment.CREDITO);
    Client client02 = new Client("Luis",TypeClient.PESSOA_JURIDICA,TypePayment.DEBITO);

    //        System.out.println(client01);
    //        System.out.println(client02);
    System.out.println(TypePayment.DEBITO.calculateDiscount(150));
    System.out.println(TypePayment.CREDITO.calculateDiscount(150));
  }
}
