import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        isYearLeap(1589);

        System.out.println("Задача 2");
        printVersion(0, 2025);

        System.out.println("Задача 3");
    }

    public static void isYearLeap (int year) {
        boolean isLeap = year > 1584 && year % 4 == 0 && !(year % 100 == 0 && !(year % 400 == 0));
        String appendix = "";

        if (!(isLeap)) {
            appendix = "не";
        }

        System.out.println(year + " год — " + appendix + "високосный год");
    }

    public static void printVersion (int os, int releaseYear) {
        int currentYear = LocalDate.now().getYear();
        String osName = os == 0 ? "iOS" : "Android";

        System.out.println("Установить " + (releaseYear < currentYear ? "облегчённую" : "обычную") + " версию приложения для " + osName);
    }
}