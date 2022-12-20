public class task20 {
    public static void main(String[] args) {
        for (int i = 1; i<=100;i++){
            int n = i;
            int d = 1;
            int k = 0;
            while (d*d < n){
                if (n % d == 0) k+=1;
                d+=1;
            }
            if (d*d == n) k+=1;
            System.out.println(i+" " + d);
        }
    }
}
