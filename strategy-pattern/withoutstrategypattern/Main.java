
class Main {

    public static void main(String[] args) {
        //driving logic is repeating on both child class - Bike , Car

        Vehicle bike = new Bike();
        bike.drive();

        System.out.println("\n");

        Vehicle car = new Car();
        car.drive();
    }
}
