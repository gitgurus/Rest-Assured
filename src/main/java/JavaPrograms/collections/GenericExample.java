package JavaPrograms.collections;

class Container<T> {
    T value;
    public void show(){
        System.out.println(value.getClass().getName());
    }

}

public class GenericExample {


    public static void main(String[] args){
        //We use Generics to achieve Type Safety
        //Integer extends Number Class
        Container<Integer> obj = new Container<>();
        obj.value = 9;
        obj.show();
    }
}
