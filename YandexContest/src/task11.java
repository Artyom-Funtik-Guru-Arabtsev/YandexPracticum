public class task11 {
    public static void main(String[] args) {
        System.out.println(check(555));
        System.out.println(check(123));
    }
    public static boolean check(int t){
        return Integer.toString(t).contains("5");
    }
}
