import java.util.*;


public class first
{
	public static void main(String gd[])
	{
	Complex A = new Complex(4, 1);  
        A.print();

        Complex B = new Complex(3, 6);
        B.print();
  

        Complex C = new Complex();
  	C = C.add_complex(A,B);
  	System.out.print("Sum of them are :");
        C.print();
  

        C = C.multiply_complex(A,B);
        System.out.print("Product of them are :");
        C.print();
	}
}


class Complex
{
	double Real;
	double Imaginary;
	Complex()
 	{}

  	Complex(double r,double i)
    	{        Real = r;
        Imaginary = i;}

	Complex add_complex(Complex a, Complex b)
	{	
	Complex Temp = new Complex();
	Temp.Real = a.Real + b.Real;
	Temp.Imaginary = a.Imaginary + b.Imaginary;
	return Temp;
	}

	Complex multiply_complex(Complex a, Complex b )
	{	
	Complex Temp = new Complex();
	Temp.Real = a.Real * b.Real - a.Imaginary * b.Imaginary;
	Temp.Imaginary = a.Real * b.Real + a.Imaginary * b.Imaginary;
	return Temp;
	}

	void print()
	{	
		System.out.println(Real+" + "+Imaginary+" i ");}
}	

































































































