package nubank.revisoes;

import java.util.HashMap;
import java.util.Map;

public class ExemplosHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> frutas = new HashMap<>();

        // Adicionar valores
        frutas.put("banana", 5);
        frutas.put("maçã", 3);
        frutas.put("abacate", 10);

        // Acessar valor pela chave
        System.out.println(frutas.get("banana")); // 5

        // Atualizar valors
        frutas.put("banana", frutas.get("banana") + 1);
        System.out.println(frutas.get("banana")); // 6

        // Verificar se existe chave
        System.out.println(frutas.containsKey("uva")); // false

        // Delete
        frutas.remove("banana");

        // Percorrer
        System.out.println("Chaves:");
        for (String chave : frutas.keySet()) {
            System.out.println("Fruta: " + chave);
        }
        System.out.println("Valores");
        for (Integer valor : frutas.values()) {
            System.out.println("Quantidade: " + valor);
        }
        System.out.println("Chaves e Valores");
        for (HashMap.Entry<String, Integer> entrada : frutas.entrySet()) {
            System.out.println("Fruta: " + entrada.getKey() + " -> Quantidade: " + entrada.getValue());
        }

        // Atualizando valor durante a interação
        for (Map.Entry<String, Integer> entrada : frutas.entrySet()) {
            if (entrada.getKey().equals("abacate")) {
                // setValue() foi feito para ser usado dentro do foreach apenas, não use o put dentro do foreach para atualizar valores
                entrada.setValue(50);
            }
        }

        for (HashMap.Entry<String, Integer> entrada : frutas.entrySet()) {
            System.out.println("Fruta: " + entrada.getKey() + " -> Quantidade: " + entrada.getValue());
        }
    }
}
