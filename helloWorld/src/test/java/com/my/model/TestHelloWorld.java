package com.my.model;
import org.junit.*;
import org.junit.Assert.*;

public class TestHelloWorld{
	@Test
	public void testHello(){
		Assert.assertEquals("Hello,World!",new HelloWorld().sayHello());
	}
}