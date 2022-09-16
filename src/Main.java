public class Main {
            public static void main(String[] args) {
                Employee[] employees = new Employee[] {
                        new Employee("Иван", "Иванович", "Иванов", 1, 70000),
                        new Employee("Петр", "Петпрович", "Петров", 1, 70000),
                        new Employee("Сидр", "Сидорович", "Сидоров", 1, 72000),
                        new Employee("Илья", "Ильич", "Ильин", 1, 72000),
                        new Employee("Федор", "Федорович", "Федоров", 1, 86000),
                        new Employee("Максим", "Максимович", "Максимов", 1, 72000),
                        new Employee("Семен", "Семенович", "Семенов", 1, 92000),
                        new Employee("Владимир", "Владимирович", "Владимиров", 1, 72000),
                        new Employee("Александр", "Александрович", "Александров", 1, 82000),
                        new Employee("Дмитрий", "Дмитриевич", "Дмитров", 1, 100000)
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

