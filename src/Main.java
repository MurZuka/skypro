public class Main {
    private static Employee[] empDB = new Employee[10];
    public static void main(String[] args) {
        empDB = new Employee[]{new Employee("Вася Петухов", 1, 500),
                               new Employee("Алексей Иванов", 1, 1100),
                               new Employee("Игорь Петров", 2, 220),
                               new Employee("Антон Яковлев", 3, 1240),
                               new Employee("Юрий Гагарин", 3, 700)
        };

        printEmployeesByDepartment(1);
        //printAllEmployees();
        //printEmployeesNames();
        //System.out.println("Сумма затрат на ЗП в месяц: " + getSalarySum());
        //System.out.println("Среднее значение зарплат: " + getSalarySum() / empDB.length);
    }

    //Повышенная сложность
    public static void indexSalaries(double rate) {
        double currentIncrease;

        for (Employee emp : empDB) {
            currentIncrease = (double) emp.getSalary() * rate;
            emp.setSalary(emp.getSalary() + (int) currentIncrease);
        }
    }

    public static Employee getMinSalaryEmployeeByDepartment(int targetDepartment) {
        Employee minSalaryEmployee = null;

        for (Employee emp : empDB) {
            if (emp.getDepartment() == targetDepartment) {
                if (minSalaryEmployee == null || minSalaryEmployee.getSalary() > emp.getSalary()) {
                    minSalaryEmployee = emp;
                }
            }
        }

        return minSalaryEmployee;
    }

    public static Employee getMaxSalaryEmployeeByDepartment(int targetDepartment) {
        Employee maxSalaryEmployee = null;

        for (Employee emp : empDB) {
            if (emp.getDepartment() == targetDepartment) {
                if (maxSalaryEmployee == null || maxSalaryEmployee.getSalary() < emp.getSalary()) {
                    maxSalaryEmployee = emp;
                }
            }
        }

        return maxSalaryEmployee;
    }

    public static int getSalarySumByDepartment(int targetDepartment) {
        int sumSalary = 0;

        for (Employee emp : empDB) {
            if (emp.getDepartment() == targetDepartment) {
                sumSalary += emp.getSalary();
            }
        }

        return sumSalary;
    }

    public static int getAverageSalaryByDepartment(int targetDepartment) {
        int depEmpsCount = 0;

        for (Employee emp : empDB) {
            if (emp.getDepartment() == targetDepartment) {
                depEmpsCount++;
            }
        }

        return getSalarySumByDepartment(targetDepartment) / depEmpsCount;
    }

    public static void indexSalariesByDepartment(int targetDepartment, double rate) {
        double currentIncrease;

        for (Employee emp : empDB) {
            if (emp.getDepartment() == targetDepartment) {
                currentIncrease = (double) emp.getSalary() * rate;
                emp.setSalary(emp.getSalary() + (int) currentIncrease);
            }
        }
    }

    public static void printEmployeesByDepartment(int targetDepartment) {
        for (Employee emp : empDB) {
            if (emp.getDepartment() == targetDepartment) {
                System.out.println(emp.toString(targetDepartment));
            }
        }
    }

    public static void printEmployeesWithSalaryLess(int salaryThreshold) {
        for (Employee emp : empDB) {
            if (emp.getSalary() < salaryThreshold) {
                System.out.println(emp.toString());
            }
        }
    }

    public static void printEmployeesWithSalaryGreaterOrEqual(int salaryThreshold) {
        for (Employee emp : empDB) {
            if (emp.getSalary() >= salaryThreshold) {
                System.out.println(emp.toString());
            }
        }
    }

    //Базовая сложность
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