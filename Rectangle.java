public class Rectangle extends Shape{
    private double a;

    private double b;
    private double c;
    private double height;

    public Rectangle(){
        this.height = height;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void setA(double newA){
        a = newA;
    }

    public double getA(){
        return a;
    }

    public void setB(double newB){
        b = newB;
    }

    public double getB(){
        return b;
    }
    public void setC(double newC){ c = newC; }
    public double getC(){
        return c;
    }
    public void setHeigth(double newHeigth){
        height = newHeigth;
    }

    public double getHeigth(){
        return height;
    }

    @Override
    public void area(){
        double areaR = 0.5 * c * height;
        System.out.println("Area of rectangle is: " + areaR);
    }
    @Override
    public void perimeter(){
        double perimeterR = a + b + c;
        System.out.println("Perimeter of rectangle is: " + perimeterR);
    }

}
