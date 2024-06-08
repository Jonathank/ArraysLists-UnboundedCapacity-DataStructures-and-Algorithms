package application;

import arraylist_implementationUnBounded.ArrayUnbounded;

public class Application {

	public static void main(String[] args) {
		Integer a=29,b=33,c=40,d=75;
		
		ArrayUnbounded<Integer>list = new ArrayUnbounded<>();
		
		System.out.println("size: "+list.size());
		list.addnew( a);
		System.out.println("size: "+list.size());
		list.addnew( b);
		list.addnew( c);
		System.out.println("size: "+list.size());
		System.out.println("2nd  : "+list.get(2));
		System.out.println("removed  : "+list.remove(2));
		System.out.println("size: "+list.size());
		list.add(1, 60);
		System.out.println("2nd : "+list.get(2));
		System.out.println("@ 1 : "+list.get(1));
		
		System.out.println("size: "+list.size());
		
	}
}
