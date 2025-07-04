public class Main {

    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.setEmpDB(new Employee[]{new Employee("Вася Петухов", 1, 500),
                              new Employee("Алексей Иванов", 1, 1100),
                              new Employee("Игорь Петров", 2, 220),
                              new Employee("Антон Яковлев", 3, 1240),
                              new Employee("Юрий Гагарин", 3, 700)}
        );

        employeeBook.deleteEmployee(2);
        employeeBook.deleteEmployee(2);

        employeeBook.addEmployee(new Employee("Иван Рыков", 4, 788));

        employeeBook.printAllEmployees();
        System.out.println("Сумма затрат на ЗП в месяц: " + employeeBook.getSalarySum());
        employeeBook.getMinSalaryEmployee();
    }
}