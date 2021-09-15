package com.symflower

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class KotlinTest {
	@Test
	fun testJavaFoo() {
		val x = 0
		val expected = -1
		val actual = JavaFoo.javaFoo(x)

		assertEquals(expected, actual)
	}

	@Test
	fun testKotlinFoo() {
		val x = 3
		val expected = 1
		val actual = kotlinFoo(x)

		assertEquals(expected, actual)
	}
}
