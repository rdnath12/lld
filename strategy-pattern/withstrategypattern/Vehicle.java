abstract  class Vehicle {
   private DrivingMode drivingMode;

   Vehicle(DrivingMode drivingMode){
     this.drivingMode = drivingMode;
   }

   abstract void drive();
   
   DrivingMode getDrivingMode(){
      return drivingMode;
   } 

   void setDrivingMode(DrivingMode drivingMode){
      this.drivingMode = drivingMode;
   }
}