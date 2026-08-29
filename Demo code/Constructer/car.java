class Car {
    String brand;
    int price;

    Car(String b, int p) {
        brand = b;
        price = p;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }
}

class Codex {
    public static void main(String[] args) {
        Car c = new Car("Toyota", 1500000);
        c.display();
    }
}