import java.util.*;

class ChristmasCake
{
	public static void main (String[] args) 
	{
	     Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        // Calculate the number of practice cakes Chef will bake
        int numberOfCakes = 24 - X + 1;
        System.out.println(numberOfCakes);
        sc.close();
	}
}