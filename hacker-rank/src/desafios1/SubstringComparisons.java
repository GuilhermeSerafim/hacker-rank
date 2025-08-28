package desafios1;

public class SubstringComparisons {

    public static void main(String[] args) {
        System.out.println("Case 1");
        System.out.println(getSmallestAndLargest("welcometojava", 3));
        // esperado:
        // ava
        // wel

        // System.out.println("Case 2");
        System.out.println(getSmallestAndLargest("abc", 2));
        // getSmallestAndLargest("abc", 2);
        // esperado:
        // ab
        // bc

        // System.out.println("Case 3");
        System.out.println(getSmallestAndLargest("zzzz", 2));
        // // esperado:
        // // zz
        // // zz

        // System.out.println("Case 4");
        System.out.println(getSmallestAndLargest("AbC", 2));
        // // esperado:
        // // Ab
        // // bC

        // System.out.println("Case 5");
        System.out.println(getSmallestAndLargest("programming", 4));
        // // esperado:
        // // ammi
        // // rogr

        // System.out.println("Case 6");
        System.out.println(getSmallestAndLargest("hi", 2));
        // // esperado:
        // // hi
        // // hi
    }

    public static String getSmallestAndLargest(String s, int k) {
        // Quantidade de combinações possiveis == s.lenght() - k + 1
        String combinacoes[] = new String[s.length() - k + 1];
        String aux = "";

        // Primeiro looping para popular as combinações possíveis
        for (int i = 0; i < combinacoes.length; i++) {
            // Tem que mudar aqui
            // combinacoes[i] = s.substring(i, i + 3);
            combinacoes[i] = s.substring(i, i + k);

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
