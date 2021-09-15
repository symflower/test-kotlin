package com.symflower;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class KotlinFooTest {
	@Test
	public void kotlinFoo() {
		int x = 0;
		int expected = -1;
		int actual = KotlinFooKt.kotlinFoo(x);

		assertEquals(expected, actual);
	}
}
