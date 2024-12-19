import java.util.*;

public class Fitness 
{
    public static void main(String[] args) 
    {
         Scanner sc=new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) 
        {
            int X = sc.nextInt();
            // Calculate the total kilometers Chef walks in a week
            int totalDistance = 2 * X * 5;
            System.out.println(totalDistance);
        }
        sc.close();
    }
}
