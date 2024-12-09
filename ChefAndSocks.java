import java.util.*;
import java.lang.*;
import java.io.*;

class ChefAndSocks
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner sc=new Scanner(System.in);
        int X=sc.nextInt();
        // Check if the points are greater than or equal to 12
        if (X >= 12) 
        {
            System.out.println("Yes");
        }
        else 
        {
            System.out.println("No");
        }
        sc.close();
	}
}
