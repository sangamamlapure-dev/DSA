class Student {
    String name;
    int age;

    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Codex {
    public static void main(String[] args) {
        Student s = new Student("Sangam", 21);
        s.display();
    }
}