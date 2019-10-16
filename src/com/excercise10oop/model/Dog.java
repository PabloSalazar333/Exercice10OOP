package com.excercise10oop.model;

public class Dog 
{
	public int id;
	private String name;
	protected String breed;
	public int age;
	public double height;
	
	public Dog() 
	{
	}
	public Dog(int id, String name, String breed, int age, double height)
	{
		this.id = id;
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.height = height;
	}
}
