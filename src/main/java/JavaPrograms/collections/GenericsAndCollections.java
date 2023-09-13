package JavaPrograms.collections;

import java.awt.*;
import java.util.*;
import java.util.List;

public class GenericsAndCollections {

    //Collections are used for Dynamic Type of Arrays. We can elements expand the array and reduce the array
    //Array holds similar types of Data

    public static void main(String[] args){

       /* Collection values = new ArrayList();
        values.add(10);
        values.add("Guru");
        values.add("Tanishq");
        values.add(5.5);
        Iterator i = values.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }*/

       /* Collection<Integer> values = new ArrayList<>();
        values.add(10);
        //values.add("Guru");
        values.add(20);
        values.remove(20);

        for(Integer i: values){
            System.out.println(i);
        }*/

        List<Integer> values = new ArrayList<Integer>();
        values.add(50);
        values.add(20);
        values.add(2,20);
        values.add(40);

        Collections.sort(values);
        /*for(Integer i: values){
            System.out.println(i);
        }*/

        values.forEach(System.out::println);
    }
}
