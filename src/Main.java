
        public class Main {
            public static void main(String[] args) {
                Employee[] employees = new Employee[] {
                        new Employee(1, "Иван", "Иванович", "Иванов", 1, 70000),
                        new Employee(2, "Петр", "Петпрович", "Петров", 1, 70000),
                        new Employee(3, "Сидр", "Сидорович", "Сидоров", 1, 72000),
                        new Employee(4, "Илья", "Ильич", "Ильин", 1, 72000),
                        new Employee(5, "Федор", "Федорович", "Федоров", 1, 86000),
                        new Employee(6, "Максим", "Максимович", "Максимов", 1, 72000),
                        new Employee(7, "Семен", "Семенович", "Семенов", 1, 92000),
                        new Employee(8, "Владимир", "Владимирович", "Владимиров", 1, 72000),
                        new Employee(9, "Александр", "Александрович", "Александров", 1, 82000),
                        new Employee(10, "Дмитрий", "Дмитриевич", "Дмитров", 1, 100000)
                };

                Easy easy = new Easy(employees);
                easy.printEmployees();

                System.out.println();

                // Общая з/п
                System.out.println("Общая з/п: " + easy.calculateTotalSalary());

                // Минимальная з/п
                Employee employeeWithMinSalary = easy.findEmployeeWithMinSalary();
                if (employeeWithMinSalary != null) {
                    System.out.println("Минимальная з/п: " + employeeWithMinSalary.getSalary());
                } else {
                    System.out.println("Невозможно найти минимальную з/п");
                }

                // Максимальная з/п
                Employee employeeWithMaxSalary = easy.findEmployeeWithMaxSalary();
                if (employeeWithMaxSalary != null) {
                    System.out.println("Максимальная з/п: " + employeeWithMaxSalary.getSalary());
                } else {
                    System.out.println("Невозможно найти минимальную з/п");
                }

                // Среднее значение з/п
                System.out.println("Средняя з/п: " + easy.calculateAverageSalary());
                System.out.println();

                // Список сотрудников
                System.out.println("Список сотрудников:");
                easy.printFullNames();
            }
        }




