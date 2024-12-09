import java.util.*;
import java.lang.*;
import java.io.*;
class DevouringDonuts
{
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        // Calculate the total calories consumed by Chef
        int totalCalories=X*Y;
        // print the total calories
        System.out.println(totalCalories);
	}
}
