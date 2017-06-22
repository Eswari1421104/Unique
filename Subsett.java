import java.io.*;
import java.util.*;
public class Subsett
{
    public static void main(String args[])
    {int i,j,count=0;
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int a[]=new int[n];
        int b[]=new int[m];
        for(i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(j=0;j<m;j++)
        {
            b[j]=s.nextInt();
        }
       
       
          for(i=0;i<n;i++)
              for(j=0;j<m;j++){
           if(a[i]==b[j])
           {
            count++;   
           }}
       
       if(count==n)
       {
           System.out.println("subset");
       }
       
    }}
