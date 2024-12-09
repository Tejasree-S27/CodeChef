import java.util.*;
import java.lang.*;
import java.io.*;
public class CricketWorldCupQualifier
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        // Check if the points are greater than or equal to 12
        if (X >= 12) 
        {
            System.out.println("Yes");
        }
        else 
        {
            System.out.println("No");
        }

	}
}
