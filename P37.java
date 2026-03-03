/*
Write a program to implement a Generic class.
@Febin Sunny
Roll No:27
  
 */

import java.util.*;
import java.io.*;

class GenStackI <T>
{
	ArrayList <T> stack = new ArrayList<T>();
	int top = -1;

	public void push(T d)
	{
		stack.add(d);
		top++;
	}
	public void pop()
	{
		if(top == -1)
		{
			System.out.println("Empty..");
		}
		else
		{
			System.out.println(stack.remove(top--));
		}
	}
}


public class P37 {
    public static void main(String args[])
	{
		GenStackI <Integer> is = new GenStackI<Integer>();
		is.push(12);
		is.push(30);

		is.pop();
		is.pop();		
	}
}
