import java.util.*;
import java.lang.*;
import java.io.*;
class SweetShop
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        int X = sc.nextInt(); 
        int N = sc.nextInt(); 
        // Calculate the total cost of laddus
        int ladduCost = 10;
        int totalcost= N * ladduCost;
        // Remaining money after buying the laddus
        int remainingMoney = X - totalcost;
        int jalebiCost = 20;
        int numberOfJalebis = remainingMoney / jalebiCost;
        System.out.println(numberOfJalebis);
      // Close the scanner
        sc.close();
	}
}
