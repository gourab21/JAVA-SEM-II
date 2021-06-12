public class underage extends Exception
{
final public int x;
public underage(int x)
{
this.x=x;
}
public String getMessage()
{
 return "Person is underage as his age is "+x;
}
}