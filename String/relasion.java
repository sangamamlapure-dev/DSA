class Address{

    String city;
    int pincode;

    Address(String city, int pincode) {

        this.city = city;
        this.pincode = pincode;
    }
}

class Student {

    int id;
    String name;
    Address address;

    Student(int id, String name, Address address) {

        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display() {

        System.out.println("ID       : " + id);
        System.out.println("Name     : " + name);
        System.out.println("City     : " + address.city);
        System.out.println("Pincode  : " + address.pincode);
    }

    public static void main(String[] args) {

        Address a1 = new Address("Satara", 415001);

        Student s1 =
            new Student(101, "Sangam", a1);

        s1.display();
    }
}