package com.qa.cucumber.tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import com.qa.cucumber.Stack;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StackSteps {
	
	private Stack stack;
	private String output;

	@Given("^an empty stack$")
	public void an_empty_stack() {
		stack = new Stack();
	}

	@When("^I push an item into the stack$")
	public void i_push_an_item_into_the_stack() {
	    stack.push("Joseph");
	}

	@Then("^the stack contains one item$")
	public void the_stack_contains_one_item() {
	    assertEquals(1,stack.length());
	}

	@When("^I push another item into the stack$")
	public void i_push_another_item_into_the_stack() {
	    stack.push("Lewis");
	}

	@Then("^the stack contains two items$")
	public void the_stack_contains_two_items() {
		assertEquals(2,stack.length());
	}

	@When("^I pop from the stack$")
	public void i_pop_from_the_stack() {
	    output = stack.pop();
	}

	@Then("^I get the same item back$")
	public void i_get_the_same_item_back() {
	    assertEquals("Joseph", output);
	}

	@Given("^a stack with (\\d+) items$")
	public void a_stack_with_items(int arg1) {
	    ArrayList<String> newData = new ArrayList<>();
	    for(Integer i=0; i<arg1; i++) {
	    	newData.add("Alvin "+i.toString());
	    }
	    stack = new Stack(newData);
	}
}
