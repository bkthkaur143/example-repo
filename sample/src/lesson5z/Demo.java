package lesson5z;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		int i;
		for(i=0;i<10;i++)
			System.out.println(i+" ");
		for(i=10;i>=1;i--,System.out.println("Hello"+i));
		int a[] = {11,22,33};
		int b[]=new int[10];
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int c[] = new int[n];
		
		System.out.println("Length is a "+a.length);
		for(i=0;i<a.length;i++)
			System.out.println(i);
		i--;
		while(i>=0) {
			System.out.println(a[i]);
			i--;
		}
		
sc.close();
	}

}
