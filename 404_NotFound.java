import java.util.*;
import java.lang.*;
import java.io.*;
class 404_NotFound
{
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
        int X=sc.nextInt();
        if (X==404) 
        {
            System.out.println("NOT FOUND");
        } 
        else 
        {
            System.out.println("FOUND");
        }
        sc.close();

	}
}
