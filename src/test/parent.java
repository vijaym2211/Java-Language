package test;

import java.util.*;

public class parent {

    public static void main(String[] args) {
        Map<String, Integer> hm = new HashMap<>();

        hm.put("DSA", 85);
        hm.put("Math", 45);
        hm.put("English", 90);
        //conversion
        List<Map.Entry<String, Integer>> list = new ArrayList<>(hm.entrySet());
        //sorting on values
        list.sort(Map.Entry.comparingByValue());

        System.out.println(list);

        Map<String, Integer> hm2 = new LinkedHashMap<>();
        for(Map.Entry<String, Integer> entry : list) {
            hm2.put(entry.getKey(), entry.getValue());
        }
        System.out.println(hm2);

        ArrayList<Integer> arr = new ArrayList<>();
    }



}
