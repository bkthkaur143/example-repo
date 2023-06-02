package lesson6SamePAckage;

public class Unrelated 
{
	Unrelated(){
//		var_default=10; not accessible directly
//		var_public=20; not accessible directly
//		var_protected=40; not accessible directly
//		var_private=30; this will not work as package is different
		
//		method_default(); not accessible directly
//		method_public(); not accessible directly
//		method_protected(); not accessible directly
//		method_private(); this will not work as package is different
		
		Base obj = new Base();
		obj.var_default=10; 
		obj.var_public=20;
		obj.var_protected=40;
//		obj.var_private=30; this will not work as package is different
		
		obj.method_default(); 
		obj.method_public();
		obj.method_protected();
//		method_private(); this will not work as package is different
		

	}

}
