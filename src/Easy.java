import java.util.Arrays;

    public class Easy {
        private final Employee[] employees;

        public Easy(Employee[] employees) {
            this.employees = employees;
        }

        public void printEmployees() {
            Arrays.stream(employees)
                    .forEach(System.out::println);
        }

        public int calculateTotalSalary() {
            int sum = 0;
            for (Employee employee : employees) {
                sum += employee.getSalary();
            }
            return sum;
        }

        public Employee findEmployeeWithMinSalary() {
            Employee employeeWithMinSalary;

            employeeWithMinSalary = employees[0];
            for (Employee employee : employees) {
                if (employee.getSalary() < employeeWithMinSalary.getSalary()) {
                    employeeWithMinSalary = employee;
                }
            }

            return employeeWithMinSalary;
        }

        public Employee findEmployeeWithMaxSalary() {
            Employee employeeWithMaxSalary;

            employeeWithMaxSalary = employees[0];
            for (Employee employee : employees) {
                if (employee.getSalary() > employeeWithMaxSalary.getSalary()) {
                    employeeWithMaxSalary = employee;
                }
            }

            return employeeWithMaxSalary;
        }

        public float calculateAverageSalary() {
            int sum = 0;

            for (Employee employee : employees) {
                if (employee != null) {
                    sum += employee.getSalary();
                }
            }

            return (float) sum / employees.length;
        }

        public void printFullNames() {
            for (Employee employee : employees) {
                System.out.println(
                        employee.getFirstName() + " " + employee.getLastName() + " " + employee.getMiddleName()
                );
            }
        }
    }