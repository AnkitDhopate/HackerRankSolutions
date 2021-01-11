package HackerRank;

import java.util.Scanner;

public class RepeatedString {
	
	static long repeatedString(String s, long n)
	{
		long aOriginalCount = 0 ;
		long aTotalCount = 0 ;
		
		for(int i=0 ; i<s.length() ; i++)
		{
			if(s.charAt(i) == 'a')
			{
				aOriginalCount += 1 ;
			}
		}
		
//		System.out.println("aOriginalCount = " + aOriginalCount);
		
		if(n<s.length())
		{
			for(int i=0 ; i<n ; i++)
			{
				if(s.charAt(i) == 'a')
				{
					aTotalCount += 1 ;
				}
			}
		}else
		{
			long quotient = n/s.length() ;
			long remainder = n%s.length() ;
			int lastStringACount = 0;
			
//			System.out.println("quotient = " + quotient);
//			System.out.println("remainder = " + remainder);
//			System.out.println("quotient + remainder = " + (remainder+quotient));
			
			for(int i=0 ; i<remainder ; i++)
			{
				if(s.charAt(i) == 'a')
				{
					lastStringACount++ ;
				}
			}
			
			aTotalCount = (quotient * aOriginalCount) + lastStringACount ;
		}
		
		return aTotalCount ;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
//		sc.nextLine();
		long n = sc.nextLong();
		
		System.out.println(repeatedString(s, n));
	}

}
