package Collections;
import java.util.*;
import java.util.Map;
public class MapPractice {
    public Object findValueOf(Map map, Object key) {
        return map.get(key);
    }
    public Object[] findKeysOf(Map map, Object value) {
        List<Object> obje = new ArrayList<Object>();
        for( Object i : map.keySet()){
            if(map.get(i) == value){
                obje.add(i);
            }
        }
        Object[] myobj = obje.toArray();
        return myobj;
    }
    public Map<Integer, Integer> fibonacciTree(int size) {
        return crazySpiral(1, 1, size);
    }
    public Map<Integer, Integer> crazySpiral(Integer first, Integer second, Integer size) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
        for (int i = 1; i <= size; i++){
            if(i == 1){
                treeMap.put(i, first);
            }
            else if(i == 2){
                treeMap.put(i, second);
            }
            else {
                Integer sum = treeMap.get(i-2) + treeMap.get(i-1);
                treeMap.put(i, sum);
            }
        }
        return treeMap;
    }
}
