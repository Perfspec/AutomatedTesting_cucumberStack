package com.qa.cucumber;

import java.util.ArrayList;

public class Stack {
	
	private ArrayList<String> data;
	
	public Stack() {
		data = new ArrayList<>();
	}
	
	public Stack(ArrayList<String> newData) {
		this.data = newData;
	}

	public void push(String string) {
		this.data.add(string);		
	}

	public int length() {
		return data.size();
	}

	public String pop() {
		int endOfStack = this.data.size()-1;
		String output = this.data.get(endOfStack);
		this.data.remove(endOfStack);
		return output;
	}

}
