import java.util.Scanner;

/**
 * 
 * @author Himakshi
 * 
 */
public class Calculator implements CalciFunction
{
	int a,b;
	double c;
	public void addition(int a,int b)
	{
		System.out.println(""+(a+b));
	}
	public void subtract(int a,int b)
	{
		System.out.println(""+(a-b));
	}
	public void multi(int a,int b)
	{
		System.out.println(""+(a*b));
	}
	public void division(int a,int b)
	{
		try{
		System.out.println(""+(a/b));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void maxNum(int a,int b)
	{
		System.out.println(""+((a>b)?a:b));
	}
	public void minNum(int a,int b)
	{
		System.out.println(""+((a<b)?a:b));
	}
	public void sin(double a)
	{
		System.out.println(""+Math.sin(a));
	}
	public void cos(double a)
	{
		System.out.println(""+Math.cos(a));
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Calculator obj=new Calculator();
		while(true)
		{
			System.out.println("\nEnter Your Choice: 1.Addition 2.Subtract 3.Multiply 4.Division 5.Find Maximum 6.Find Minimum 7.Sine 8.Cosine 9.Exit");
			int n=sc.nextInt();
			if(n<7)
			{
				System.out.println("Enter two numbers");
				obj.a=sc.nextInt();
				obj.b=sc.nextInt();
			}
			else if(n==7 || n==8)
			{
				System.out.println("Enter a number");
				obj.c=sc.nextDouble();
			}
			switch(n)
			{
				case 1:
					obj.addition(obj.a,obj.b);
					break;
				case 2:
					obj.subtract(obj.a,obj.b);
					break;
				case 3:
					obj.multi(obj.a, obj.b);
					break;
				case 4:
					obj.division(obj.a, obj.b);
					break;
				case 5:
					obj.maxNum(obj.a, obj.b);
					break;
				case 6:
					obj.minNum(obj.a, obj.b);
					break;
				case 7:
					obj.sin(obj.c);
					break;
				case 8:
					obj.cos(obj.c);
					break;
				case 9:
					sc.close();
					System.exit(1);
			}
		}
	}
}
