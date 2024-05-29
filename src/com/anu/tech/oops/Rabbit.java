package com.anu.tech.oops;

public class Rabbit extends Lion{
	
	private String name="Rabbit";
	public String food="veg";
	public Rabbit() {
		System.out.println("Rabbit()");
	}
	
	public void print()
	{
		System.out.println("Rabbit print()");
	}

	public static void main(String[] args) {
		// creating objects for both parent and child
		// parent = Animal
		// child= Rabbit
		
		Rabbit obj=new Rabbit(); // this code will be execute two constructors 1. Animal()  and 2. Rabbit()
		
		obj.print();//  will give output  Rabbit print()
		System.out.println(obj.name);//Rabbi
		System.out.println(obj.food);//veg
		System.out.println("***************************");
		Lion obj1=new Lion(); // this code will be execute one constructor 1. Animal()
		obj1.print();//Animal print()
		//System.out.println(obj1.name);//compiler shows change visibility of name to protected
		System.out.println(obj1.food);//non veg
		
		System.out.println("####################################");
		
		//Rabbit obj2=new Animal();// compiler shows Type mismatch: cannot convert from Animal to Rabbit. Hence not possible
		Lion obj3=new Rabbit(); //this code will be execute two constructors 1. Animal()  and 2. Rabbit()
		obj3.print();// Rabbit print()
		//System.out.println(obj3.name);//The field Animal.name is not visible
		System.out.println(obj3.food);// non veg
		
		
		

	}

}
