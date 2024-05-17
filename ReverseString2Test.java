package com.pranav.learning;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseString2Test {

	@Test
	 void test() {
		ReverseString reverse= new ReverseString();
		
		String actual=reverse.reverseSring("Java");
		String expected ="avaJ";
	}

}
