public class Main {
    public static void main(String[] args) {
        int tab[] = new int[10]; // Declaration of an array of type int

        for (int i = 0; i < tab.length; i++) {
            tab[i] = i; // Assigning the index value to the array element
        }

        for (int x : tab) {
            System.out.println("array[" + x + "] = " + tab[x]);
        }
    }
}