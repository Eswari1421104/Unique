

import java.io.*;
import java.util.*;
public class RevseStr
{
  public static void main(String args[]) 
  {int i;
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      String word[]=new String[n];
      for(i=0;i<n;i++)
      {
          word[i]=s.next();
      }
      for(i=n-1;i>=0;i--)
      {
          System.out.print(" "+word[i]);
      }
  }
}
