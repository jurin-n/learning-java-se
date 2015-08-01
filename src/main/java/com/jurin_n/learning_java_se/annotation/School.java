package com.jurin_n.learning_java_se.annotation;

public class School {

	@DomainCheck(field = "SCH_NAM")
	public String name;
	@DomainCheck(field = "ADR_NAM")
	public String address;

	public School(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

}
