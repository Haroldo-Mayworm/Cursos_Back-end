public class Aula05EstruturasDeRepeticaoParte2 {
    public static void main(String[] args) {
        // Break em um loop
        // imprimir somente 25 número dos 50.
        int numberMax = 50;

        /*for (int i = 1; i < 50; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }*/

        // Exercício
        // Dado um valor de um carro, quantas vezes ele poderá ser parcelado. *Condição: o valor da parcela não pode ser menor que 1280.
        int carPrice = 45000;

        for (int installment = 1; installment < 100; installment++) {
            double installmentValue = carPrice / installment;
            if (installmentValue < 1280) {
                break;
            }
            System.out.println("Parcela " + installment + " - R$ " + installmentValue);
        }
    }
}