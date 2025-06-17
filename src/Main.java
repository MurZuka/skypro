public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int i;

        for (i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("Задача 2");

        for (i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("Задача 3");

        for (i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }

        System.out.println("Задача 4");

        for (i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        System.out.println("Задача 5");

        for (i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i);
        }

        System.out.println("Задача 6");

        for (i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        System.out.println("Задача 7");

        for (i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }

        System.out.println("Задача 8");
        int sum = 0;

        for (i = 1; i <= 12; i++) {
            sum = sum + 29000;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sum + " рублей");
        }

        System.out.println("Задача 9");
        double monthlySum = 0;

        for (i = 1; i <= 12; i++) {
            monthlySum = monthlySum + (monthlySum * 0.01) + 29000;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + monthlySum + " рублей");
        }

        System.out.println("Задача 10");

        for (i = 1; i <= 10; i++) {
            System.out.println("2*" + i + "=" + 2 * i);
        }
    }
}