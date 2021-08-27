public class Zadanie2 {
    public static void main(String[] args) {
        for (int y = 0; y < 7; y++) {
            int rowNo = y+1;
            System.out.print(rowNo + ": ");
            for (int i = 7; i > y; i--) {
                System.out.print(" ");
            }
            int g = 2*y+1;
            for (int stars = 0; stars < g; stars++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int y = 7; y >= 0; y--) {
            int rowNo = y+1;
            System.out.print(rowNo + ": ");
            for (int i = 7; i > y; i--) {
                System.out.print(" ");
            }
            int g = 2*y+1;
            for (int stars = 0; stars < g; stars++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}