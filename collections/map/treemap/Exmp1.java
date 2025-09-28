package collections.map.treemap;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;


/*
-> duplicates not allowed in TreeMap
 */
public class Exmp1 {
    public static void main(String[] args) {
        TreeMap<String,String> flights = new TreeMap<String,String>();
        flights.put("21:00","indigo");
        flights.put("23:00","goair");
        flights.put("04:30","spicejet");
        flights.put("16:00","vistara");
        flights.put("21:30","airindia");
        flights.put("09:00","indigo");
        flights.put("11:00","spicejet");
        flights.put("13:00","goair");

        Set<Entry<String,String >> entrys = flights.entrySet();
        for (Entry<String ,String> entry: entrys) {
            System.out.println(entry);
        }
    }
}
