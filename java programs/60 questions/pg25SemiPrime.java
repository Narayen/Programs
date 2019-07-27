// PROGRAM 25

// Semi prime number

import java.util.ArrayList;
import java.util.Scanner;

public class pg25SemiPrime {
	public static void main (String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter number of test cases:");
	int n=s.nextInt(); 

	for(int i=0;i<n;i++) {
		System.out.println("Enter total number:");
		
		int n1=s.nextInt();
		int[] a=new int[n1];
		int[] b=new int[n1];
		
		System.out.println("Enter numbers");
		
		for(int j=0;j<n1;j++) {
			a[j]=s.nextInt();
		}
		
		for(int k=0;k<n1;k++) {
			b[k]=s.nextInt();
		}
		
		for(int l=0;l<n1;l++) {
			ArrayList<Integer> list=new ArrayList<>();
			int sm=0,la=0;
			if(a[l]>b[l]) {
				sm=b[l];
				la=a[l];
			}
			else
			{
				sm=a[l];
				la=b[l];
			}
			for(int pr=2;pr<la;pr++)
			{
				if(isPrime(pr))
				{
					list.add(pr);
				}
			}
			System.out.println(getSemiPrimeCount(sm,la,list));
		}
		s.close();
	}
}

	public static int getSemiPrimeCount(int n1,int n2,ArrayList<Integer> al)
	{
		int count=0;
		for(int i=0;i<al.size();i++)
		{
			for(int j=i;j<al.size();j++)
			{
				if(al.get(i)*al.get(j)>=n1&&al.get(i)*al.get(j)<=n2) {
					count++;
				}
			}
		}
		return count;
	}
		
	public static boolean isPrime(int n)
	{
		boolean a=true;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				a=false;
				break;
			}
		}
		return a;
	}
}