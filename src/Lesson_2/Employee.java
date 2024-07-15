package Lesson_2;

public class Employee {
    private String FIO;
    private String job;
    private String email;
    private String phone;
    private double salary;
    private int age;

    public Employee(String FIO, String job, String email, String phone, double salary, int age) {
        this.FIO = FIO;
        this.job = job;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    // Метод для вывода информации об объекте
    public void printInfo() {
        System.out.println("Employee Information:");
        System.out.println(" FIO: " + FIO);
        System.out.println(" job: " + job);
        System.out.println(" Email: " + email);
        System.out.println(" Phone: " + phone);
        System.out.println(" Salary: " + salary  + " $");
        System.out.println(" Age: " + age);
        System.out.println(" ");

    }



    public static void main(String[] args) {
        Employee employee = new Employee("Alberty Alexander", "QA", "test@test.com", "+375445673423", 800, 23);
        employee.printInfo();
        System.out.println("--------------------------");
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Allard Allen", "Engineer", "ivivan@mailbox.com", "+37544563789", 3000, 30);
        employeeArray[1] = new Employee("Anderson Bailiff", "Manager", "petrov@mailbox.com", "+375445673420", 5000, 45);
        employeeArray[2] = new Employee("Bell Bennett", "Director", "sidorov@mailbox.com", "+375445673428", 7000, 50);
        employeeArray[3] = new Employee("Biffle Brooks", "Developer", "fedorov@mailbox.com", "+375445673426", 6000, 25);
        employeeArray[4] = new Employee("Brown Butler", "Analyst", "smirnov@mailbox.com", "+375445673425", 4000, 42);

        employeeArray[0].printInfo();


    }
}
