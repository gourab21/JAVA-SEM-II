
class exceptiondemo 
{
public static void test(int x)throws underage
{
 if(x<18)
 throw new underage(x);
 else
 System.out.println("Person is not underage");
}
public static void main(String args[])
{
 underage obj=new underage(16);
 underage obj1=new underage(19);
int y=obj.x;
 try
{
 test(y);
 }
 catch(underage e)
 {
 System.out.println(e.getMessage());
 }
 int z=obj1.x;
 try
 {
 test(z);
 }
 catch(underage e)
 {
 System.out.println(e.getMessage());
 }
}
}