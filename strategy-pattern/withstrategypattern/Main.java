

class Main{
    public static void main(String[] args) {
      
        DrivingMode normalMode = new NormalMode();
        DrivingMode sportMode = new SportMode();

        Vehicle bike = new Bike(normalMode);
        bike.drive();
        System.out.println("Switch to Sport Mode");
        bike.setDrivingMode(sportMode);
        bike.drive();
        System.out.println("Switch to Normal Mode");
        bike.setDrivingMode(normalMode);
        bike.drive();
        
        System.out.println("\n");    

        Vehicle car = new Car(normalMode);
        car.drive();
        System.out.println("Switch to Sport Mode");
        car.setDrivingMode(sportMode);
        car.drive();
        System.out.println("Switch to Normal Mode");
        car.setDrivingMode(normalMode);
        car.drive();
    }
}