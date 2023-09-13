package JavaPrograms.collections;

import java.util.Vector;

public class vectorsExamples {

    public static void main(String[] args){

        Vector v = new Vector();

        v.add(10);
        v.add(20);
        v.add("Gurunath");

        System.out.println(v.capacity());

        for(Object i : v){
            System.out.println(i);
        }

        /*Summary
        Vectors  double their memory by 100% after reaching the limit whereas ArrayList will increase by 50%
        Vectors are Threadsafe and ArrayList are not ThreadSafe
        Vectors are Slow and ArrayList are Faster

         */
    }
}
