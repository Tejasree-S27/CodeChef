import java.util.*;
import java.lang.*;
import java.io.*;
class MinimumWage
{
	public static void main (String[] args) 
    {
		 Scanner sc= new Scanner(System.in);
        int X=sc.nextInt();
        // Minimum wage is 11 dollars per hour
        if (X>11)
        {
            System.out.println("YES");
        } 
        else
        {
            System.out.println("NO");
        }
        sc.close();
	}
}
