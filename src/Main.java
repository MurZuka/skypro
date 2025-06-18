public class Main {
        public static void main(String[] args) {
            System.out.println("Задача 1");
            int targetSum = 2459000;
            int monthlySum = 15000;
            int currentSum = 0;
            int monthsNeeded = 0;

            do {
                currentSum += monthlySum;
                monthsNeeded++;

                System.out.println("Месяц " + monthsNeeded + ", сумма накоплений равна " + currentSum + " рублей");
            } while (currentSum < targetSum);

            System.out.println("Задача 2");

            byte i = 1;
            while (i <= 10) {
                System.out.print(i + " ");
                i++;
            }

            System.out.println("");

            for (i = 10; i > 0; i--) {
                System.out.print(i + " ");
            }

            System.out.println("");

            System.out.println("Задача 3");

            int currentPopulation = 12_000_000;
            float birthRate = (float) 17 / 1000;
            float deathRate = (float) 8 / 1000;

            for (int year = 1; year <= 10; year++) {
                currentPopulation = (int) (currentPopulation + (currentPopulation * birthRate) - (currentPopulation * deathRate));
                System.out.println("Год " + year + ", численность населения составляет " + currentPopulation);
            }

            System.out.println("Задача 4");

            float interestRate = 0.07f;
            monthsNeeded = 0;
            currentSum = 15000;
            targetSum = 12000000;

            while (currentSum <= targetSum) {
                currentSum += currentSum * interestRate;
                monthsNeeded++;

                System.out.println("Месяц " + monthsNeeded + ", сумма накоплений равна " + currentSum + " рублей");
            }

            System.out.println("Задача 5");

            monthsNeeded = 0;
            currentSum = 15000;

            while (currentSum <= targetSum) {
                currentSum += currentSum * interestRate;
                monthsNeeded++;

                if (monthsNeeded % 6 == 0)
                    System.out.println("Месяц " + monthsNeeded + ", сумма накоплений равна " + currentSum + " рублей");
            }

            System.out.println("Задача 6");

            currentSum = 15000;

            for (monthsNeeded = 1; monthsNeeded <= (9 * 12); monthsNeeded++) {
                currentSum += currentSum * interestRate;

                if (monthsNeeded % 6 == 0) {
                    System.out.println("Месяц " + monthsNeeded + ", сумма накоплений равна " + currentSum + " рублей");
                }
            }

            System.out.println("Задача 7");

            for (int fridayNum = 2; fridayNum <= 31; fridayNum += 7) {
                System.out.println("Сегодня пятница, " + fridayNum + "-е число. Необходимо подготовить отчёт");
            }

            System.out.println("Задача 8");

            short initialYear = 1825;

            for (short year = initialYear; year <= (initialYear + 300); year++) {
                if (year % 79 == 0) {
                    System.out.println(year);
                }
            }
        }
    }
}