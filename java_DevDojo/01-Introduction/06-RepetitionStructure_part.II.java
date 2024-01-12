public class RepetitionStructure_part.II {
    public static void main(String[] args) {
        // Break in the loop
        // Print only 25 numbers out of 50
        int numberMax = 50;

        /*for (int i = 1; i < 50; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }*/

        // Exercise
        // Given the values of a car, how many times can it be paid in installments? 
        // Condition: Installment values cannot be less than 1280.
        int carPrice = 45000;

        for (int installment = 1; installment < 100; installment++) {
            double installmentValue = carPrice / installment;
            if (installmentValue < 1280) {
                break;
            }
            System.out.println("Installment " + installment + " - R$ " + installmentValue);
        }
    }
}