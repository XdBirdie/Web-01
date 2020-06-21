public class Fibonacci {
    static public int of(int n){
        if (n == 1 || n == 2) return 1;
        return of(n - 1) + of(n - 2);
    }

    public static void main(String[] args) {
        int cnt = 0;
        while (true){
            int t = of(++cnt);
            if (t > 200) return;
            System.out.println(t);
        }
    }
}