package Trash;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PotatoLaboratory {

    public static void main(String[] args) {
        List<Potato> potatoes = List.of(
                new Potato(1, 30, 30, 30),
                new Potato(2, 35, 31, 35),
                new Potato(3, 40, 35, 44),
                new Potato(4, 28, 44, 41),
                new Potato(5, 33, 23, 30),
                new Potato(6, 35, 33, 33),
                new Potato(7, 38, 41, 24)
        );
        List<Potato> norm = new ArrayList<>(potatoes);
        List<Potato> fourUnderExperiment = findPotatoesForExperiment(norm);
        System.out.println("Картофелины для эксперимента: " + fourUnderExperiment);
    }

    private static List<Potato> findPotatoesForExperiment(List<Potato> potatoes) {
        Collections.sort(potatoes);
        List<Potato> out = new ArrayList<>();
        while (out.size() != 4 && !potatoes.isEmpty()) {
            out.add(potatoes.get(0));
            potatoes.remove(potatoes.get(0));
            if (potatoes.isEmpty()) break;
            out.add(potatoes.get(potatoes.size() - 1));
            potatoes.remove(potatoes.get(potatoes.size() - 1));
        }
        Collections.sort(out);
        return out;
    }
}