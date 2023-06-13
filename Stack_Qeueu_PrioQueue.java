package a2_Monaliza_Dasig;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class a2_Monaliza_Dasig {

	public static void main(String[] args) {
		
		// Q1
		System.out.println("isPalindromeString(\"racecar\"): " + isPalindromeString("racecar"));
		System.out.println("isPalindromeString(\"moon\"): " + isPalindromeString("moon"));
		
		// Q2
		System.out.println("isPalindromeInteger(123321): " + isPalindromeInteger(123321));
		System.out.println("isPalindromeInteger(1222): " + isPalindromeInteger(1222));
		
		// Q3
		int size = 5;
		int[] newArray = new int[size];
		generateArray(newArray);
		
		for(int x: newArray)
			System.out.print(x + " ");
		

	}
	
	//1. Write a Java method that can check a string and tell if it is a palindrome. 
	//The method should have the prototype bool isPalindromeString(String aString).
	//The method should use a Stack to help solve the problem. 
	public static boolean isPalindromeString(String aString) {
		Stack<Character> newStack = new Stack<>();
		
		// add the characters to stack
		for(int i = 0; i < aString.length(); i++) {
			newStack.push(aString.charAt(i));
		}
		
		//check if first and last character are not equal, then return false
		for(int i = 0; i < aString.length(); i++) {
			if(aString.charAt(i) != newStack.pop()) {
				return false;
			}
		}
		
		return true;
	}
	
	
	//2. Write a Java method that can check an integer and tell if it is a palindrome. 
	//The method should have the prototype bool isPalindromeInteger(int anInteger).
	//The method should use a Queue to help solve the problem.
	public static boolean isPalindromeInteger(int anInteger) {
		Queue<Character> intQueue = new LinkedList<>();
		
		// convert integer to String 
		String integerStr = String.valueOf(anInteger);
		
		// add converted integer characters to intQueue 
		for(int i = 0; i < integerStr.length(); i++) {
			intQueue.add(integerStr.charAt(i));
		}
		
		int counter = integerStr.length() - 1;
		while(!intQueue.isEmpty()) {
			if(intQueue.remove() !=  integerStr.charAt(counter)) {
				return false;
			}
			counter--;
		}
		
		return true;
	}
	
	//Write a Java method that can generate an array of sorted random integer numbers. 
	//The method should have the prototype void generateArray(int[] array, int size).
	//The main method will call generateArray by passing an empty array and its size to it.
	//In the method generateArray, the generated random numbers should be initially
	//placed in a PriorityQueue which automatically sorts the numbers as they added to
	//the queue. Then the numbers should be copied to the array parameter in the
	//generateArray method for the main method to receive. 
	public static void generateArray(int[] array) {
		PriorityQueue<Integer> prioQueue = new PriorityQueue<>();
		
		Random random = new Random();
		for(int i = 0; i < array.length; i++) {
			int randomNum =  random.nextInt(100);
			prioQueue.add(randomNum);
		}
		
		
		for(int i = 0; i < array.length; i++) {
			array[i] = prioQueue.poll();
		}
	}
}
