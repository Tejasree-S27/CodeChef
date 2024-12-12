import java.util.*;
import java.lang.*;
import java.io.*;
class SavingTaxes
{
	public static void main (String[] args)
    {
		Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for (int i = 0; i < T; i++) 
        {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            // Calculate the minimum amount
            int investmentRequired = X - Y;
            System.out.println(investmentRequired);
        }
        sc.close();
	}
}
