class Employee{

    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {

        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {

        System.out.println("ID     : " + id);
        System.out.println("Name   : " + name);
        System.out.println("Salary : " + salary);
    }

    public static void main(String[] args) {

        Employee e1 =
            new Employee(101, "Sangam", 35000);

        Employee e2 =
            new Employee(102, "Rahul", 40000);

        e1.display();
        System.out.println();

        e2.display();
    }
}