package desafios1;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String strInvertida = new StringBuilder(A).reverse().toString();
        System.out.println(A.equals(strInvertida) ? "Yes" : "No");
        sc.close();
    }
}
