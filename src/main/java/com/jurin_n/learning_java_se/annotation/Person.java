package com.jurin_n.learning_java_se.annotation;

public class Person {
	@DomainCheck(field="LST_NAM")
	public String name;
	
	@DomainCheck(field="AGE")
	public int age;
	
	public Person(){
		
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}
