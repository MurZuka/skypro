import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        int someInt = 35000;
        byte someByte = -110;
        short someShort = 5;
        long someLong = 9_100_235_555L;
        float someFloat = 5.60f;
        double someDouble = 0.23567843;

        System.out.println("Задача 1:\n" +
                           "Значение переменной someInt с типом int равно " + someInt + "\n" +
                           "Значение переменной someByte с типом byte равно " + someByte + "\n" +
                           "Значение переменной someShort с типом short равно " + someShort + "\n" +
                           "Значение переменной someLong с типом long равно " + someLong + "\n" +
                           "Значение переменной someShort с типом float равно " + someFloat + "\n" +
                           "Значение переменной someDouble с типом double равно " + someDouble + "\n");

        byte anotherByte = 67;
        int anotherInt = 27897;
        short anotherShort1 = 569;
        short anotherShort2 = -159;
        long anotherLong = 987_678_965_549L;
        float anotherFloat = 2.786f;
        double anotherDouble = 27.12;

        System.out.println("Задача 2:\n" +
                           "Значение переменной anotherByte с типом byte равно " + anotherByte + "\n" +
                           "Значение переменной anotherInt с типом int равно " + anotherInt + "\n" +
                           "Значение переменной anotherShort1 с типом short равно " + anotherShort1 + "\n" +
                           "Значение переменной anotherShort2 с типом short равно " + anotherShort2 + "\n" +
                           "Значение переменной anotherLong с типом long равно " + anotherLong + "\n" +
                           "Значение переменной anotherFloat с типом float равно " + anotherFloat + "\n" +
                           "Значение переменной anotherDouble с типом double равно " + anotherDouble + "\n");

        byte sheetsPerPupil = 480 / (23 + 27 + 30);
        System.out.println("Задача 3:\n" +
                           "На каждого ученика рассчитано " + sheetsPerPupil + " листов бумаги\n");

        byte bottlesPerMinute = 16 / 2;
        short bottlesPerDay = (short) (24 * 60 * bottlesPerMinute);

        System.out.println("Задача 4:\n" +
                           "За 20 минут машина произвела " + 20 * bottlesPerMinute + " штук бутылок\n" +
                           "За сутки машина произвела " + bottlesPerDay + " штук бутылок\n" +
                           "За 3 дня машина произвела " + 3 * bottlesPerDay + " штук бутылок\n" +
                           "За 1 месяц машина произвела " + 30 * bottlesPerDay + " штук бутылок\n");

        byte whiteColorNeeded = 2;
        byte brownColorNeeded = 4;
        byte classRoomsTotal = (byte) (120 / (whiteColorNeeded + brownColorNeeded));

        System.out.println("Задача 5:\n" +
                           "В школе, где " + classRoomsTotal + " классов, нужно " + classRoomsTotal * whiteColorNeeded + " банок белой краски и " +
                           classRoomsTotal * brownColorNeeded + " банок коричневой краски\n");

        byte bananaMass = 80;
        short milkMass = 105;
        short iceCreamMass = 100;
        byte eggMass = 70;

        short allMassG = (short) ((5 * bananaMass) + (2 * milkMass) + (2 * iceCreamMass) + (4 * eggMass));
        float allMassKG = (allMassG / (float) 1000);

        System.out.println("Задача 6:\n" +
                           "Вес завтрака в граммах — " + allMassG + "\n" +
                           "Вес завтрака в килограммах — " + allMassKG + "\n");

        short targetWeight = 7000;
        short averageLoss = (250 + 500) / 2;

        System.out.println("Задача 7:\n" +
                           "Если худеть на 250 г в день, то на сброс уйдёт " + targetWeight / 250 + " дней\n" +
                           "Если худеть на 500 г в день, то на сброс уйдёт " + targetWeight / 500 + " дней\n" +
                           "В среднем понадобится " + targetWeight / averageLoss + " дней\n");

        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        float growthInterest = (float) 0.1;

        System.out.println("Задача 8:\n" +
                "Маша теперь получает " + (salaryMasha + (salaryMasha * growthInterest)) + " рублей. Годовой доход вырос на " + (salaryMasha * growthInterest) + " рублей \n" +
                "Денис теперь получает " + (salaryDenis + (salaryDenis * growthInterest)) + " рублей. Годовой доход вырос на " + (salaryDenis * growthInterest) + " рублей \n" +
                "Кристина теперь получает " + (salaryKristina + (salaryKristina * growthInterest)) + " рублей. Годовой доход вырос на " + (salaryKristina * growthInterest) + " рублей");
    }
}