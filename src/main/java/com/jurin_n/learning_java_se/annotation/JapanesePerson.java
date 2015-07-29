package com.jurin_n.learning_java_se.annotation;

public class JapanesePerson extends Person {

	@DomainCheck(field="ADR_NAM")
	public String address;
	
	@DomainCheck(field="STATUS")
	public boolean isMusician;
	
	public School school;
	
	public JapanesePerson(String name, int age, String address,boolean isMusician,School school) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.isMusician=true;
		this.school = school;
	}
}
