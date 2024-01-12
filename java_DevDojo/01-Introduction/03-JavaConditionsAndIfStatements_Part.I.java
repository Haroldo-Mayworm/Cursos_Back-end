public class JavaConditionsAndIfStatements_Part.I {

  public static void main(String[] args) {
    // IF
    /*if (true) {
            System.out.println("True condition");
        } else {
            System.out.println("False condition");
        }*/

    /*int age = 21;
        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Adolescent");
        }*/

    /*int age = 17;
        boolean isLegalAge = age >= 18;
        if (isLegalAge) {
            System.out.println("Can buy beer");
        } else {
            System.out.println("Can't buy beer");
        }*/

    /*int grade = 9;
        if (grade < 6) {
            System.out.println("Reproved");
        } else if (grade >= 6 && grade <= 8) {
            System.out.println("Approved, but you can improve");
        } else if (grade > 8 && grade <= 10) {
            System.out.println("Approved, congratulation");
        }*/

    // Ternário
    /*double salary = 4000;
        String positiveMessage = "I can donate R$500,00";
        String negativeMessage = "I can't donate";
        String finalMessage = salary >= 4500 ? positiveMessage : negativeMessage;
        System.out.println(finalMessage);*/

    // Exercise
    // Determine the amount of tax you will have to pay compared to salary
    double salary = 10000;
    double taxOne = 9.70 / 100;
    double taxTwo = 22.20 / 100;
    double taxThree = 35.20 / 100;
    double tax = 0;

    if (salary > 0 && salary <= 2000) {
      tax = salary * taxOne;
    } else if (salary > 2000 && salary <= 5000) {
      tax = salary * taxTwo;
    } else {
      tax = salary * taxThree;
    }
    System.out.println(tax);
  }
}
