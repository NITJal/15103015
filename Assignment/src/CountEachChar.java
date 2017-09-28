import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.util.StringTokenizer;
public class CountEachChar 
{
			public static void main(String args[])throws IOException
			{
				InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(isr);
				System.out.println("Enter The String:");
				String str = br.readLine();
				int ar[]=new int[256];
				for(int i=0; i<str.length(); i++)
				{
					ar[str.charAt(i)]++;
				}
				for(int i=0; i<str.length(); i++)
				{
					if(ar[str.charAt(i)]!=0)
						System.out.println(str.charAt(i)+"="+ar[str.charAt(i)]);
					ar[str.charAt(i)]=0;
				}
			}
}
