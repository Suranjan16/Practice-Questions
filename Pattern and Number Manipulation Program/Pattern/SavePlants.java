public class SavePlants {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7 - i + 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 6; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 3; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
