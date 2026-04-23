package com.demo.arrays;

public class MyArray {
	
	private int[] arr;
	private int count;
	public MyArray() {
		arr=new int [10];
		count=0;
	}
	public MyArray(int size) {
		super();
		arr=new int[size];
		count=0;
	}
	public MyArray(int[] arr, int count) {
	
		this.arr = arr;
		this.count = count;
	}
	public int getCapacity(){
		return arr.length;
	}
	
	public int getCount() {
		return count;
	}
	
	//add at end of the array
	
	public boolean add(int x)
	{
		if(count<arr.length)
		{
			arr[count]=x;
			count++;
			return true;
			
		}else
		{
			return false;
		}
	}
	
	//add in between the array
	
	public boolean add(int x,int pos)
	{
		//check whether position is within limit
		if((count<arr.length)&&(pos<count)) {
			//shift values one location to right from arr.length to position
			//add the number at the pos
			for(int i=count;i>=0;i--)
			{
				arr[i]=arr[i-1];
			}
			//add x at the position
			arr[pos]=x;
			count++;
			return true;
		}else {
			return false;
		}
		
	}
	//search the given value and return its position
	public int searchByValue(int val)
	{
		for(int i=0;i<count;i++)
		{
			if(arr[i]==val);
			{
				
			return i;
			}
		}
	
	return -1;
	
	}
	
	//delete from the given position
	
	public boolean deleteByPosition(int pos)
	{
		//Check if the pos to find is less then count
		if(pos<count)
		{
			//shift all values from pos+1 to count------>1 location left
			for(int i=pos+1;i<count;i++)
			{
				arr[i-1]=arr[i];
			}
			//reduce count by 1
			count--;
			return true ;
		}
		//Position is out of Bounds
		return false;
	}
	
	
	public int deleteByValue(int value)
	{
		return false;
		
	}

	
}
