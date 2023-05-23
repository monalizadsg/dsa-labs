import java.util.Arrays;

public class Recursion {

	public static void main(String[] args) {

		// Q1 
		System.out.println("powerOfFive(1): " + powerOfFive(1));
		System.out.println("powerOfFiveLoop(1): " + powerOfFiveLoop(1));
		System.out.println("powerOfFive(5): " + powerOfFive(3));
		System.out.println("powerOfFiveLoop(5): " + powerOfFiveLoop(3));

		//Q2
		System.out.println("sumToN(2): " + sumToN(2));
		System.out.println("sumToNLoop(2): " + sumToNLoop(2));
		System.out.println("sumToN(5): " + sumToN(5));
		System.out.println("sumToNLoop(5): " + sumToNLoop(5));

		// Q3
		System.out.println("factorial(5): " + factorial(5));
		System.out.println("factorialLoop(5): " + factorialLoop(5));
		System.out.println("factorial(8): " + factorial(8));
		System.out.println("factorialLoop(8): " + factorialLoop(8));

		// Q4
		System.out.println("fibonacci recursion");
		for(int i = 0; i < 10; i++) {
			System.out.print(fibonacci(i) + " ");
		}
		System.out.println();
		System.out.println("fibonacci loop");
		for(int i = 0; i < 10; i++) {
			System.out.print(fibonacciLoop(i) + " ");
		}
		System.out.println();

		// Q5
		Integer[] integers = {1, 2, 3, 4, 5};
		Character[] characters = {'A', 'B', 'C', 'd', 'e', 'f'};
		String[] strings = {"Apple", "Berry", "Kiwi", "Banana", "Grapes"};
		System.out.print("Integers: ");
		printArray(integers);
		System.out.print("Characters: ");
		printArray(characters);
		System.out.print("Strings: ");
		printArray(strings);
	}


	// Q1: find the n-th power of five (5^n, n>=0).
	public static int powerOfFive(int n) {
		if(n == 0) return 1;

		return powerOfFive(n-1) * 5; 
	}

	public static int powerOfFiveLoop(int n) {
		int result = 1;

		if(n == 0) return 1;

		for(int i = 0; i < n; i++ ) {
			result *= 5;
		}
		return result;
	}



	// 2: find the sum of n numbers squared 1^2+2^2+3^2+…+n^2
	public static int sumToN(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;

		return  n * n + sumToN(n-1);
	}

	public static int sumToNLoop(int n) {
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += Math.pow(i, 2);
		}
		return sum;
	}

	// 3: find the factorial of n (i.e. n!)
	public static int factorial(int n) {
		if(n <= 1) return 1;

		return n * factorial(n-1);
	}

	public static int factorialLoop(int n) {
		int output = 1;

		for(int i = 1; i <= n; i++) {
			output *= i;
		}

		return output;
	}

	// 4: find the fibonacci value of n
	public static int fibonacci(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;

		return fibonacci(n-2) + fibonacci(n-1);
	}

	public static int fibonacciLoop(int n) {
		int prevNum = 0;
		int nextNum = 1;
		int sum = 0;

		for(int i = 0; i < n; i++) {
			sum = prevNum + nextNum;
			prevNum = nextNum;
			nextNum = sum;
		}

		return prevNum;
	}


	// 5: write a generic Java method that can print 
	// integer, character, and string arrays
	public static <T> void printArray(T[] arr) {
		for(T element : arr)
			System.out.printf("%s ", element);

		System.out.println();
	}	

}
