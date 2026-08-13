import java.io.*;
import java.util.*;
class prime
{
public static void main(String args[])
{
int n,i,c = 0;
Scanner s = new Scanner(System.in);
System.out.println("Enter a number:");
n = s.nextInt();
for (i = 1;i <= n;i++)
{
if(n%i==0)
{
c++;
}
}
if(c==2)
{
System.out.println("prime");
}
else
{
System.out.println("not prime");
}
}
}