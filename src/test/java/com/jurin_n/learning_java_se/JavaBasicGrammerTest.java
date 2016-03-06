package com.jurin_n.learning_java_se;

import static org.junit.Assert.*;

import org.junit.Test;

public class JavaBasicGrammerTest {

	@Test
	public void test() {
		int a = 100;
		long b = 312345L; //3.12345L はだめ。
		int c = 0777;
		int d = 0xDeed;
		int e = 0_52;
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);
		System.out.println("d=" + d);
		System.out.println("e=" + e);
	}

}
