package sample;

import java.util.Scanner;

//class Printer
//{
//	public void print(Number i)
//	{
//		System.out.println(i);
//	}
//}
//
//
//
//
//
//abstract class Human
//{
//	public abstract void eat();
//	public void walk()
//	{
//		
//	}
//	
//}
//class Man extends Human
//{
//	public void  eat() 
//	{
//		System.out.println("bharat");
//	}
//}
//
//
//
//public class AbstractDemo
//{
//
//	public static void main(String[] args)
//	{
//		Human obj=new Man();
//		obj.eat();
//		Printer obj1 = new Printer();
//		obj1.print(6);
//
//	}
//
//}

abstract class Shape

{
	protected float area;
	protected float PI=3.14f;
	String shapename;
	
	public void show()
	{
		System.out.println("area of shape "+area);
		
	}
	
	public abstract void calarea();
	
}

class Circle extends Shape
{
	private float radius;
	
	public float getRadius() {
		return radius;
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}
	
	
	public Circle(float radius) {
		super();
		this.radius = radius;
		shapename="circle";
	}
	public Circle() {
		super();
		shapename="circle";
		
	}
	public void calarea() 
	{
		area = PI*radius*radius;
	}
}
class Cylinder extends Shape
{
	private float radius;
	private float height;

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}
	

	public Cylinder(float radius, float height) {
		super();
		this.radius = radius;
		this.height = height;
		shapename="Cylinder";
	}

	public Cylinder() {
		super();
		shapename="Cylinder";
	}

	@Override
	public void calarea() {
		
		area = 2*PI*radius*(height+radius);
	}
	
}

public class AbstractDemo
{

	public static void main(String[] args)
	{
//		Shape s1;
//		Circle c1;
//		Cylinder c2;
//		
//		c1=new Circle(4);
//		c1.calarea();
//		c1.show();
//		
//		c2=new Cylinder(4,5);
//		c2.calarea();
//		c2.show();
		Shape s1;
		int ch;
		
		
		
		do {
			System.out.println("1.Circle");
			System.out.println("2.Cylinder");
			System.out.println("3.For terminating");
			System.out.println(" enter your choice ");
		Scanner sc = new Scanner(System.in);
		ch=sc.nextInt();
	
		switch(ch) 
		{
		case 1:
			s1=new Circle(5);
			System.out.println(s1.shapename);
			s1.calarea();
    		s1.show();
    		break;
			
    		
		case 2:
			s1=new Cylinder(5,4);
			System.out.println(s1.shapename);
			s1.calarea();
    		s1.show();
		case 3:	
		   System.out.println("termineted");
		   System.exit(0);
		   break;
		
    	default:
    		System.out.println("invalid");
		}
		}
		while(ch!=3);
	}
}	
	
	
	