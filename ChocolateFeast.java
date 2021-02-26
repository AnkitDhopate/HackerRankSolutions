package HackerRank;

import java.util.Scanner;

public class ChocolateFeast {
	
	static int chocolateFeast(int n, int c, int m) 
	{
		int temp=n/c,totalChoco=0,wrapper=0;
		
	    while(temp>0){
	    	
	    	totalChoco+=temp;
	    	wrapper+=temp;
	        temp=wrapper/m;
	        wrapper=wrapper%m;
	        
	    }
	    return totalChoco;
		
    }

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		
		while(t>0)
		{
			int n = sc.nextInt();
			int c = sc.nextInt();
			int m = sc.nextInt();
			System.out.println(chocolateFeast(n, c, m));
			t-- ;
		}
	}

}
