public class Zadanie2 {
    public static void main(String[] args) {
        int stars = 3;
        for (int y = 1; y < 7; y++) {
            System.out.print(y + ": ");
            for (int i = 7; i > y; i--) {
                System.out.print(" ");
            }
            for (int i = 0; i < y; i++) {
                System.out.print("*");
            }
            for (int i = 1; i < y; i++) {
                System.out.print("*");
            }
            for (int i = 7; i > y; i--) {
                System.out.print(" ");
            }

            System.out.println();
        }
        for (int y = 7; y > 0; y--) {
            System.out.print(y + ": ");
            for (int i = 7; i > y; i--) {
                System.out.print(" ");
            }
            for (int i = 0; i < y; i++) {
                System.out.print("*");
            }
            for (int i = 1; i < y; i++) {
                System.out.print("*");
            }
            for (int i = 7; i > y; i--) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
