/*A Java program to perform Logical AND*/
class Land 
{
	public static void main(String[] args) 
	{
		int a=10, b=20, c=20, d=0;
		System.out.println("Var1:"+a);
		System.out.println("Var2:"+b);
		System.out.println("Var3:"+c);
		if((a<b)&&(b==c))
		{
			d=a+b+c;
			System.out.println("Sum is:"+d);
		}
		else
		{
			System.out.println("False condition");
		}

	}
}