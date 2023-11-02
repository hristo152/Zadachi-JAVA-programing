import java.util.*;
public class Person implements Printable {
    private String name;
    private int age;

    public Person(){
        this.name = name;
        this.age = age;
    }

    public void setName(String newName){
        name = newName;
    }

    public String getName(){
        return name;
    }

    public void setAge(int newAge){
        age = newAge;
    }

    public int getAge(){
        return age;
    }

    public void introduce(){
        System.out.println(name);
        System.out.println(age);
    }
    @Override
    public void printInfo(){
        introduce();
    }
}
