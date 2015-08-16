package com.jurin_n.learning_java_se.character;

import java.nio.charset.Charset;

import org.junit.Test;

public class DefaultCharasetTest {

	@Test
	public void test() {
		System.out.println("Charset.defaultCharset().toString()="
					+Charset.defaultCharset().toString());
		System.out.println("Charset.defaultCharset().displayName()="
					+Charset.defaultCharset().displayName());
		System.out.println("Charset.defaultCharset().name()="
					+Charset.defaultCharset().name());
	}

}
