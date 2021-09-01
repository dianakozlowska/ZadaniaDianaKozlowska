public class Zadanie2 {
    public static void main(String[] args) {
        int row = 9;
        for (int y = 0; y < row; y++) {
            int rowNo = y + 1;
            System.out.print(rowNo + ": ");
            for (int i = row; i > y; i--) {
                System.out.print(" ");
            }
            int g = 2 * y + 1;
            for (int stars = 0; stars < g; stars++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int y = row; y >= 0; y--) {
            int rowNo = y + 1;
            System.out.print(rowNo + ": ");
            for (int i = row; i > y; i--) {
                System.out.print(" ");
            }
            int g = 2 * y + 1;
            for (int stars = 0; stars < g; stars++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}