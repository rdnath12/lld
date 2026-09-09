class Car extends Vehicle {

    Car(DrivingMode drivingMode){
        super(drivingMode);
    }

    @Override
    void drive() {
        getDrivingMode().drive();
    }

}