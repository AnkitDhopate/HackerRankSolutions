package HackerRank;

import java.util.*;

public class ModifiedKaprekarNumbers {
	
	static void kaprekarNumbers(int p, int q) 
	{
		ArrayList<Long> list = new ArrayList<>() ;
		for(long i=p ; i<=q ; i++)
		{
			int d = Long.toString(i).length() ;
			String sqr = Long.toString(i*i) ;
			
			String l, r ;
			
			if(sqr.length()-d != 0)
			{
				l = sqr.substring(0, sqr.length()-d) ;
				r = sqr.substring(sqr.length()-d) ;
			}else
			{
				l = "0" ;
				r = sqr.substring(sqr.length()-d) ;
			}
			
//			System.out.println(l + " + " + r + " = " +  (Integer.parseInt(l) + Integer.parseInt(r)));
			
			if((Integer.parseInt(l) + Integer.parseInt(r)) == i)
			{
				list.add(i) ;
			}
			
		}
		
		if(list.isEmpty())
		{
			System.out.println("INVALID RANGE");
		}else
		{
			for(int z=0 ; z<list.size() ; z++)
			{
				System.out.print(list.get(z) + " ");
			}
		}
		
    }

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int q = sc.nextInt();
		kaprekarNumbers(p, q);
	}

}
