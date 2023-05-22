import java.util.Arrays;

public class Recursion {

	public static void main(String[] args) {
		
		System.out.println(powerOfFive(3));
		System.out.println(sumToN(5));
		System.out.println(factorial(5));
		System.out.println(Arrays.toString(fibonacci(5)));
		
		Integer[] integers = {1, 2, 3, 4, 5};
		Character[] characters = {'A', 'B', 'c', 'D', 'e'};
		String[] strings = {"Apple", "Berry", "Kiwi", "Banana", "Grapes"};
		printArray(integers);
		printArray(characters);
		printArray(strings);
	}
	
	
	// 1
	public static int powerOfFive(int n) {
		int five = 5;
		int total = 1;
		if(n == 0) return 1;
		if(n == 1) return 5;
		for(int i = 1; i <= n; i++ ) {
			total *= five;
//			System.out.printf("%s ", i);
//			System.out.printf("%s ", total);
		}
		return total;
	}
	
	// 2
	public static int sumToN(int n) {
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += Math.pow(i, 2);
		}
		return sum;
	}
	
	// 3
	public static int factorial(int n) {
		int fact = 1;
		
		if(n == 0 || n == 1) return 1;
		
		for(int i = n; i >= 1; i--) {
			fact *= i;
		}
		
		return fact;
	}
	
	// 4
	public static int[] fibonacci(int n) {
		int[] sequence = new int[n];
		int nextNum = 0;
		
		for(int i = 0; i < n; i++) {
			if(i <= 1)
				sequence[i] = i;
			else {
				nextNum = sequence[i - 1] +  sequence[i - 2];
				sequence[i] = nextNum;
			}
		}
		
		return sequence;
	}
	
	// 5
	public static <E> void printArray(E[] arr) {
		for(E element : arr)
			System.out.printf("%s ", element);
		
		System.out.println();
	}	

}
