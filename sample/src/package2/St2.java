package package2;

import package1.St;

public class St2 {

	public static void main(String[] args) 
	{
		St obj1=new St();
	//	obj1.a=24; // (eroor) default variable cant access another package , access same package only
		obj1.ab=43; //public variable access same package or another package 
	//	obj1.abc=21;  protected is access with in package or another package through child class
	//	obj1.abcd private access with in the class

	}

}
