/*
 * main.java
 * Contains the main class for the solution package
 * 
 * Created by: Austin Stephens
 * Created on: 4/12/2017
 * 
 * Instructions: To handle the modules in your operating system, you will need to implement a stack. 
 * The stack will be for holding the modules in the order in which they have to be compiled. 
 * You may use any data structure, singly-linked list, etc. 
 * However, your program must be able to handle the three stack functions; push, pop, and peek. 
 * The final program should be able to take a list of data items and generate a stack. 
 * You are free to specify the data type of the items. However, keep in mind that these items will represent your operating system modules. 
 * You can choose to have the data type as strings 
 * (Module A, Module B, etc. …), characters (A, B, C…) or integers (1, 2,3…).
 * 
 */

package solution;

public class main {
	public static void main(String[] args) {
		// Create a new stack
		Stack stack = new Stack();

		// Push some modules onto the stack
		stack.push("Module A");
		stack.push("Module B");
		stack.push("Module C");
		stack.push("Module D");
		stack.push("Module E");

		// Peek at the top of the stack
		System.out.println("Top of the stack: " + stack.peek());

		// Pop the top of the stack
		System.out.println("Popped: " + stack.pop());

		// Peek at the top of the stack
		System.out.println("Top of the stack: " + stack.peek());

		// Pop the top of the stack
		System.out.println("Popped: " + stack.pop());

		// Peek at the top of the stack
		System.out.println("Top of the stack: " + stack.peek());

		// Pop the top of the stack
		System.out.println("Popped: " + stack.pop());

		// Peek at the top of the stack
		System.out.println("Top of the stack: " + stack.peek());

		// Pop the top of the stack
		System.out.println("Popped: " + stack.pop());

		// Peek at the top of the stack
		System.out.println("Top of the stack: " + stack.peek());

		// Pop the top of the stack
		System.out.println("Popped: " + stack.pop());

		// Peek at the top of the stack
		System.out.println("Top of the stack: " + stack.peek());
	}
	

}
