public class ElectricCar extends Car{
    private int batteryLevel;
    private int efficiency;

    public ElectricCar(String brand, int speed, int fuel, int mileage, int batteryLevel, int efficiency){
        super(brand, speed, fuel, mileage);
        this.batteryLevel = batteryLevel;
        this.efficiency = efficiency;
    }
    /*public void setBatteryLevel(int newBatteryLevel){
        batteryLevel = newBatteryLevel;
    }*/
    public int getBatteryLevel(){
        return batteryLevel;
    }
   /* public void setEfficiency(int newEfficiency){
        efficiency = newEfficiency;
    }*/
    public int getEfficiency() {
        return efficiency;
    }
    public void charge(){
        int chargedBattery = 100 - batteryLevel;
        System.out.println("You charged: " + chargedBattery);
    }

    public void driveElectric(int distance){
        int ful1 = batteryLevel;
        int mil1 = distance + getMileage();
        switch (efficiency){
            case 1:
                for(int i = 0; i <= distance; i += 5){
                    ful1 -= 1;
                    if(ful1 == 0){
                        System.out.println("you have to recharge :')!!!");
                        break;
                    }
                }
                System.out.println("Your car is using 20/100 battery/km???");
                System.out.println("New mileage: " + mil1);
                System.out.println("New battery: " + ful1);
                break;
            case 2:
                for(int i = 0; i <= distance; i += 10) {
                    ful1 -= 1;
                    if (ful1 == 0) {
                        System.out.println("you have to recharge :')!!!");
                        break;
                    }
                }
                System.out.println("Your car is using 10/100 battery/km???");
                System.out.println("New mileage: " + mil1);
                System.out.println("New battery: " + ful1);
                break;
            default:
                break;
        }

    }

}
