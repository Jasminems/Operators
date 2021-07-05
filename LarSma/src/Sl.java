/*A Java program to find Largest and Smallest Number*/
import java.util.Scanner;
public class Sl 
{
	public static void main(String[] args) 
	{
		int s=0,l=0,n;
		System.out.println("Enter the Number of values:");
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		n=input.nextInt();
		s=n;
		for(int i=1;i<num;i++)
		{
			n=input.nextInt();
			if(n>l)
			{
				l=n;
			}
			if(n<s)
			{
				s=n;
			}
		}
		System.out.println("Largest Number is:"+l);
		System.out.println("Smallest Number is:"+s);
		}
}