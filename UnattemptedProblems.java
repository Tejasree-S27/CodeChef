import java.util.*;
import java.lang.*;
import java.io.*;

class UnattemptedProblems
{
	public static void main (String[] args) 
	{
	     Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        // Calculate the number of unattempted problems
        int unattempted = X - Y;
        // Output the result
        System.out.println(unattempted);
        sc.close();
	}
}
