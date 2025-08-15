package desafios1;

import java.util.Calendar;
import java.util.Scanner;

public class DateAndTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] arr = in.nextLine().split(" ");
        System.out.println(findDay(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2])));

        in.close();
    }

    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);
        String[] dias = { "DOMINGO", "SEGUNDA", "TERÇA", "QUARTA", "QUINTA", "SEXTA", "SÁBADO" };
        return dias[cal.get(Calendar.DAY_OF_WEEK) - 1];
    }
}
