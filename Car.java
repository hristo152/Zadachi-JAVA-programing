public class Car {
    private String brand;
    private int speed;
    private int fuel;
    private int mileage;

    public Car(String brand, int speed, int fuel, int mileage){
        this.brand = brand;
        this.speed = speed;
        this.fuel = fuel;
        this.mileage = mileage;
    }
//String brand, int speed, int fuel, int mileage
   public void setBrand(String newBrand){
       brand = newBrand;
    }

    public String getBrand(){
        return brand;
    }

   // public void setSpeed(int newSpeed){
    //    speed = newSpeed;
   // }

    public int getSpeed(){
        return speed;
    }
    //public void setFuel(int newFuel){
       // fuel = newFuel;
   // }

    public int getFuel(){
        return fuel;
    }

    //public void setMileage(int newMileage){
      //  mileage = newMileage;
    //}

    public int getMileage(){
        return mileage;
    }

    public void accelerate(int sec){
        int accel = 0;
        if(fuel != 0) {
            switch (brand) {
                case "BMW E36 316TDS":
                    for (int i = 0; i <= sec; i++) {
                        if (accel >= speed) {
                            break;
                        }
                        accel += 200;
                        System.out.println("The BMW E36 316TDS has accelerated " + accel + " kilometers for " + i + "sec to max speed");
                    }
                    break;
                case "AUDI":
                    System.out.println("No :)");
                    break;
                case "NORMALCAR":
                    for(int i = 0; i <= sec; i++){
                        if(accel < speed) {
                            if (i <= 2) {
                                accel += 5;
                                System.out.println("The BMW E36 316TDS has accelerated " + accel + " kilometers for " + i + "sec");
                            }
                            if (i > 2 && i <= 5) {
                                accel += 10;
                                System.out.println("The BMW E36 316TDS has accelerated " + accel + " kilometers for " + i + "sec");
                            }
                            if (i > 5 && i <= 10) {
                                accel += 13;
                                System.out.println("The BMW E36 316TDS has accelerated " + accel + " kilometers for " + i + "sec");
                            }
                            if (i > 10) {
                                accel += 13;
                                System.out.println("The BMW E36 316TDS has accelerated " + accel + " kilometers for " + i + "sec");
                            }
                            if (i < sec) {
                                System.out.println("The BMW E36 316TDS has accelerated " + accel + " kilometers for " + i + "sec");
                            }
                            if(i == sec) {
                                System.out.println("Final speed is " + accel + " kilometers for " + i + "sec");
                                break;
                            }
                        }
                        else {
                            System.out.println("Final speed is " + accel + " kilometers for " + i + "sec to max speed");
                            break;
                        }
                    }
                default:
                    break;
            }
            //if(brand.equals("BMW E36 316TDS"))
            //else if (brand.equals("AUDI"))
        }
    }
    public void refuel(int maxFuel){
        int refuel1 = maxFuel - fuel;
        System.out.println("You refueled: " + refuel1);
    }

    public void drive(int distance){
        int ful = fuel;
        int mil = distance + mileage;
        for(int i = 0; i <= distance; i += 25){
            ful -= 1;
            if(ful == 0){
                System.out.println("you have to refuel :')!!!");
                break;
            }
        }
        System.out.println("Your car is using 4/100 l/km");
        System.out.println("New mileage: " + mil);
        System.out.println("New fuel: " + ful);
    }
}
