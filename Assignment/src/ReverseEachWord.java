import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class ReverseEachWord
{
		public static void main(String args[])throws IOException
		{
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			System.out.println("Enter The String:");
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str," ");
			while(st.hasMoreTokens())
			{
				String s=st.nextToken().toString();
				StringBuffer sb= new StringBuffer(s);
				System.out.print( sb.reverse()+" ");
			}
		}
}
