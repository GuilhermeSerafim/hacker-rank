package desafios1;

import java.util.Arrays;

public class SubstringComparisons {

    public static void main(String[] args) {
        System.out.println(getSmallestAndLargest("welcometojava", 3));
    }

    public static String getSmallestAndLargest(String s, int k) {
        // Quantidade de combinações possiveis == s.lenght() - k + 1
        String combinacoes[] = new String[s.length() - k + 1];

        // Primeiro looping para popular as combinações possíveis
        for (int i = 0; i < combinacoes.length; i++) {
            combinacoes[i] = s.substring(i, i + 3);
        }

        Arrays.sort(combinacoes);

        return combinacoes[0] + "\n" + combinacoes[combinacoes.length - 1];
    }
}
