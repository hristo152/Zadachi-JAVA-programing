import java.util.*;
public class Student extends Person{
    private double grade;

    public Student(){
        super();
        this.grade = grade;
    }
   public void setGrade(double newGrade){
        grade = newGrade;
    }
    public double getGrade(){
        return grade;
    }
    @Override
    public void introduce(){
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(grade);

    }
    @Override
    public void printInfo(){
        introduce();
    }
}
