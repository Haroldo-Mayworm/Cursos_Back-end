public class RepetitionStructure_part.III {
    public static void main(String[] args) {
        // Continue in the loop
        int carPrice = 45000;

        for (int installment = carPrice; installment >= 1; installment--) {
            double installmentValue = carPrice / installment;
            if (installmentValue < 1280) {
                continue;
            }
            System.out.println("Installment " + installment + " - R$ " + installmentValue);
        }
    }
}