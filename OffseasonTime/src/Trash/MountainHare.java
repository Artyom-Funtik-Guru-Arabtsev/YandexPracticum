package Trash;

public class MountainHare {

    int age;
    double weight;
    int jumpLength;
    public MountainHare(int age, double weight, int jumpLength){
        this.age = age;
        this.weight = weight;
        this.jumpLength = jumpLength;
    }
    static String color;

    // добавьте переменные и конструктор

    @Override
    public String toString() {
        return "Заяц-беляк: " +
                "age=" + age +
                ", weight=" + weight +
                ", jumpLength=" + jumpLength +
                ", color=" + color +
                '.';
    }
}