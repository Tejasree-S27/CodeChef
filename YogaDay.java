import java.util.*;
import java.lang.*;
import java.io.*;
class YogaDay
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        // Read the total number of yoga poses 
        int N = sc.nextInt();
        // Calculate the number of complete rounds of Surya Namaskar
        int rounds = N / 12;
        System.out.println(rounds);
        sc.close();
	}
}
