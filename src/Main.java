public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");

        short age = 15;

        System.out.print("Если возраст человека равен " + age + ", то он ");
        if (age >= 18) {
            System.out.println("совершеннолетний");
        } else {
            System.out.println("не достиг совершеннолетия, нужно немного подождать");
        }

        System.out.println("Задача 2");

        byte temp = -5;

        if (temp > 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        } else {
            System.out.println("На улице холодно, нужно надеть шапку");
        }

        System.out.println("Задача 3");

        short speed = 61;

        if (speed > 60) {
            System.out.println("Скорость превышена");
        } else {
            System.out.println("Превышения скорости нет");
        }

        System.out.println("Задача 4");
        System.out.print("Если возраст человека равен " + age + ", то ему нужно ходить ");

        if (age >= 2 && age <=6) {
            System.out.println("в детский сад");
        } else if (age >= 7 && age <= 17) {
            System.out.println("в школу");
        } else if (age >= 18 && age <= 24) {
            System.out.println("в университет");
        } else if (age > 24) {
            System.out.println("на работу");
        }

        System.out.println("Задача 5");
        System.out.print("Если возраст ребёнка равен " + age + ", то ");

        if (age < 5) {
            System.out.println("он не может кататься на аттракционе");
        } else if (age >= 5 && age < 14) {
            System.out.println("он может кататься только в сопровождении взрослого");
        } else if (age >= 14) {
            System.out.println("он может кататься без сопровождения взрослого");
        }

        System.out.println("Задача 6");
        short carCapacity = 102;
        short sittingPlaces = 60;
        short passengersCount = 61;

        if (passengersCount <= sittingPlaces) {
            System.out.println("Есть сидячие места в вагоне");
        } else if (passengersCount > sittingPlaces && passengersCount <= carCapacity) {
            System.out.println("Есть стоячие места в вагоне");
        } else if (passengersCount > carCapacity) {
            System.out.println("Мест нет");
        }

        System.out.println("Задача 7");
        int one = 1;
        int two = 2;
        int three = 3;

        if (one > two && one > three) {
            System.out.println("Наибольшее из трёх чисел — " + one);
        } else if (two > one && two > three) {
            System.out.println("Наибольшее из трёх чисел — " + two);
        } else if (three > one && three > two) {
            System.out.println("Наибольшее из трёх чисел — " + three);
        } else {
            System.out.println("Наибольшее из трёх чисел — " + one);
        }
    }
}