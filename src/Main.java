public class Main {
    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        employees[0] = new Employee("Иванов Иван Иванович", 1, 65_000);
        employees[1] = new Employee("Петров Артем Петрович", 2, 90_000);
        employees[2] = new Employee("Сидоров Денис Сидорович", 3, 70_000);
        employees[3] = new Employee("Иванова Анастасия Сергеевна", 4, 85_000);
        employees[4] = new Employee("Волкова Ирина Михайловна", 5, 69_000);
        employees[5] = new Employee("Москвичева Яна Игоревна", 1, 82_000);
        employees[6] = new Employee("Колосов Сергей Семенович", 2, 88_000);
        employees[7] = new Employee("Зинин Петр Алексеевич", 3, 73_000);
        employees[8] = new Employee("Володина Валентина Викторовна", 4, 67_000);
        employees[9] = new Employee("Аанасьева Мария Александровна", 5, 63_000);

        printAllEmployees();

        System.out.println("Общая статья расходов на выплату ЗП составляет: " + sumSalary());
        System.out.println("Сотрудник с максимальной зарплатой: " + maxSalary());
        System.out.println("Сотрудник с минимальной зарплатой: " + minSalary());
        System.out.println("Средняя зарплата сотрудников составляет: " + averageSalary());

        printAllEmployeesNames();
    }

    public static void printAllEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }

    }

    public static int sumSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public static Employee maxSalary() {
        int max = Integer.MIN_VALUE;
        Employee targetEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > max) {
                max = employee.getSalary();
                targetEmployee = employee;
            }
        }
        return targetEmployee;
    }

    public static Employee minSalary() {
        int min = Integer.MAX_VALUE;
        Employee targetEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < min) {
                min = employee.getSalary();
                targetEmployee = employee;
            }
        }
        return targetEmployee;
    }

    public static int averageSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        int averageSalary = sum / employees.length;
        return averageSalary;
    }

    public static void printAllEmployeesNames() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getName());
            }
        }

    }
}







