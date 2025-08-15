package desafios1;

import java.util.Scanner;

public class IntToString {
    public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if(x > -100 && x <= 100) {
            String.valueOf(x);
            System.out.println(x);
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }
        in.close();
    }
}
