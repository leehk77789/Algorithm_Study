
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.util.StringTokenizer;

	public class _10158 {
		
		public static void main(String[] args) throws IOException	  {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String str = br.readLine();
			StringTokenizer stk=new StringTokenizer(str);
			int w=Integer.parseInt(stk.nextToken());
			int h=Integer.parseInt(stk.nextToken());
			str=br.readLine();
			stk= new StringTokenizer(str);
			int p=Integer.parseInt(stk.nextToken());
			int q=Integer.parseInt(stk.nextToken());
			int t=Integer.parseInt(br.readLine());
		
			int x=(p+t)%(2*w);
			int y=(q+t)%(2*h);
					if (x > w) {
						x=2*w-x;
					}
					if(y>h) {
						y=2*h-y;					
					}
				StringBuilder sb = new StringBuilder();
				sb.append(x).append(" ").append(y);
				
				System.out.println(sb);
	        br.close();		
		}
	}


