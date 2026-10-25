package com.example.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {


    public Integer testHashMap(String key){
        Map<String, Integer> testMap = new HashMap<>();

        synchronized(testMap){
            return testMap.get(key);
        }
    }
}
