import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Integer> mapTree = new TreeMap<>();
        List<Integer> list = Arrays.asList(3, 7, 1, 3, 5, 1, 6, 1, 7, 7, 2, 5);
        Map<Integer, Integer> map = solve(list);
        for (Integer num: map.keySet()) System.out.printf("%d %d\n", num,map.get(num));
    }

    public static Map<Integer, Integer> solve(List<Integer> list){
        Map<Integer,Integer> map = new HashMap<>();
        for (Integer num : list){
            if (map.containsKey(num)) map.put(num,map.get(num)+1);
            else map.put(num,1);
        }
        if (map.isEmpty()) return map;
        int max = 0;
        for (Integer count: map.values()) max = Integer.max(max, count);
        Set<Integer> set = new HashSet<>();
        for(Integer count : map.keySet()) if (map.get(count) == max) set.add(count);
        map.clear();
        for(Integer num : set){
            for (int i = 0; i < list.size();i++)
                if (Objects.equals(list.get(i), num)){
                    map.put(num,i);
                    break;
                }
        }
        return map;
    }

}