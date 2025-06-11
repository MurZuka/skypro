public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog + "\n" + cat + "\n" + paper);

        dog += 4;
        cat +=4;
        paper += 4;

        System.out.println(dog + "\n" + cat + "\n" + paper);

        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;

        System.out.println(dog + "\n" + cat + "\n" + paper);

        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);

        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        System.out.println(boxerWeight1 + boxerWeight2);
        System.out.println(boxerWeight1 - boxerWeight2);

        var weightsRemainder = boxerWeight2 % boxerWeight1;
        System.out.println(weightsRemainder);

        var employeesNumber = 640;
        var hoursPerEmployee = 8;
        System.out.println("Всего сотрудников в компании — " + employeesNumber / hoursPerEmployee + " человек");

        employeesNumber += 94;
        System.out.println("Если в компании работает " + employeesNumber + " человек, то всего " +
                            employeesNumber / hoursPerEmployee + " часов работы может быть поделено между сотрудниками");
    }
}