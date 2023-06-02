package lesson6SamePAckage;

public class Derived  extends Base
{
	Derived()
	{
		var_default=10; 
		var_public=20;
		var_protected=40;
//		var_private=30; this will not work as package is different
		
		method_default(); 
		method_public();
		method_protected();
//		method_private(); this will not work as package is different
		
	}

}
