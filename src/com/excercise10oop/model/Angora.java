package com.excercise10oop.model;

public class Angora extends Cat
{
	//Properties
	private double jawLong;
	
	//Constructors
	public Angora()
	{
	}
	
	public Angora(int id, String name, int age)
	{
		super(id, name, age);
	}
	public Angora(int id, String name, int age, double jawLong)
	{
		super(id, name, age);
		this.jawLong = jawLong;
	}
	//Getters and setters
	public double getJawLong()
	{
		return jawLong;
	}
	public void setJawLong(double jawLong)
	{
		this.jawLong = jawLong;
	}
	
	//ToString method specific to Angora
	@Override
	public String ToString()
	{
		return "Id:["+getId()+"], name:["+getName()+"], age:["+getAge()+"], jawLong:["+getJawLong()+"]";
	}
	@Override
	
}
