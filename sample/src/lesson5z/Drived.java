package lesson5z;

import lesson6Diffpackage.Base;

public class Drived extends Base

{
	Drived()
	{
//		var_default=10; this will not work as package is different
		var_public=20;
		var_protected=40;
//		var_private=30; this will not work as package is different
		
//		method_default(); this will not work as package is different
		method_public();
		method_protected();
//		method_private(); this will not work as package is different
		
	}
;
	

}
