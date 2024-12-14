import java.util.*;
import java.lang.*;
import java.io.*;
class OffByOne
{
	public static void main (String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        // Compute the sum of A and B
        int sum = A + B;
        // Append 1 to the sum 
        System.out.println(sum + "1");
        sc.close();
	}
}
