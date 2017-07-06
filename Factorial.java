# set116
import java.io.*;
import java.util.*;
public class Factorial
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int fact=1,i=1;
    for(i=1;i<=n;i++)
    {
      fact=fact*i;
      }
      System.out.println(""+fact);
      }
      }
