public class Main {
    private static Employee[] empDB = new Employee[10];
    public static void main(String[] args) {
        empDB = new Employee[]{new Employee("Вася Петухов", 1, 500),
                               new Employee("Алексей Иванов", 1, 1100),
                               new Employee("Игорь Петров", 2, 220),
                               new Employee("Антон Яковлев", 3, 1240),
                               new Employee("Юрий Гагарин", 3, 700)
        };

        //printAllEmployees();
        printEmployeesNames();
        System.out.println("Сумма затрат на ЗП в месяц: " + getSalarySum());
        System.out.println("Среднее значение зарплат: " + getSalarySum() / empDB.length);
    }

    public static void printAllEmployees() {
        for (Employee emp : empDB) {
            System.out.println(emp.toString());
        }
    }

    public static int getSalarySum() {
        int sumSalary = 0;

        for (Employee emp : empDB) {
            sumSalary += emp.getSalary();
        }

        return sumSalary;
    }

    public static Employee getMinSalaryEmployee() {
        Employee minSalaryEmployee = empDB[0];

        for (Employee emp : empDB) {
            if (minSalaryEmployee.getSalary() > emp.getSalary()) {
                minSalaryEmployee = emp;
            }
        }

        return minSalaryEmployee;
    }

    public static Employee getMaxSalaryEmployee() {
        Employee maxSalaryEmployee = empDB[0];

        for (Employee emp : empDB) {
            if (maxSalaryEmployee.getSalary() < emp.getSalary()) {
                maxSalaryEmployee = emp;
            }
        }

        return maxSalaryEmployee;
    }

    public static int getAverageSalary() {
        return getSalarySum() / empDB.length;
    }

    public static void printEmployeesNames() {
        for (Employee emp : empDB) {
            System.out.println(emp.getFullName());
        }
    }
}