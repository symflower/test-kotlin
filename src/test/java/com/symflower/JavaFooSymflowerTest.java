package com.symflower;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class JavaFooSymflowerTest {
	@Test
	public void javaFoo1() {
		int x = 0;
		int expected = -1;
		int actual = com.symflower.JavaFoo.javaFoo(x);

		assertEquals(expected, actual);
	}

	@Test
	public void javaFoo2() {
		int x = 11;
		int expected = 1;
		int actual = com.symflower.JavaFoo.javaFoo(x);

		assertEquals(expected, actual);
	}
}
