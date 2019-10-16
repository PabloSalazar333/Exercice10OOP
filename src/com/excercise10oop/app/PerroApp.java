package com.excercise10oop.app;

import com.excercise10oop.model.Perro;

public class PerroApp 
{

	public static void main(String[] args) 
	{
		//Way 1
		Perro pluto;
		pluto = new Perro();
		
		//Way 2
		Perro tribillin = new Perro();
		
		pluto.age = 15;
		pluto.Height = 50;
		pluto.id = 10;
		
		System.out.println("Pluto's age: "+pluto.age);
		System.out.println("Pluto's height: "+pluto.Height);
		System.out.println("Pluto's "+pluto.id);
	}

}
