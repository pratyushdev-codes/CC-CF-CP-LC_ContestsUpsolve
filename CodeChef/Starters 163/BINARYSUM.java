import java.util.*;
import java.lang.*;
import java.io.*;

class BINARYSUM
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    if((n+1)/2==k || n/2==k){
		       System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		}

	}
}
