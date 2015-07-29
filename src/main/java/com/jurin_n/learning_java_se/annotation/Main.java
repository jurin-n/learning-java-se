package com.jurin_n.learning_java_se.annotation;

import java.lang.reflect.Field;

public class Main {
	static int i=0;
	public static void main(String[] args) {
		School school = new School("あああ小学校", "東京都あああ区");
		JapanesePerson p = new JapanesePerson(
				 "taro yamada"
				,30
				,"とーきょーじゃぱん Japan"
				,true
				,school);
		domainCheck(p);
	}

	public static void domainCheck(Object obj){
		for(Field f :obj.getClass().getFields()){
			System.out.println("--------" + ++i +"回目("+f.getName()+")--------------------------");
			if(f.isAnnotationPresent(DomainCheck.class)){
				try {
					
					System.out.println(
						 "FIELD_NAME=" + f.getAnnotation(DomainCheck.class).field()
						+"\nCheck field="+f.getName()
						+"\nfield value=" + f.get(obj));
				} catch (IllegalArgumentException | IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else{
				try {
					domainCheck(f.get(obj));
				} catch (IllegalArgumentException | IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
