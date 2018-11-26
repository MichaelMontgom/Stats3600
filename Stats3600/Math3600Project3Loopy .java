
/*  This program was written to test how long a computer took to run
    the calculation of the nth number of the Fibonacci Sequence */

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Math3600Project3Loopy {
	public static final long n = 46;
	public static final int numCalcs = 15;

    public static void main(String[] args){
    	long result = 0;
		long mean = 0;
		Scanner scan = new Scanner(System.in);
		String lab, computer;
		System.out.print("Please enter the lab:");
		lab = scan.next();
		System.out.print("Please enter the computer number:");
		computer = scan.next();
    	System.out.printf("Fibonacci(%d) = 1836311903\n", n);
    	try{
    		// Make a file to store data
			FileWriter fw = new FileWriter(new File("Lab_" + lab + "_Comp_" + computer + ".txt"));
			fw.write(String.format("Lab: %s\tComputer Number: %s", lab,computer));
			fw.write(System.lineSeparator());
    		// Loop, crunch the numbers, get results, add to file
    		for(int i=0; i<numCalcs; i++){
    			result = fibCrunch(i);
    			fw.write(String.format("Runtime %d:\t%d", i+1, result));
    			fw.write(System.lineSeparator());
    			mean += result;
    		}
    		// Display the result on the console
    		System.out.println("Mean:\t\t\t" + mean/numCalcs + " nanoseconds");
    		// Final file write operations
    		fw.write(String.format("Mean:\t\t%d nanoseconds", mean/numCalcs));
			fw.write(System.lineSeparator());
    		fw.close();
    		scan.close();
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    }

    public static long fibCrunch(int i){
        // Get system time at beginning of calculations
        long initialTime = System.nanoTime();
        // Run the calculation
        fibonacci(n);
        // Get System time of the Calculations and print statement
        long endTime = System.nanoTime();
        // Calculation of total runtime
        long programTotalRuntime = endTime - initialTime;
        // Print the total runtime of the calculations
        System.out.printf("Iteration %d runtime:\t" + programTotalRuntime + " nanoseconds\n", i+1);
        // Return the total program runtime
        return programTotalRuntime;
    }

    public static long fibonacci(long n){if(n<=1){return n;}else{return fibonacci(n-1)+fibonacci(n-2);}}}
	// DONT MAKE ME DO THIS TO THE WHOLE PROGRAM
