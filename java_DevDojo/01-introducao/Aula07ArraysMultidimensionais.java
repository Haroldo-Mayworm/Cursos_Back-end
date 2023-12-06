public class Aula07ArraysMultidimensionais {
    public static void main(String[] args) {
        // Arrays multidimensionais
        int[][] days = new int[12][1];
        days[0][0] = 31;
        days[1][0] = 28;
        days[2][0] = 31;
        days[3][0] = 30;
        days[4][0] = 31;
        days[5][0] = 30;
        days[6][0] = 31;
        days[7][0] = 31;
        days[8][0] = 30;
        days[9][0] = 31;
        days[10][0] = 30;
        days[11][0] = 31;

        /*for (int i = 0; i < days.length; i++) {
            for (int j = 0; j < days[i].length; j++) {
                System.out.println(days[i][j]);
            }
        }*/

        for (int[] arrayBase : days) {
            for (int i : arrayBase) {
                System.out.println(i);
            }
        }
    }
}