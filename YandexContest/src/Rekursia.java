public class Rekursia {
    public static void main(String[] args){
        System.out.println(function(1));
    }
    public static int function(int i){
        if (i == 1) return function(i+1);
        if (i < 50) return function(i+1) + function(i*i);
        if (i == 50) return 1;
        return 0;
    }
}
