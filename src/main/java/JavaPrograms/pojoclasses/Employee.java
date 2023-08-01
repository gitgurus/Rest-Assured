package JavaPrograms.pojoclasses;

public class Employee {

    //Pojo Class should be public
    // It is recommended to make the properties as private for improved security
    //It has getters and setters for accessing properties
    //It should not extend any class and implement any interface
    //It should not implement any annotations

    private int id;
    public String name;
    protected double salary;


    Employee(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

}
