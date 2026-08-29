class Student {
    private String name;

    Student(String n) {
        name = n;
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

class Codex {
    public static void main(String[] args) {
        Student s = new Student("Sangam");
        s.display();
    }
}