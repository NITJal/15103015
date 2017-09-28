import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
public class WordEditor
{
			public static void main(String args[])throws IOException
			{
				InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(isr);
				System.out.println("Enter The String:");
				String str = br.readLine();
				StringTokenizer st=new StringTokenizer(str," ");
				HashMap<String, Integer> h=new HashMap<>();
				String ar[]= new String[st.countTokens()];
				int i=0;
				while(st.hasMoreTokens())
				{
					String s=st.nextToken().toString();
					ar[i]=s;
					i++;
				}
				for(String w:ar)
				{
					Integer n =h.get(w);
					n= (n==null)? 1 : ++n;
					h.put(w, n);
				}
				for(Map.Entry m : h.entrySet())
				{
					System.out.println(m.getKey()+" "+m.getValue());
				}
			}
}
