public class Zadanie1 {
    public static void main(String[] args) {
        int wiek = 102;
        if (wiek < 0) return;
        if (wiek > 102) return;
        if (wiek < 18) {
            System.out.println("Dziecko");
        } else if (wiek < 30) {
            System.out.println("Jest młody");
        } else if (wiek < 65) {
            System.out.println("Jest w średnim wieku");
        } else {
            System.out.println("Jest stary");
        }
    }
}
