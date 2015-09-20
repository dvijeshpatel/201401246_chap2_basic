import java.util.Scanner;
public class Main 
{
public static void main(String args[])
{

int c=10;
while(c!=6)
{
	Scanner s= new Scanner(System.in);
System.out.println("insert Total number element");
int n = s.nextInt();
int a[] = new int[n];
System.out.println("Enter elements in array");
for(int i=0;i<n;i++)
	a[i]=s.nextInt();
System.out.println("(1)Bubble Sort");
System.out.println("(2)Insertion Sort");
System.out.println("(3)Selection Sort");
System.out.println("(4)Quick Sort");
System.out.println("(5)Merge Sort");
System.out.println("(6)Exit");
c=s.nextInt();
switch(c)
{
case 1:
{
	bubbleSort(a);
	for(int i=0;i<a.length;i++)
		System.out.print(a[i]+" ");
	break;
}
case 2:
{
	insertitionSort(a);
	for(int i=0;i<a.length;i++)
		System.out.print(a[i]+" ");
	break;
}
case 3:
{
	selectionSort(a);
	for(int i=0;i<a.length;i++)
		System.out.print(a[i]+" ");
	break;
}
case 4:
{
	quickSort(a,0,a.length-1);
	for(int i=0;i<a.length;i++)
		System.out.print(a[i]+" ");
	break;
}
case 5:
{
	mergeSort(a);
	for(int i=0;i<a.length;i++)
		System.out.print(a[i]+" ");
	break;
}
case 6:
{
	break;
}
}
System.out.println();
}
}
public static void bubbleSort(int arr[])
{
	int c=0,d=0,n=arr.length,swap;
	 for (c = 0; c < ( n - 1 ); c++) {
	      for (d = 0; d < n - c - 1; d++) {
	        if (arr[d] > arr[d+1])
	        {
	          swap       = arr[d];
	          arr[d]   = arr[d+1];
	          arr[d+1] = swap;
	        }
	      }
	    }
}
public static void quickSort(int arr[],int start,int end)
{
	if(start<end)
	{
		int p = partition(arr,start,end);
		quickSort(arr,start,p-1);
		quickSort(arr,p+1,end);
	}
}
public static int partition(int a[],int start,int end)
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
	return pindex;
}
public static int[] mergeSort(int []list)
{
	if(list.length<=1)
		return list;
	int[] first = new int[list.length/2];
	int[] second = new int[list.length-first.length];
	System.arraycopy(list, 0, first ,0, first.length);
	System.arraycopy(list, first.length,second, 0,second.length);
	mergeSort(first);
	mergeSort(second);
	merge(first,second,list);
	return list;
}
public static void merge(int[] first,int []second,int[] result)
{
	int ifirst=0;
	int isecond=0;
	int j=0;
	while(ifirst<first.length&&isecond<second.length)
	{
		if(first[ifirst]<second[isecond])
		{
			result[j]=first[ifirst];
			ifirst++;
		}
		else
		{
			result[j]=second[isecond];
			isecond++;
		}
		j++;
	}
	System.arraycopy(first, ifirst, result, j, first.length-ifirst);
	System.arraycopy(second, isecond, result, j, second.length-isecond);
}
public static void insertitionSort(int a[])
{
	for(int j=0;j<a.length;j++)
	{
		int key=a[j];
		int i=j-1;
		while(i>-1&&a[i]>key)
		{	
			a[i+1]=a[i];
			i--;
		}
		a[i+1]=key;
	}
}
public static void selectionSort(int a[])
{
	for(int i=0;i<a.length-1;i++)
	{
		int minpos=i;
		for(int j=i+1;j<a.length;j++)
		{
			if(a[j]<a[minpos])
				minpos=j;
		}
		int temp = a[minpos];
		a[minpos]=a[i];
		a[i]=temp;
	}
}
}
