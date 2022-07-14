package com.day5.abstractandgeneric;

public class GenericClass<T> {
	
	T objek;
	
	public void setData(T objek) {
		this.objek = objek;
	}
	
	public T getData() {
		return objek;
	}
	
	
}
