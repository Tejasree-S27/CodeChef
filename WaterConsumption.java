import java.util.*;
import java.lang.*;
import java.io.*;
class WaterConsumption
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int i = 0;
        while (i < T) 
        {
            int X = sc.nextInt();
            // Check if Chef drank at least 2000 ml of water
            if (X >= 2000) 
            {
                System.out.println("YES"); 
                } 
                else 
                {
                System.out.println("NO");  
            }
            
            i++;
        }
        sc.close();
	}
}
