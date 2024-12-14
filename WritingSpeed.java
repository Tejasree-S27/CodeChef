import java.util.*;
import java.lang.*;
import java.io.*;
class WritingSpeed
{
	public static void main (String[] args) 
	{
	Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        //the total time to write 5 pages
        int totalTime = 5 * X;
        // Check if the total time is within the 60-minute limit
        if (totalTime <= 60) 
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
