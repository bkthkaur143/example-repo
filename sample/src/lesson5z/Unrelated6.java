package lesson5z;

import lesson6Diffpackage.Base;

public class Unrelated6
{
	Unrelated6(){
//		var_default=10; not accessible directly
//		var_public=20;  not accessible directly
//		var_protected=40; not accessible directly
//		var_private=30;  this does not work as it is private
		
//		method_default(); not accessible directly
//		method_public(); not accessible directly
//		method_protected(); not accessible directly
//		method_private(); this does not work as it is private
		
		Base obj = new Base();
//		obj.var_default=10; this will not work as access is default
		obj.var_public=20;  
//		obj.var_protected=40; this wil not work because it is not inherited
//		obj.var_private=30;  this will not work
		
//		obj.method_default(); this will not work as access is default
		obj.method_public(); 
//		obj.method_protected(); this wil not work because it is not inherited
//		obj.method_private(); this does not work as it is private

	}

}
