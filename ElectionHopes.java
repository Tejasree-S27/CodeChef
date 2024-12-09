import java.util.*;
import java.lang.*;
import java.io.*;
class ElectionHopes
{
	public static void main (String[] args) 
    {
		Scanner sc=new Scanner(System.in);
        int X=sc.nextInt();
        int Y=sc.nextInt();
        // Check if Chef's votes are at least double the votes of Chefu
        if (X>=2*Y) 
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
