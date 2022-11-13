public class Employee {
    private String name;
    private int department;
    private int salary;
    private int id;
    private static int counter = 1;
    public Employee(String name, int department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        if (department < 0 || department > 5) {
            System.out.println("Значение отдела не может быть меньше 1 и больще 5");
            return;
        }
        this.department = department;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Сотрудник № " + id + ", " + "Имя: " + name + ", Отдел: " + department + ", Зарплата: " + salary;
    }

}


