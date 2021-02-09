package HackerRank;

import java.util.Scanner;

public class Ecryption {
	
	static String encryption(String s) 
	{
		String ans = "" ;
		
		int L = s.length() ;
		
		int floor = (int)Math.floor(Math.sqrt(L)) ;
		int ceil = (int)Math.ceil(Math.sqrt(L)) ;
		
		int area = floor*ceil;
		
		if(area<L)
		{
			floor++ ;
		}
		
		int row = floor ;
		int col = ceil ;
		
//		char arr[][] = new char[row][col];
//		
//		int tt = 0 ;
		
//		for(int i=0 ; i<row ; i++)
//		{
//			for(int j=0 ; j<col ; j++)
//			{
//				if(tt>=L)
//				{
//					arr[i][j] = '*' ;
//				}else
//				{
//					arr[i][j] = s.charAt(tt);
//					tt++ ;
//				}
//			}
//		}
		
//		for(int i=0 ; i<row ; i++)
//		{
//			for(int j=0 ; j<col ; j++)
//			{
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
//		
//		
//		
		for(int i=0 ; i<col ; i++)
		{
			int j = i ;
			while(j<L)
			{
				ans += s.charAt(j);
				j += col ;
			}
			ans += " " ;
		}
		
		return ans ;
		
    }

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine().replaceAll("\\s", "") ;
		System.out.println(encryption(s));
	}

}
