package Trash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionsS {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList = Arrays.asList(1, 2, 3, 5, 4, 5, 6, 7);
        arrayList.forEach(System.out::println);
    }
}
