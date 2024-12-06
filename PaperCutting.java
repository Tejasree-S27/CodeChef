import java.util.*;
import java.lang.*;
import java.io.*;
class PaperCutting
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int n=sc.nextInt();
		    int k=sc.nextInt();
		    int Max=(n/k)*(n/k);
		    System.out.println(Max);
		}
		sc.close();
	}
}
