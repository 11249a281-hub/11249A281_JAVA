

import java.io.*;
import java.util.*;
class largest
{
public static void main(String args[])
{
int a,b,c;
Scanner s= new Scanner(System.in);
System.out.println("Enter the first number");
a=s.nextInt();
System.out.println("Enter the second number");
b=s.nextInt();
if(a>b)
{
System.out.println("largest number is:"+ a);
}
else
System.out.println("largest number is:"+ b);
}
}