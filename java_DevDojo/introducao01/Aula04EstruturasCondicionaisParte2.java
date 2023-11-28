public class Aula04EstruturasCondicionaisParte2 {
    public static void main(String[] args) {
        // Switch
        /*byte day = 50;
        switch (day) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Dia inválido!");
                break;
        }*/

        /*char gender = 'f';
        switch (gender) {
            case 'f':
                System.out.println("É uma Mulher");
                break;
            case 'm':
                System.out.println("É um homem");
                break;
            default:
                System.out.println("Opção inválida");
        }*/

        // Exercício
        // Dados os valores de 0 - 6, imprima se é dia útil ou final de semana. *Considere 0 como domingo
        byte day = 0;
        switch (day) {
            case 0:
                System.out.println("Final de semana");
                break;
            case 1:
                System.out.println("Dia útil");
                break;
            case 2:
                System.out.println("Dia útil");
                break;
            case 3:
                System.out.println("Dia útil");
                break;
            case 4:
                System.out.println("Dia útil");
                break;
            case 5:
                System.out.println("Dia útil");
                break;
            case 6:
                System.out.println("Final de semana");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
