package desafios1;

public class SubstringComparisons {

    public static void main(String[] args) {
        System.out.println(getSmallestAndLargest("welcometojava", 3));
    }

    public static String getSmallestAndLargest(String s, int k) {
        // Quantidade de combinações possiveis == s.lenght() - k + 1
        String combinacoes[] = new String[s.length() - k + 1];
        String aux = "";

        // Primeiro looping para popular as combinações possíveis
        for (int i = 0; i < combinacoes.length; i++) {
            combinacoes[i] = s.substring(i, i + 3);
        }

        // Ordenação Bubble Sort
        for (int i = 0; i < combinacoes.length; i++) {
            for (int j = 0; j < combinacoes.length - 1; j++) {
                if (combinacoes[j].compareTo(combinacoes[j + 1]) > 0) {
                    aux = combinacoes[j];
                    combinacoes[j] = combinacoes[j + 1];
                    combinacoes[j + 1] = aux;
                }
            }
        }

        return combinacoes[0] + "\n" + combinacoes[combinacoes.length - 1];
    }
}
