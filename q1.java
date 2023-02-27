package MH;
import java.util.*;


public class Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of testcases");
		int T= sc.nextInt();// Number of test cases
		while(T-->0)
		{
		int K = sc.nextInt();// Getting input of the dimensions of the  matrix
		int H = sc.nextInt();
		int M= K*H-1;//The Minimum number of ways of cutting across the paper without overlapping
		             // the papers which were cut before
		//Reason: The combinations of cutting may vary but the total  of minimum number of cuts
		// is going to be the same irrespective of where we start.But since the paper cannot be 
		//overlapped the only way to cut is to cut once across the number of columns
		//then cut them across each row 
		//Thus the number of cuts across the paper will be H-1 and the number of cuts
		// of individual column will be (K-1)*H
		//thus H-1+(K-1)*H=K*H-1
		System.out.println(M);//The total number
		}
		
		
		
	

	}

}
