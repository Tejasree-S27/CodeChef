import java.util.*;
import java.lang.*;
import java.io.*;
class FoodCost
{
	public static void main (String[] args)
	{
		 Scanner sc=new Scanner(System.in);
         int x=sc.nextInt();
         int y=sc.nextInt();
         int totalcost=(6*x)+y;
         System.out.println(totalcost);
         sc.close();
	}
}
