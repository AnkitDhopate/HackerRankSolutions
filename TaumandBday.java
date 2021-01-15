package HackerRank;

import java.util.Scanner;

class Result 
{
    public static long taumBday(long b, long w, long bc, long wc, long z) 
    {
    	long ans = 0 ;
    	
    	if(bc < wc)
    	{
    		ans += bc*b ;
    				
    		if(bc+z < wc)
    		{
    			ans += w * (bc+z) ;
    		}else
    		{
    			ans += w * wc ;
    		}
    	}else if(bc > wc)
    	{
    		ans += wc*w ;
			
    		if(wc+z < bc)
    		{
    			ans += b * (wc+z) ;
    		}else
    		{
    			ans += b * bc ;
    		}
    	}else
    	{
    		ans += (b * bc) + (w * wc) ;
    	}
    	    	
    	return ans ;
    }

}

public class TaumandBday 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt() ;
		
		while(test>0)
		{
			long b = sc.nextInt();
			long w = sc.nextInt();
			long bc = sc.nextInt();
			long wc = sc.nextInt();
			long z = sc.nextInt();
			
			System.out.println(Result.taumBday(b, w, bc, wc, z));
			
			test-- ;
		}
	}
}
