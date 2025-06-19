import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int spendings1[] = {100, 200, 300, 400, 500};
        int sum = 0;

        for (int i = 0; i < spendings1.length; i++) {
            sum += spendings1[i];
        }

        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println("Задача 2");
        int spendings2[] = {430, 222, 300, 400, 1700};
        int min = spendings2[0];
        int max = spendings2[0];

        for (int i = 0; i < spendings2.length; i++) {
            if (spendings2[i] > max) {
                max = spendings2[i];
            }

            if (spendings2[i] < min) {
                min = spendings2[i];
            }
        }

        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей. Максимальная сумма трат за неделю составила " + max + " рублей");

        System.out.println("Задача 3");
        int spendings3[] = {1111, 900, 1533, 400, 2200};

        sum = 0;
        for (int i = 0; i < spendings3.length; i++) {
            sum += spendings3[i];
        }

        System.out.println("Средняя сумма трат за месяц составила " + (sum / (float) spendings3.length) + " рублей");

        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char currentChar;
        int cursor1 = 0;
        int cursor2 = reverseFullName.length - 1;

        while (cursor1 < cursor2) {
            currentChar = reverseFullName[cursor1];
            reverseFullName[cursor1] = reverseFullName[cursor2];
            reverseFullName[cursor2] = currentChar;

            cursor1++;
            cursor2--;
        }

        System.out.println(reverseFullName);
    }
}