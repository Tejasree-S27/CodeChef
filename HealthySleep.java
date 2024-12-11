import java.util.*;
import java.lang.*;
import java.io.*;
class HealthySleep
{
    public static void main (String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int H=sc.nextInt();
        // Check the number of hours 
        if (H<8) 
        {
            System.out.println("LESS");
        } 
        else if (H==8) 
        {
            System.out.println("PERFECT");
        } 
        else 
        {
            System.out.println("MORE");
        }
        sc.close();
    }
}

