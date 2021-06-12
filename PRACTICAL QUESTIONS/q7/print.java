import java.io.*;   
import java.util.Scanner;   
public class print {    

public static void main(String args[]){      
        
try(InputStream input = new FileInputStream("file.txt"))
{      
	Scanner sc=new Scanner(input);
	String s;
	while(sc.hasNextLine())  
	{  
		s=sc.nextLine();
		if (s.charAt(0)=='/' & s.charAt(1)=='/')
		{	System.out.println(s);}      
	}  
	sc.close(); 
}
catch(Exception exception)
{  
       System.out.println(exception);  
}      
}      
}    