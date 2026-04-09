package com.demo;

public class TestMyCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCompare ob=new MyCompare() 
		        {
				
				@Override
				public int compare(int x, int y) {
					// TODO Auto-generated method stub
					return x>y?x:y;
				}	
	};
	System.out.println("compare :"+ob.compare(23,10));
	
	MyCompare ob2=(x,y)->x>y?x:y;//Annonymous Function
	System.out.println("compare :"+ob2.compare(23,10));
	MyStringCompare<String,Integer> ob3=(x,y)->x.length()>y.length()?x.length():y.length();
	System.out.println(ob3.compare("HElooe", "oyeeeeeee"));
	
	MyStringCompare<Integer,Integer> ob4=(x,y)->x>y?x:y;
	System.out.println(ob4.compare(23, 29));

  }
	
}
	


