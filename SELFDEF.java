/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		int a[]=new int[t];
		int k=0;
		for(int i=1;i<=t;i++)
		{
		    int n=sc.nextInt();
		    int count=0;
		    for(int j=0;j<n;j++)
		    {
		        int x=sc.nextInt();
		        if(x<=60&&x>=10)
		            count++;
		    }
		    a[k++]=count;
		}    
		for(int i:a)
		System.out.println(i);
	}
}
