import java.util.*;
class DiwaliDiscount
{
	 public static void main(String[] args) 
	 {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); 
        int B = sc.nextInt(); 
        if (B >= A) 
        {
            System.out.println(0); 
        }
        else
        {
            System.out.println(A - B); 
        }
        sc.close();
	}
}
