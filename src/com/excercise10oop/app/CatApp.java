package com.excercise10oop.app;

import com.excercise10oop.model.Cat;

public class CatApp {

	public static void main(String[] args) 
	{
		Cat michi = new Cat();
		
		michi.setId(1);
		michi.setName("Michi");
		michi.setAge(3);
		
		System.out.println("Michi's Id: "+michi.getId());
		System.out.println("Michi's Name: "+michi.getName());
		System.out.println("Michi's Age: "+michi.getAge());
		
		System.out.println(michi.ToString());
	}

}
