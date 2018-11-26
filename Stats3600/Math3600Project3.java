
/*  This program was written to test how long a computer took to run
    the calculation of the nth number of the Fibonacci Sequence */

import java.util.*;
public class Math3600Project3
{
    public static void main(String[] args)
    {
        // Get the nth Fibonacci number from command line argument
        int n = Integer.parseInt(args[0]);

        // Get system time at beginning of calculations
        long initialTime = System.nanoTime();

        // Calculate the nth number of Fibonacci
        int answer = fibonacci(n);

        // Print the nth number of Fibonacci
        System.out.printf("The %d number of Fibonacci is %d \n\n", n, answer);

        // Get System time of the Calculations and print statement
        long endTime = System.nanoTime();

        // Calculation of totat runtime
        long programTotalRuntime = endTime - initialTime;

        // Print the total runtime of the calculations
        System.out.print("The runtime of the program is: " + programTotalRuntime + "\n");
    }

    public static int fibonacci(int n)
    {
        if(n <= 1)
        {
            return n;
        }
        else
        {
            return fibonacci(n-1) + fibonacci(n-2);
        }

    }
}
