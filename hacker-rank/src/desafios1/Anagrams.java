package desafios1;

import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
        System.out.println(isAnagram(a, b) ? "Anagrams" : "Not Anagrams");
        in.close();
    }

    static boolean isAnagram(String a, String b) {
        String letrasA[] = a.toLowerCase().split("");
        String letrasB[] = b.toLowerCase().split("");

        if(letrasA.length != letrasB.length) return false;

        ordernaStr(letrasA);
        ordernaStr(letrasB);

        for (int i = 0; i < letrasA.length; i++) {
            if(!(letrasA[i].equals(letrasB[i]))) return false;
        }

        return true;
    }

    private static void ordernaStr(String[] arr) {
        String aux = "";
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                }
            }
        }
    }
}
