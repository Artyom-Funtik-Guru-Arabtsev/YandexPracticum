package Trash;

import java.util.List;

public class Forest {
    private List<MountainHare> hares;

    public Forest(List<MountainHare> hares) {
        this.hares = hares;
    }

    public static void setSeason(String season) {
        if (season.equals("зима")) MountainHare.color = "белый";
        if (season.equals("лето")) MountainHare.color = "серо-рыжий";
    }

    public void printHares() {
        for (MountainHare hare : hares) {
            System.out.println(hare);
        }
    }

}