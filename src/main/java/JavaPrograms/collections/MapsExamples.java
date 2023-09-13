package JavaPrograms.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapsExamples {

    public static void main(String[] args) {
        /*Map values = new HashMap();
        values.put("Name","Gurunath");
        values.put("Actor","PK");
        values.put("CEO","Steve");*/
        Map<String,String> values = new HashMap();
        Map<String,Integer> values1 = new HashMap();
        values1.put("Salary", 20000);
        values1.put("Rank",2);
        Set<String> data = values1.keySet();
        for(String dat:data)
        {
            System.out.println(dat+"   "+values1.get(dat));
        }
        values.put("Name","Gurunath");
        values.put("Actor","PK");
        values.put("CEO","Steve");
        values.put("name","Gurunath");
        values.put("Name","John");
        //KeySet - WIll give you set of Keys .We can store that in set then we can print all the values.
        Set<String> keys = values.keySet();

        for(String key:keys){
            System.out.println(key+"    "+values.get(key));
        }

        //Types of Maps - HashMap,HashTable,TreeHashMap and LinkedHashMap





    }
}
