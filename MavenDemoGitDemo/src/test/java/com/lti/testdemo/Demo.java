package com.lti.testdemo;

import static org.junit.Assert.*;

import org.junit.Test;


public class Demo {

	
	@Test
	public void test() {
		int actual=10;
		int expected=6;
		assertEquals(expected,actual);
	}

}
