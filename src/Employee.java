
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private String middleName;
    private int department;
    private int salary;

    public Employee(int id, String name, String lastName, String middleName, int department, int salary) {
        this.id = id;
        this.firstName = name;
        this.lastName = lastName;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
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
