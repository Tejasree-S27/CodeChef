import java.util.*;
import java.lang.*;
import java.io.*;
class SportsSection
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();

        // Check if the page number is between 8 and 10 
        if (X >= 8 && X <= 10) 
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
