public class Circle extends Shape{
    private double radius;
    public Circle(){
        this.radius = radius;
    }
    public void setRadisu(double newRadius){
        radius = newRadius;
    }

    public double getRadius(){
        return radius;
    }

    @Override
    public void area(){
        double areaC = Math.PI * Math.pow(radius, 2);
        System.out.println("Area of circle is: " + areaC);
    }
    @Override
    public void perimeter(){
        double perimeterC = 2 * Math.PI * radius;
        System.out.println("Perimeter of circle is: " + perimeterC);
    }


}

