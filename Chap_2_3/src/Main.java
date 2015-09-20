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
	int rank=0,flag=0;
	int key;
	System.out.println("Key");
	key = s.nextInt();
	for(int i=0;i<n;i++)
	{
		if(arr[i]<key)
			rank++;
		if(arr[i]==key)
			flag=1;
	}
	if(flag==0)
		System.out.println("No element ");
	else
		System.out.println("rank:"+ (rank+1));
}
}
