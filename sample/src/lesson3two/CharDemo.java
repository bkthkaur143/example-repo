package lesson3two;

public class CharDemo {

	public static void main(String[] args) {
		char a[]= {'a','b','C','@','1','?',' ','/','z','2'};
		System.out.println("size:"+a.length);
		a[1]='e';
		for(int i=0;i<a.length;i++)
		{
			if(Character.isDigit(a[i]))
				System.out.println(a[i]+" is a digit");
			if(Character.isLetter(a[i]))
				System.out.println(a[i]+" is a letter");
			if(Character.isWhitespace(a[i]))
				System.out.println(a[i]+" is a whitespace");
			if(Character.isUpperCase(a[i]))
				System.out.println(a[i]+" is a uppercase");
			if(Character.isLowerCase(a[i]))
				System.out.println(a[i]+" is a lowercase");
			if(!Character.isLetterOrDigit(a[i]) && !Character.isWhitespace(a[i]))
				System.out.println(a[i]+" is a special symbol");
		}
//************************************ scope in java **************************************************
		System.out.println("scope in java");
		
		int outer=1;
		{
			int inner=2;
			System.out.println("inner "+inner);
			System.out.println("outer "+outer);
		}
		int inner=3;
		System.out.println("inner "+inner);
		System.out.println("outer "+outer);
		
//************************************ String in Swtich **************************************************
				System.out.println("String in Switch");		
				
				String currentday="thursday";
				switch(currentday)
				{
					case "monday":
      				case "tuesday":
      				case "wednesday":
      					System.out.println("boring");
      					break;
      				case "thursday":
      					System.out.println("awesome");
      					break;
      				case "friday":
      				case "saturday":
      				case "sunday":
      					System.out.println("enjoy your day !");
      					break;
      					
      				default:
      					System.out.println("invalid day");
						
					}
				
		
	}

}
