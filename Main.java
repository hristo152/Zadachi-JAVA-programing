import java.util.*;
public class Main {
    public static void main(String[] args) {
        Person obj = new Person();
        Student obj2 = new Student();
        Car[] obj3 = new Car[4];
        Circle obj4 = new Circle();
        Rectangle obj5 = new Rectangle();

        obj.setName("Ivan");
        obj.setAge(10);
        obj.introduce();

        obj2.setName("Ivan");
        obj2.setAge(10);
        obj2.setGrade(3.5);
        obj2.introduce();

        obj4.setRadisu(4.5);
        obj4.area();
        obj4.perimeter();

        obj5.setA(8.0);
        obj5.setB(8.0);
        obj5.setC(5.0);
        obj5.setHeigth(6.0);
        obj5.area();
        obj5.perimeter();

        obj3[0] = new Car("BMW E36 316TDS", 5000, 50, 20);
        obj3[1] = new ElectricCar("Tesla", 150, 0, 20, 78, 1);
        obj3[2] = new Car("AUDI", 236, 30, 20);
        obj3[3] = new ElectricCar("MUSTANG", 200, 0, 54,49,2);

        for (Car car : obj3) {
            car.accelerate(50);
            car.refuel(60);
            car.drive(100);
            if (car instanceof ElectricCar) {
                ((ElectricCar) car).charge();
                ((ElectricCar) car).driveElectric(150);
            }
        //int a = 0;
        /*while(a == 0){
            if(maxFuel >= obj3.setFuel()){
                System.out.println("Pls enter a real value or come when you need to refuel :)!!!");
            }
            else{
                obj3.refuel(maxFuel);
            }*/
        }
    }
}
