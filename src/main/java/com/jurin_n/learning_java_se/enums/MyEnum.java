package com.jurin_n.learning_java_se.enums;

public enum MyEnum {
    HOGE(1),
    FUGA(2);

    private final int id;

    private MyEnum(final int id) {
        this.id = id;
    }

    // id から、定数オブジェクトを逆引きするメソッド
    public static MyEnum valueOf(int id) {
        // values() で、列挙したオブジェクトをすべて持つ配列が得られる
        for (MyEnum num : values()) {
            if (num.getId() == id) { // id が一致するものを探す
                return num;
            }
        }

        throw new IllegalArgumentException("no such enum object for the id: " + id);

        // Null-Object パターンにしたがって、列挙に UNKNOWN みたいなのを入れておくのも良い
        // return UNKNOWN;
    }

    public int getId() {
        return id;
    }
}
