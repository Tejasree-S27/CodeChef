import java.util.*;
import java.lang.*;
import java.io.*;
class InternationalJusticeDay
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        // Determine if the accused is convicted
        if (X >= Y)
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
