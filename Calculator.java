// Calculator.java
public class Calculator {
    	// To add two numbers
    	public double add(double a, double b) { 
        		return a + b; 
    	}

    	// To subtract two numbers
    	public double subtract(double a, double b) { 
        		return a - b; 
    	}

    	// To multiply two numbers
    	public double multiply(double a, double b) { 
        		return a * b; 
    	}

    	// To divide two numbers
    	public double divide(double a, double b) { 
        		return (b != 0) ? a / b : Double.NaN; // Returns NaN if b is zero
    	}

    	// To calculate the nth Fibonacci number
    	public int fibonacci(int n) {
        		if (n <= 1) return n; 
        		return fibonacci(n - 1) + fibonacci(n - 2); 
    	}

    	// To calculate the sum of an array
    	public double sum(double[] arr) {
        		double sum = 0;
        		for (double num : arr) sum += num; 
        		return sum;
    	}

    	// To calculate the mean (average) of an array
    	public double mean(double[] arr) {
        		return sum(arr) / arr.length;
    	}

    	// To calculate the variance of an array
    	public double variance(double[] arr) {
        		double mean = mean(arr);
        		double sumSqDiff = 0;
        		for (double num : arr) 
            			sumSqDiff += Math.pow(num - mean, 2); 
        		return sumSqDiff / arr.length;
    	}

    	// To calculate the standard deviation of an array
    	public double standardDeviation(double[] arr) {
        		return Math.sqrt(variance(arr)); 
    	}
}
