import java.util.Scanner;


public class Main 
{
public static void main(String args[])
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter number of elements in array");
	int n = s.nextInt();
	int arr[] = new int[n];
	System.out.println("Enter elements in array");
	for(int i=0;i<n;i++)
	{
		arr[i] = s.nextInt();
	}
	System.out.println("Rank");
	int rank = s.nextInt();
	 if(rank>n){
         System.out.println("Invaild rank");
     }
     else
     Elementsofrank(arr,0,n-1,rank-1);
     

}
public static void Elementsofrank(int a[],int start,int end,int rank)
{
	if(start<=end)
	{
	int pivot = a[end];
	int pindex = start;
	for(int i=start;i<end;i++)
	{
		if(a[i]<=pivot)
		{
			int swap = a[pindex];
			a[pindex]=a[i];
			a[i]=swap;
			pindex++;
		}
	}
	int swap = a[end];
	a[end]=a[pindex];
	a[pindex]=swap;
	        if(pindex==rank){
	        	if(pindex>1&&a[pindex-1]==a[pindex])
	        		System.out.println("No element");
	        	else
	      
	            System.out.println("Elements of rank : " +a[pindex]);
	            return ;
	        }
	        if(pindex<rank){
	            Elementsofrank(a,pindex+1,end,rank);
	        }
	        if(pindex>rank){
	            Elementsofrank(a,start,pindex-1,rank);
	        }
	        }
	  else
	  {
		  System.out.println("No element");
	        return ;
	  }
}
public void print(int arr[])
{
	for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]+" ");
}
}


