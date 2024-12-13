import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) 
    {
		 Scanner sc=new Scanner(System.in);
        int A1=sc.nextInt();
        int A2=sc.nextInt();
        int B1=sc.nextInt();
        int B2=sc.nextInt();
        int C1=sc.nextInt();
        int C2=sc.nextInt();
        // Calculate the best score for each round
        int bestRound1=Math.max(A1,A2);
        int bestRound2=Math.max(B1,B2);
        int bestRound3=Math.max(C1,C2);
        // Calculate the total score
        int totalScore=bestRound1+bestRound2+bestRound3;
        System.out.println(totalScore);
        sc.close();
	}
}
