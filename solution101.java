package mayur;


	import java.io.*;

	public class solution101 {
		public static void main(String[] args)
		{
			int b = 27;
			int a = 3;
			
			double p = Math.log10(b)/ Math.log10(a);
			
			if (p - (int)p == 0) {
				System.out.println("true");
			}
			else
				System.out.println("false");
		}
	}

