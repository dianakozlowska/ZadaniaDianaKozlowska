public class Zadanie3 {
    public static void main(String[] args) {
        int randomNum = 0;
        int max = 0;
        int min = 0;
        int[] tab = new int[8];
        for (int i = 0; i < tab.length; i++) {
            randomNum = (int) (Math.random() * 10);
            tab[i] = randomNum;
            System.out.print(tab[i] + ", ");
            tab[1] = max;
            if (tab[i] > max) max = tab[i];
            tab[1] = min;
            if (tab[i] < min) min = tab[i];

        }
        System.out.println();
        System.out.println("max=" + max);
        System.out.println("min=" + min);
        System.out.println("koniec");
    }
}