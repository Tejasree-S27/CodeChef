import java.util.*;
import java.lang.*;
import java.io.*;
class AC_Please
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        // Check if the temperature is greater than 30
        if (T > 30) 
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
