package JavaPrograms.pojoclasses;

public class pojoClass {


    public static void main(String[] args){
        Employee e1 = new Employee(20);
        e1.name="Gurunath";
        e1.salary = 55533.66;

        Employee e2 = new Employee(30);
        e2.name = "Tanishq";
        e2.salary = 20300.55;

        Employee e3 = new Employee(30);
        e2.name = "Naresh";
        e2.salary = 60300.55;


        Employee[] employees = new Employee[]{e1,e2,e3};
    }
}
