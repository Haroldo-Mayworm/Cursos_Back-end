public class JavaConditionsAndIfStatements_Part.II {
    public static void main(String[] args) {
        // Switch
        /*byte day = 50;
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid date!");
                break;
        }*/

        /*char gender = 'f';
        switch (gender) {
            case 'f':
                System.out.println("Is a woman");
                break;
            case 'm':
                System.out.println("Id a man");
                break;
            default:
                System.out.println("Invalid option");
        }*/

        // Exercise
        // Given the values ​​0 - 6, print whether it is a weekday or weekend. *Consider 0 as Sunday
        byte day = 0;
        switch (day) {
            case 0:
                System.out.println("Weekend");
                break;
            case 1:
                System.out.println("Weekday");
                break;
            case 2:
                System.out.println("Weekday");
                break;
            case 3:
                System.out.println("Weekday");
                break;
            case 4:
                System.out.println("Weekday");
                break;
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid option");
                
                break;
        }
    }
}