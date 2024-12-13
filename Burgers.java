import java.util.*;
import java.lang.*;
import java.io.*;
class Burgers
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        // Process each test case
        for (int i = 0; i < T; i++) 
        {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(Math.min(A, B));
        }
        sc.close();

	}
}
