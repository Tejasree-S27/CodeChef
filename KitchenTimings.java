import java.util.*;
import java.lang.*;
import java.io.*;
class KitchenTimings
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) 
        {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            // Calculate the number of hours Chef works
            int hoursWorked = Y - X;
            System.out.println(hoursWorked);
        }
        sc.close();
	}
}
