//Сложность «Очень сложно»
public class EmployeeBook {
    private Employee[] empDB = new Employee[10];

    public void setEmpDB(Employee[] empDB) {
        this.empDB = empDB;
    }

    public boolean addEmployee(Employee emp) {
        for (int i = 0; i < empDB.length; i++) {
            if (empDB[i] == null) {
                empDB[i] = emp;
                return true;
            }
        }

        return false;
    }

    public void deleteEmployee(int targetId) {
        for (int i = 0; i < empDB.length; i++) {
            if (!(empDB[i] == null)) {
                if (empDB[i].getId() == targetId) {
                    empDB[i] = null;
                    break;
                }
            }
        }
    }

    public Employee getEmployeeById(int targetId) {
        for (Employee emp : empDB) {
            if (!(emp == null)) {
                if (emp.getId() == targetId) {
                    return emp;
                }
            }
        }

        return null;
    }

    //Базовая сложность
    public void printAllEmployees() {
        for (Employee emp : empDB) {
            if (!(emp == null)) {
                System.out.println(emp.toString());
            }
        }
    }

    public int getSalarySum() {
        int sumSalary = 0;

        for (Employee emp : empDB) {
            if (!(emp == null)) {
                sumSalary += emp.getSalary();
            }
        }

        return sumSalary;
    }

    public Employee getMinSalaryEmployee() {
        Employee minSalaryEmployee = empDB[0];

        for (Employee emp : empDB) {
            if (!(emp == null)) {
                if (minSalaryEmployee.getSalary() > emp.getSalary()) {
                    minSalaryEmployee = emp;
                }
            }
        }

        return minSalaryEmployee;
    }

    public Employee getMaxSalaryEmployee() {
        Employee maxSalaryEmployee = empDB[0];

        for (Employee emp : empDB) {
            if (!(emp == null)) {
                if (maxSalaryEmployee.getSalary() < emp.getSalary()) {
                    maxSalaryEmployee = emp;
                }
            }
        }

        return maxSalaryEmployee;
    }

    public int getAverageSalary() {
        return getSalarySum() / empDB.length;
    }

    public void printEmployeesNames() {
        for (Employee emp : empDB) {
            if (!(emp == null)) {
                System.out.println(emp.getFullName());
            }
        }
    }

    //Повышенная сложность
    public void indexSalaries(double rate) {
        double currentIncrease;

        for (Employee emp : empDB) {
            if (!(emp == null)) {
                currentIncrease = (double) emp.getSalary() * rate;
                emp.setSalary(emp.getSalary() + (int) currentIncrease);
            }
        }
    }

    public Employee getMinSalaryEmployeeByDepartment(int targetDepartment) {
        Employee minSalaryEmployee = null;

        for (Employee emp : empDB) {
            if (!(emp == null)) {
                if (emp.getDepartment() == targetDepartment) {
                    if (minSalaryEmployee == null || minSalaryEmployee.getSalary() > emp.getSalary()) {
                        minSalaryEmployee = emp;
                    }
                }
            }
        }

        return minSalaryEmployee;
    }

    public Employee getMaxSalaryEmployeeByDepartment(int targetDepartment) {
        Employee maxSalaryEmployee = null;

        for (Employee emp : empDB) {
            if (!(emp == null)) {
                if (emp.getDepartment() == targetDepartment) {
                    if (maxSalaryEmployee == null || maxSalaryEmployee.getSalary() < emp.getSalary()) {
                        maxSalaryEmployee = emp;
                    }
                }
            }
        }

        return maxSalaryEmployee;
    }

    public int getSalarySumByDepartment(int targetDepartment) {
        int sumSalary = 0;

        for (Employee emp : empDB) {
            if (!(emp == null)) {
                if (emp.getDepartment() == targetDepartment) {
                    sumSalary += emp.getSalary();
                }
            }
        }

        return sumSalary;
    }

    public int getAverageSalaryByDepartment(int targetDepartment) {
        int depEmpsCount = 0;

        for (Employee emp : empDB) {
            if (!(emp == null)) {
                if (emp.getDepartment() == targetDepartment) {
                    depEmpsCount++;
                }
            }
        }

        return getSalarySumByDepartment(targetDepartment) / depEmpsCount;
    }

    public void indexSalariesByDepartment(int targetDepartment, double rate) {
        double currentIncrease;

        for (Employee emp : empDB) {
            if (!(emp == null)) {
                if (emp.getDepartment() == targetDepartment) {
                    currentIncrease = (double) emp.getSalary() * rate;
                    emp.setSalary(emp.getSalary() + (int) currentIncrease);
                }
            }
        }
    }

    public void printEmployeesByDepartment(int targetDepartment) {
        for (Employee emp : empDB) {
            if (!(emp == null)) {
                if (emp.getDepartment() == targetDepartment) {
                    System.out.println(emp.toString(targetDepartment));
                }
            }
        }
    }

    public void printEmployeesWithSalaryLess(int salaryThreshold) {
        for (Employee emp : empDB) {
            if (!(emp == null)) {
                if (emp.getSalary() < salaryThreshold) {
                    System.out.println(emp.toString());
                }
            }
        }
    }

    public void printEmployeesWithSalaryGreaterOrEqual(int salaryThreshold) {
        for (Employee emp : empDB) {
            if (!(emp == null)) {
                if (emp.getSalary() >= salaryThreshold) {
                    System.out.println(emp.toString());
                }
            }
        }
    }
}
