import java.util.*;
import java.lang.*;
import java.io.*;
class IceCreamAndCone
{
	public static void main (String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
        int X=sc.nextInt(); 
        int Y=sc.nextInt(); 
        int max=Math.min(X, Y);
        System.out.println(max);
	}
}
