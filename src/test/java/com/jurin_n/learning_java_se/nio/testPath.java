package com.jurin_n.learning_java_se.nio;

import static org.junit.Assert.*;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Test;

public class testPath {

	@Test
	public void test() {
		System.out.println(Paths.get("c:¥ssss¥sss¥test.txt").getFileName().toString());
	}

}
