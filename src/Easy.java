import java.util.Arrays;

public class Easy {

    private static Employee[] employees = new Employee[10];

    public static Object main(String[] args) {
        Employee emp1 = new Employee("Иван", "Иванович", "Иванов", 1, 70000);
        Employee emp2 = new Employee("Петр", "Петпрович", "Петров", 1, 70000);
        Employee emp3 = new Employee("Сидр", "Сидорович", "Сидоров", 1, 72000);
        Employee emp4 = new Employee("Илья", "Ильич", "Ильин", 1, 72000);
        Employee emp5 = new Employee("Федор", "Федорович", "Федоров", 1, 86000);
        Employee emp6 = new Employee("Максим", "Максимович", "Максимов", 1, 72000);
        Employee emp7 = new Employee("Семен", "Семенович", "Семенов", 1, 92000);
        Employee emp8 = new Employee("Владимир", "Владимирович", "Владимиров", 1, 72000);
        Employee emp9 = new Employee("Александр", "Александрович", "Александров", 1, 82000);
        Employee emp10 = new Employee("Дмитрий", "Дмитриевич", "Дмитров", 1, 100000);

        employees[0] = emp1;
        employees[1] = emp2;
        employees[2] = emp3;
        employees[3] = emp4;
        employees[4] = emp5;
        employees[5] = emp6;
        employees[6] = emp7;
        employees[7] = emp8;
        employees[8] = emp9;
        employees[9] = emp10;
        Employee[] emp = Arrays.copyOf(employees, 11);

        Arrays.stream(emp).forEach(System.out::println);
        System.out.println(emp.length);
//        public static boolean addEmployee(Employee employee){
////            for (int i = 0; i < employees.length; i++) {
////                employees[i] = null;
////            }
////    //
////     employees = Arrays.copyOf(employees, employees.length + 1);
////    }

        public static void print () {
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        }
        public static int calculateTotalSalary () {
            int sum = 0;
            for (Employee employee : employees) {
                sum += employee.getSalary();
            }
            return sum;
        }
        public static Employee findEmployeeWithMinSalary () {
            Employee result = employees[0];
            int minSalary = employees[3].getSalary();
            for (Employee employee : employees) {
                if (employee.getSalary() < minSalary) {
                    minSalary = employee.getSalary();
                    result = employee;
                }
            }
            System.out.println("Минимальная зарплата: " + minSalary + "рублей");
            if (findEmployeeWithMinSalary != null) {
                System.out.println("Сотрудник с минимальной зарплатой: " + findEmployeeWithMinSalary.getFullName());
            }
        }

        public static void findEmployeeWithMaxSalary() {
            int maxSalary = -1;
            Employee employeeWithMaxSalarySalary = null;
            for (Employee employee : employees) {
                Employee employeeWithMaxSalary = null;
                if (employee != null) {
                    if (employee.getSalary() > maxSalary) {
                        maxSalary = employee.getSalary();
                        employeeWithMaxSalary = employee;
                    }
                }
                System.out.println("Максимальная  зарплата: " + maxSalary + "рублей");
                if (employeeWithMaxSalary != null) {
                    System.out.println("Сотрудник с максимальной зарплатой: " + findEmployeeWithMaxSalary.getFullName());
                }
            }
            public static float calculateAverageSalary () {
                int count = 0;
                int sum = 0;
                for (Employee employee : employees) {
                    if (employee != null) {
                        count++;
                        sum += employee.getSalary();
                    }
                }
                return (float) sum / count;
            }
            public static void printFullName() {
                for (Employee employee : employees) {
                    System.out.println(employee.getLastName());
                }
            }
        }
    }
}