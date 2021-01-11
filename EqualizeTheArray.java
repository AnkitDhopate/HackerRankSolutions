package HackerRank;

import java.util.Scanner;

public class EqualizeTheArray {
	
	static int equalizeArray(int[] arr) 
    {
        int indiCount[] = new int[101];
        int maxElementsCount = Integer.MIN_VALUE ;
        int maxElement = 0 ;
        int deletionCount = 0 ;
        
        for(int i=0 ; i<arr.length ; i++)
        {
        	indiCount[arr[i]] += 1 ; 
        }
        
        for(int i=0 ; i<indiCount.length ; i++)
        {
        	if(indiCount[i]>maxElementsCount)
        	{
        		maxElementsCount = indiCount[i] ;
        		maxElement = i ;
        	}
        }
        
        for(int i=0 ; i<indiCount.length ; i++)
        {
        	if(i != maxElement)
        	{
        		deletionCount += indiCount[i] ;
        	}
        }
        
        return deletionCount ;
    }

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0 ; i<n ; i++)
		{
			arr[i] = sc.nextInt() ;
		}
		System.out.println(equalizeArray(arr));
	}

}
