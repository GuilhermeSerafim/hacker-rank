package nubank.revisoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringTokens {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        // Dividi entre o que não seja letra
        String[] tokens = s.split("[^A-Za-z]+");
        List<String> l = new ArrayList<>();

        // Filtra tokens vazios
        for (String t : tokens) {
            if (!t.isEmpty())
                l.add(t);
        }

        System.out.println(l.size());
        for (String str : l) {
            System.out.println(str);
        }
        in.close();
    }
}
