import java.util.Objects;

public class Employee {
    private static int id;
    private final int employeeId;
    private String fullName;
    private int department;
    private int salary;

    public Employee(String fullName, int department, int salary) {
        id++;
        this.employeeId = id;

        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return employeeId;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ID сотрудника: " + getId() + ";\n" +
               "ФИО: " + getFullName() + ";\n" +
               "Отдел: " + getDepartment() + ";\n" +
               "Зарплата: " + getSalary()+ ".";
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        } else {
            Employee emp2 = (Employee) other;
            return this.fullName.equals(emp2.fullName) && this.department == emp2.department;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(new Object[]{this.fullName, this.department, this.salary});
    }
}
