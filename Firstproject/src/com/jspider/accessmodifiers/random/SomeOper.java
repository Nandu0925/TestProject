package com.jspider.accessmodifiers.random;

public interface SomeOper {
	default void buy() {
		System.out.println("you can buy any product ");
	}

}
