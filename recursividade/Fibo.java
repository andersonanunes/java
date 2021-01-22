package recursividade;

public class Fibo {
    static int fib (int n){
        if (n == 0 || n == 1) return 1;
            return fib (n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 21; i++){
            System.out.println(fib(i));
        }
    }
}
