package mayur;

	import java.util.*;

	public class solution102 {
		public static int removeAlternate(int n)
		{
			if (n == 1)
				return 1;

			if (n % 2 == 0)
				return 2
					* removeAlternate(n / 2)
					- 1;
			else
				return 2 *
					removeAlternate(((n - 1) / 2))
					+ 1;
		}
		public static void main(String[] args)
		{
			int n = 5;
			System.out.print(removeAlternate(n));
			n = 10;
			System.out.print("\n" + removeAlternate(n));
		}
	}
