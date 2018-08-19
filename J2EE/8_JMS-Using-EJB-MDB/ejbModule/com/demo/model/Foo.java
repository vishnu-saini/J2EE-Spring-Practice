package com.demo.model;

import java.io.Serializable;

public class Foo implements Serializable, Cloneable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4410339419899870753L;
	private String data;

	public Foo() {
	}

	public Foo(String data) {
		this.data = data;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
}
