package Assignment.assignment2;

import java.util.*;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try
        {
            int n;
            n=sc.nextInt();

            fib(n);
        }
        finally{
            sc.close();
        }
    }

    public static void fib(int n)
    {
        int a=0, b=1;
        System.out.print(a + ", " + b + ", ");

        for(int i=2; i<n; i++)
        {
            int c=a+b;
            System.out.print(c + ", ");
            a=b;
            b=c;
        }
    }
    
}
