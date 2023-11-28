public class Aula05EstruturasDeRepeticaoParte3 {
    public static void main(String[] args) {
        // Continue em um loop
        int carPrice = 45000;

        for (int installment = carPrice; installment >= 1; installment--) {
            double installmentValue = carPrice / installment;
            if (installmentValue < 1280) {
                continue;
            }
            System.out.println("Parcela " + installment + " - R$ " + installmentValue);
        }
    }
}