import java.util.*;
import java.lang.*;
import java.io.*;
class CalorieIntake
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
        int X=sc.nextInt(); 
        int Y=sc.nextInt(); 
        int Z=sc.nextInt(); 
        
        // Calculate the total calories Chef has already eaten
        int totalCalories=Y*Z;
        if (totalCalories>X) 
        {
            System.out.println(-1);
        } 
        else 
        {
            // Calculate remaining calories Chef can eat
            System.out.println(X-totalCalories);
        }
        sc.close();
	}
}
