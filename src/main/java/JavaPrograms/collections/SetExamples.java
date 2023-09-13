package JavaPrograms.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class SetExamples {


    public static void main(String[] args) {

        //In set Insertion order is not preserved

        //Set<Integer> values = new HashSet<Integer>();
        Set<Integer> values = new TreeSet<>();
        values.add(3);
        values.add(9);
        values.add(19);
        values.add(33);
        values.add(5);
        System.out.println(values.add(8));
        System.out.println(values.add(3));

        for(Integer i:values){
            System.out.println(i);
        }
    }
}



