public class Zadanie4 {
    static void swap(int[] tab, int a, int b) {
        int c = tab[a];
        tab[a] = tab[b];
        tab[b] = c;

    }

    static void printTab(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
    }

    //Zadanie 1.
    public static void main(String[] args) {
        int[] tab = new int[2];
        tab[0] = 7;
        tab[1] = 9;
        swap(tab, 0, 1);
        printTab(tab);

        //Zadanie 2. i 3.

        int[] tab2 = new int[7];
        for (int i = 0; i < tab2.length; i++) {
            tab2[i] = i + 1;
        }
        printTab(tab2);
        //można zrobić tak
//        swap(tab2,0,6);
//        swap(tab2,1,5);
//        swap(tab2,2,4);
//        printTab(tab2);
        //a tu (z drobną pomocą :) udało mi się wpaść na coś takiego, żeby działało dla każdej długości)

        for (int i = 0; i < tab2.length / 2; i++) {
            swap(tab2, i, tab2.length - i - 1);
        }
        printTab(tab2);
    }
}
