/*
 * moduleFunc.java
 * Class to handle the stack functions
 * 
 * Created by: Austin Stephens
 * Created on: 07/10/2024
 * Rasumssen University
 * Professor: Kumar
 * 
 */

package solution;

import java.util.ArrayList;

public class moduleFunc {
	ArrayList<String> stack = new ArrayList<String>();
	
	//Push function
	public void push(String module) {
		stack.add(module);
	}
	
	//Pop function
	public void pop() {
		if (stack.size() == 0) {
			System.out.println("Stack is empty");
		} else {
			stack.remove(stack.size() - 1);
		}
	}
	
	//Peek function
	public void peek() {
		if (stack.size() == 0) {
			System.out.println("Stack is empty");
		} else {
			System.out.println(stack.get(stack.size() - 1));
		}
	}
	
	//Print function
	public void print() {
		if (stack.size() == 0) {
			System.out.println("Our stack is empty");
		} else {
			for (int i = 0; i < stack.size(); i++) {
				System.out.println(stack.get(i));
			}
		}
	}
	
	
	
}
