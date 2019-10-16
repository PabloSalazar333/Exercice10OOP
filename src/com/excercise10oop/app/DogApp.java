package com.excercise10oop.app;

import com.excercise10oop.model.Dog;

public class DogApp 
{

	public static void main(String[] args) 
	{
		//Way 1
		Dog pluto;
		pluto = new Dog();
				
		System.out.println("Pluto's age: "+pluto.age);
		System.out.println("Pluto's height: "+pluto.height);
		System.out.println("Pluto's "+pluto.id+"\n");
		
		pluto.age = 15;
		pluto.height = 50;
		pluto.id = 10;
		
		System.out.println("Pluto's age: "+pluto.age);
		System.out.println("Pluto's height: "+pluto.height);
		System.out.println("Pluto's "+pluto.id+"\n");
		
		//Way 2
		Dog firulais = new Dog (1, "Firulasis", "Labrador",5,60.0);
		
		System.out.println("Firulas age: "+firulais.age);
		System.out.println("Firulas height: "+firulais.height);
		System.out.println("Firulas id: "+firulais.id);		
	}

}
