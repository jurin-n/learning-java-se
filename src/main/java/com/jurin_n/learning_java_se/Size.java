package com.jurin_n.learning_java_se;

public enum Size {
	S(10), M(20), L(30);

	private final int sizeNumber;

	Size(int size) {
		this.sizeNumber = size;
	}

	public int sizeNumber() {
		return sizeNumber;
	}
}
