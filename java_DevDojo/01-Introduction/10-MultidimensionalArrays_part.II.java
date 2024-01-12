public class MultidimensionalArrays_part.II {
    public static void main(String[] args) {
        // Multidimensional arrays
        /*int[] arrayExternal = {1, 2, 3, 4, 5};
        int[][] arrayInt = new int[3][];
        arrayInt[0] = new int[1];
        arrayInt[1] = new int[]{1, 2, 3};
        arrayInt[2] = arrayExternal;

        for (int[] arrayBase : arrayInt) {
            System.out.println("\n__________");
            for (int i : arrayBase) {
                System.out.print(i);
            }
        }*/

        int[][] arrayIntTwo = {
                {1, 2, 3},
                {1, 2},
                {1, 2, 3, 4, 5, 6}
        };

        for (int[] arrayBase : arrayIntTwo) {
            System.out.println("\n__________");
            for (int i : arrayBase) {
                System.out.print(i);
            }
        }
    }
}