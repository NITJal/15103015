import java.io.*;
public class CircularString 
{
	public static void main(String args[])throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter The String:");
		String str = br.readLine();
		for(int i=0; i<str.length(); i++)
		{
			System.out.println(""+str.substring(i+1)+str.substring(0,i+1));
		}
	}
}
