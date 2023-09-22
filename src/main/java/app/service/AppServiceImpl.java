package app.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

@Service
public class AppServiceImpl implements AppService {
    @Override
    public Map<Character, Integer> getData(String data) {

        Map<Character, Integer> map = new HashMap<>();
        for (char c : data.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        Map<Character, Integer> treeMap = new TreeMap<>(((o1, o2) -> map.get(o2).compareTo(map.get(o1))));
        treeMap.putAll(map);
        return treeMap;
    }
}
