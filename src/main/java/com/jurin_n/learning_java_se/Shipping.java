package com.jurin_n.learning_java_se;

public class Shipping {
	public int calculate(int weight, int x, int y, int z) {
		Size size1 = sizeFromTotalLength(x, y, z);
		Size size2 = sizeFromWeight(weight);

		// 大きい方を採用
		Size size = (size1 > size2) ? size1 : size2;

		// sizeから価格を算出
		return priceFromSize(size);

	}

	private Size sizeFromTotalLength(int x, int y, int z) {
		if (!((x > 0 & y > 0 & z > 0) & (x + y + z) < 180)) {
			throw new IllegalArgumentException();
		}
		int total = x + y + z;
		// 3辺合計判定
		if (total <= 60) {
			return Size.S;
		} else if (total <= 120) {
			return Size.M;
		} else if (total <= 180) {
			return Size.L;
		}
	}

	private Size sizeFromWeight(int weight) {
		if (!(weight > 0 & weight <= 30)) {
			throw new IllegalArgumentException();
		}
		// 重量判定
		if (weight <= 10) {
			return Size.S;
		} else if (weight <= 20) {
			return Size.M;
		} else if (weight <= 30) {
			return Size.L;
		}
	}

	private int priceFromSize(Size size) {
		if (!(size == 1 || size == 2 || size == 3)) {
			throw new IllegalArgumentException();
		}
		int price = 0;
		// サイズ別に金額算出
		switch (size) {
		case Size.S:
			price = 600;
			break;
		case Size.M:
			price = 1200;
			break;
		case Size.L:
			price = 1800;
			break;
		}
		return price;
	}
}
