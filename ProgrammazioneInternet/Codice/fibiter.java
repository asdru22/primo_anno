public class fibiter {
    public static void main(String[] args){
        long n = 752;
        System.out.println(fibonacci(n));
    }

    static long fibonacci(long n)  {
        if(n == 0)
            return 0;
        else if(n == 1)
          return 1;
       else
          return fibonacci(n - 1) + fibonacci(n - 2);
    }
}