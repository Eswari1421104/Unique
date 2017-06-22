import java.io.*;
import java.util.*;
public class Unique
{
    public static void main(String args[])
    {int i,t=0;
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
          a[i]=s.nextInt();
          t=t^a[i];
        }
        System.out.println(t);
    }
}
