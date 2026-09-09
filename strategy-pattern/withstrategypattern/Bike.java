
class Bike extends Vehicle {
    
    Bike(DrivingMode drivingMode){
        super(drivingMode);
    }

    @Override
    void drive() {
        getDrivingMode().drive();
    }
}