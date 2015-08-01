package com.jurin_n.learning_java_se;

/**
 * @author junnakano
 *
 */
public class Shipping {
	/**
	 * @param weight
	 *            荷物の重さ(kg)
	 * @param x
	 *            荷物の縦幅(cm)
	 * @param y
	 *            荷物の横幅(cm)
	 * @param z
	 *            荷物の高さ(cm)
	 * @return 送料(円)
	 * @throws IllegalArgumentException
	 */
	public int calculate(int weight, int x, int y, int z) throws IllegalArgumentException {
		Size size1 = sizeFromTotalLength(x, y, z);
		Size size2 = sizeFromWeight(weight);

		// 大きい方を採用
		Size size = (size1.sizeNumber() > size2.sizeNumber()) ? size1 : size2;

		// sizeから価格を算出
		return priceFromSize(size);

	}

	/**
	 * @param x
	 *            荷物の縦幅(cm)
	 * @param y
	 *            荷物の横幅(cm)
	 * @param z
	 *            荷物の高さ(cm)
	 * @return サイズ
	 * @throws IllegalArgumentException
	 */
	private Size sizeFromTotalLength(int x, int y, int z) throws IllegalArgumentException {
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

		throw new IllegalArgumentException();
	}

	/**
	 * @param weight
	 *            荷物の重さ(kg)
	 * @return サイズ
	 * @throws IllegalArgumentException
	 */
	private Size sizeFromWeight(int weight) throws IllegalArgumentException {
		// 重量判定
		if (weight <= 10) {
			return Size.S;
		} else if (weight <= 20) {
			return Size.M;
		} else if (weight <= 30) {
			return Size.L;
		}
		throw new IllegalArgumentException();
	}

	/**
	 * @param size
	 *            サイズ
	 * @return 送料(円)
	 */
	private int priceFromSize(Size size) {
		int price = 0;
		// サイズ別に金額算出
		switch (size) {
		case S:
			price = 600;
			break;
		case M:
			price = 1200;
			break;
		case L:
			price = 1800;
			break;
		}
		return price;
	}
}
