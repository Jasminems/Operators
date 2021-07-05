/*A Java program to perform Arithmetic Operators*/ 
class Oper 
{
	static void add(int a,int b)	
	{
		System.out.println("Addition:"+(a+b));
	}
	static void sub(int a,int b)	
	{
		System.out.println("Subtraction:"+(a-b));
	}
	static void mul(int a,int b)	
	{
		System.out.println("Multiplication:"+(a*b));
	}
	static void div(int a,int b)	
	{
		System.out.println("Division:"+(a/b));
	}
	public static void main(String[] args) 
	{
		add(10,20);
		sub(20,10);
		mul(10,5);
		div(10,2);
	}
}
