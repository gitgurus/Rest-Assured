package JavaPrograms.FAQs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class StreamMaps {
    public static void main(String[] args) {
        List<String> vehicles = Arrays.asList("car", "bike", "bus", "lorry");
        List<String> vehiclesList = new ArrayList<String>();
       /* vehiclesList = vehicles.stream().map(m-> m.toUpperCase()).collect(Collectors.toList());
        System.out.println(vehiclesList);*/

        //vehicles.stream().map(v->v.length()).forEach(l-> System.out.println(l));

        vehicles.stream().map(v->v.length()).forEach(System.out::println);


    }
}
