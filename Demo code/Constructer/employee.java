class Employee {
    String name;
    int salary;

    Employee(String n, int s) {
        name = n;
        salary = s;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Codex {
    public static void main(String[] args) {
        Employee e = new Employee("Rahul", 30000);
        e.display();
    }
}