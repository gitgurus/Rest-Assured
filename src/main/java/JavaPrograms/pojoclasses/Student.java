package JavaPrograms.pojoclasses;

import java.io.Serializable;

public class Student implements Serializable {

    //Java bean class is an extended version of Pojo class
    //It is also referred as serializable POJO class
    //It should implement serializable interface
    //It should have a no argument constructor
    //All the properties should be private
    //it should have getters and setters for accessing values

    private int id;
    private String name;
    private double marks;

    public Student(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
}
