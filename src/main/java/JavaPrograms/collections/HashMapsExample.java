package JavaPrograms.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapsExample {



    public static void main(String[] args){

        Map<String,String> map = new HashMap<>();
        map.put("red","apple");
        map.put("green","apple");
        map.put("yellow","Banana");
        map.put("White","Radish");

        map.containsKey("red");//returns true or false
        map.containsValue("Banana");//returns true or false
        map.size();
        map.remove("green");
        map.clear();


        for(Map.Entry value : map.entrySet())
        {
            System.out.println(value.getKey()+":"+value.getValue());
        }


    }
}
