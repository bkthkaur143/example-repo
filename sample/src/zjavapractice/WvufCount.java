package zjavapractice;

import java.util.Map;
import java.util.TreeMap;

public class WvufCount
{
	String str = " Bharat Singh Rathore";
	
	void words() {
		int wCount = 0;
		int vCount=0;
		int uCount=0;
		for(int i =0; i<str.length(); i++)
		{
			char c = str.charAt(i);
			
			switch(c)
			{
				case ' ' :
				case '.' :
					wCount++;
					break;
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					vCount++;
					break;
			}
			
			
			
			if(c>=65 && c<=90)
			{
				uCount++;
			}
			
			
		}
		System.out.println(" Number of Words :"+wCount);
		System.out.println(" Number of Vowels :"+vCount);
		System.out.println(" Number of Uppercase :"+uCount);
		
	}
	
	void frequency() {
		TreeMap<Character, Integer> hmap = new TreeMap<Character, Integer>();
		
		for(int i =0; i<str.length();i++)
		{
			Integer c = hmap.get(str.charAt(i));
			
			if( hmap.get(str.charAt(i))==null)
			{
				hmap.put(str.charAt(i), 1);
				
			}else
			{
				hmap.put(str.charAt(i), ++c);
			}
			
		}
		for(Map.Entry m:hmap.entrySet())
		{
			System.out.println("Charater = "+m.getKey()+" value "+m.getValue());
		}
	}
		
		
		
	

	public static void main(String[] args) 
	{
		
		WvufCount s = new WvufCount();
		s.words();
		s.frequency();

	}

}
