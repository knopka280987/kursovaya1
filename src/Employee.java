
public class Employee {
    private static int counter = 1;
    private int id;
    private String firstName;
    private String lastName;
    private String middleName;
    private int department;
    private int salary;

    public Employee(String name, String lastName, String middleName, int department, int salary) {
        this.id = counter++;
        this.firstName = name;
        this.lastName = lastName;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }


    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public String getMiddleName() {
        return middleName;
    }


    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Идентификатор: '" + id + "', " +
                "Имя: '" + firstName + "', " +
                "Фамилия: '" + lastName + "', " +
                "Отчество: ' " + middleName + "', " +
                "Отдел: '" + department + "', " +
                "Зарплата: '" + salary;
    }
}
