package HackerRank;
import java.util.*;

public class NonDivisibleSubSet
{ 
	static int nonDivisibleSubset(int k, int arr[])
	{
		int maxSize = 0 ;
		
		int modulusVal [] = new int[arr.length];
		
		/*
		 * Now we will keep a track of all the modulus values of the elements
		 * in the array */
		for(int i=0 ; i<arr.length ; i++)
		{
			modulusVal[arr[i]%k] += 1;
		}
		
		/*
		 * Now keep in mind three cases
		 * 1. The modulus value 0 : If such values exists then increase the count by only 1 irrespective of the count
		 * 2. If the addition of the values at any position and modulus of that with k is also zero, then increase again the value by only one 
		 * 3. Take the max value from the two compliments of the modulus so as to get max set size */
		
		if(modulusVal[0]>0)
		{
			maxSize ++ ;
		}
		
		for(int i=1 ; i<k ; i++)
		{
			if(modulusVal[i] != 0)
			{
				if(i + i == k)
				{
					maxSize++ ;
				}else
				{
					maxSize += Integer.max(modulusVal[i], modulusVal[k-i]); // Max from value and its complement
					modulusVal[i] = 0 ;  // Clearing the place so that it dosn't count in next iterations
					modulusVal[k-i] = 0 ; // Clearing the place so that it dosn't count in nxt iterations
				}
			}
		}
		
		return maxSize;
 	}
	
	public static void main(String args[])
	{ 
		/*
		System.out.println(( 8 + 2 ) % 4);
		System.out.println((( 8 % 4 ) + ( 2 % 4 )) % 4);
		*/
		Scanner sc = new Scanner(System.in) ;
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int arr[] = new int[n];
		for(int i=0 ; i<n ; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println(nonDivisibleSubset(k, arr));
	}
} 