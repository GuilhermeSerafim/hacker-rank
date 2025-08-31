package nubank.revisoes;

public class NumeroMultiplo {
    public static void main(String[] args) {
        fizzBuzz(15);
    }
    public static void fizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}
