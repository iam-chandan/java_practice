import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Driver {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("abcd", "bcd", "cef", "abcd", "cef", "fgh");
//        Map<String,Integer> map = new HashMap<>();

//        for(String s : str){
//            map.put(s,map.getOrDefault(s,0)+1);
//        }
        Map<String,Long> map = str.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        for(Map.Entry<String,Long> entry: map.entrySet()){
            System.out.println(entry.getKey() +" : " + entry.getValue());
        }

//        select p.prod_name,p.product_qty, u.uat_name from prod p left join uat u
    }

}
