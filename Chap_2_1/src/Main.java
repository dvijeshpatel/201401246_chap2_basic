import java.util.*;
public class Main 
{
public static void main(String args[])
{
	ArrayList<Integer> l = new ArrayList<Integer>();
	System.out.println("(1)Add total elements");
	System.out.println("(2)Search");
	System.out.println("(3)Print");
	System.out.println("(4)Exit");
	Scanner s = new Scanner(System.in);
	
	int c = s.nextInt();
	while(4!=3)
	{
	if(c==1)
	{
		System.out.println("(1)Add element");
		System.out.println("(2)break");
		while(true)
		{
			int temp = s.nextInt();
		if(temp==1)
		{
			l.add(s.nextInt());
		}
		if(temp==2)
			break;
		System.out.println("(1)Add element");
		System.out.println("(2)break");
		}
	}
	if(c==2)
	{
	System.out.println("(1)Binary Search Iterativly");
	System.out.println("(2)Binary search Recursivly");
	int temp = s.nextInt();
	if(temp==1)
	{
		System.out.println("Enter key");
		int key = s.nextInt();
		binarySearchiterativly(l,key);
	}
	if(temp==2)
	{
		System.out.println("Enter key");
		int key = s.nextInt();
		 binarySearchRecursibvely(l,key,0,l.size()-1);
	}
	}
	if(c==3)
	{
		print(l);
	}
	System.out.println("(1)Add total elements");
	System.out.println("(2)Search");
	System.out.println("(3)Print");
	System.out.println("(4)Exit");
	c= s.nextInt();
	}
}
public static void binarySearchiterativly(ArrayList<Integer> ls,int key)
{
	int s=0,e=ls.size()-1,flag=0,m;
	
	while(s<e)
	{ 
		m=(s+e)/2;
	
		if(ls.get(m)==key)
		{
			System.out.println("index is "+(m+1));
			flag=1;
			break;
		}
		else if(ls.get(m)>key)
		{
			e=m;
		}
		else if(ls.get(m)<key)
		{
			s=m+1;
		}
		
	}
	if(s==e&&ls.get(e)!=key)
	{
		System.out.println("No element found");
	}

}
public static void binarySearchRecursibvely(ArrayList<Integer> ls,int key,int s,int e)
{
	int m = (s+e)/2;
	
	if(s<e)
	{
	
		if(key==ls.get(m)&&s!=e)
		{
			System.out.println("index is "+ (m+1));
			return;
		}
		else if(key<ls.get(m))
		{
			binarySearchRecursibvely(ls,key,s,m);
		}
		else if(key>ls.get(m))
		{
			binarySearchRecursibvely(ls,key,m+1,e);
		}
		
	}
	if(s>=e&&ls.get(m)!=key)
	{
		System.out.println("No element found");
		return;
	}

}
public static void print(ArrayList<Integer> l)
{
	System.out.println(l.toString());
}
}

