class Car extends Vehicle {

    @Override
    void drive() {
        System.out.println("Driving in Normal Mode");
        
        System.out.println("Switch to Sport Mode");
        System.out.println("Driving in Sport Mode"); 
        
        System.out.println("Switch to Normal Mode");
        System.out.println("Driving in Normal Mode");
    }

}