import java.util.*;
import java.lang.*;
import java.io.*;
class ChefPlaysLudo
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        // Process each test case
        for (int i = 0; i < T; i++) 
        {
            int X = sc.nextInt();
            // Check if Chef rolled a 6
            if (X == 6)
            {
                System.out.println("YES");
            } 
            else 
            {
                System.out.println("NO");
            }
        }
        sc.close();
	}
}
