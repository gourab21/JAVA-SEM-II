import java.io.*;
public class SumElements
{
public static void main(String args[])
{
int num,sum=0;
System.out.println("The Elements You have entered are - ");
for (int i=0; i<args.length;i++)
{
System.out.println(args[i]);
num=Integer.parseInt(args[i]);
sum=sum+num;
}
System.out.println("The Sum of the Numbers are - ");
System.out.println(sum);
}
}