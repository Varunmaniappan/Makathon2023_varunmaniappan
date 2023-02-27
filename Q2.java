package MH;
import java.util.*;

public class Math1 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of testcases");
		int T = sc.nextInt();
		while(T-->0)
		{
			double N = sc.nextInt();
			double K =	Math.pow(2,N)-Math.pow(2,N-1);	
			System.out.println(K);
					}
	}

}

