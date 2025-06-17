public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");

        byte clientOS = 0;
        String os = clientOS == 1 ? "Android" : "iOS";

        System.out.println("Установите версию приложения для " + os + " по ссылке");

        System.out.println("Задача 2");
        short clientDeviceYear = 2015;

        if (clientDeviceYear < 2015) {
            System.out.println("Установите облегчённую версию приложения для " + os + " по ссылке");
        } else {
            System.out.println("Установите версию приложения для " + os + " по ссылке");
        }

        System.out.println("Задача 3");
        short year = 2021;
        boolean isLeap = year > 1584 && year % 4 == 0 && !(year % 100 == 0 && !(year % 400 == 0));

        System.out.println("Год" + (isLeap ? "" : " не") + " является високосным");

        System.out.println("Задача 4");
        short deliveryDistance = 95;
        byte days = 0;

        if (deliveryDistance >= 0 && deliveryDistance <= 20) {
            days = 1;
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            days = 2;
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            days = 3;
        } else {
            System.out.println("Доставки нет");
        }

        if (days > 0) {
            System.out.println("Потребуется дней: " + days);
        }

        System.out.println("Задача 5");
        byte monthNumber = 12;

        if (monthNumber >= 1 && monthNumber <= 12) {
            switch (monthNumber) {
                case 1, 2, 12:
                    System.out.println("Зима");
                    break;

                case 3, 4, 5:
                    System.out.println("Весна");
                    break;

                case 6, 7, 8:
                    System.out.println("Лето");
                    break;

                case 9, 10, 11:
                    System.out.println("Осень");
                    break;
            }
        }
    }
}