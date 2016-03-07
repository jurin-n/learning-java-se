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
	@Test
	public void test2() {
		char c1 = 'a';
		char c2 = '\uf000';
		
		System.out.println("c1=" + c1);
		System.out.println("c2=" + c2);
		int java = 0;
		//int goto = 0;
		int $100 = 0;
		int _$ = 0;
		int NULL = 0;
		//int num# = 0;
		//int ˜val = 0;
	    int TRUE = 0;
	    int FALSE = 0;
	}
}
