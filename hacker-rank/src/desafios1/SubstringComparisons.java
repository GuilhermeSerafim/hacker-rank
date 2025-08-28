package desafios1;

public class SubstringComparisons {

    public static void main(String[] args) {
        // System.out.println(getSmallestAndLargest("welcometojava", 3));
        getSmallestAndLargest("welcometojava", 3);
    }

    public static void getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        // Quantidade de combinações possiveis == s.lenght() - k + 1
        String combinacoes[] = new String[s.length() - k + 1];

        for (int i = 0; i < combinacoes.length; i++) {
            combinacoes[i] = s.substring(i, i + 2);
        }

        System.out.println(combinacoes.toString());
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        // return smallest + "\n" + largest;
    }
}
