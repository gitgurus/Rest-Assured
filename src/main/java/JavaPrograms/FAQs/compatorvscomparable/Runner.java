package JavaPrograms.FAQs.compatorvscomparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args){

        List<Laptop> laps = new ArrayList<Laptop>();

        laps.add(new Laptop("acer", 6, 20000));
        laps.add(new Laptop("dell", 8, 25000));
        laps.add(new Laptop("apple", 12, 50000));

        Collections.sort(laps);
    }
}
