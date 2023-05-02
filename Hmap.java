package training;
import java.util.*;

public class Hmap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Developer",4);
        hm.put("Designer",3);
        hm.put("QA",2);
        hm.put("Manager",1);
ArrayList<ArrayList<String>> ans = new ArrayList<>();
        Set<String> key = hm.keySet();
        for(String k : key) {
            for (int i = 0; i < hm.get(k); i++) {



            }
        }
        
        System.out.println(ans);
    }
}


