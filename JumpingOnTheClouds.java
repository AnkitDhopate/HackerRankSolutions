package HackerRank;

import java.util.Scanner;

public class JumpingOnTheClouds {
	
	static int jumpingOnClouds(int[] arr) 
	{
		int steps = 0 ;
		int currPos = 0 ;
		
		while(currPos < arr.length)
		{
			if((currPos+2) == arr.length-1 || (currPos+1) == arr.length-1)
			{
				steps += 1 ;
				break ;
			}else if(arr[currPos+2] == 0 && (currPos+2)<arr.length)
			{
				steps += 1 ;
				currPos += 2 ;
			}else if(arr[currPos+1] == 0 && (currPos+1)<arr.length)
			{
				steps += 1 ;
				currPos += 1 ;
			}
		}
		
		return steps ;
    }

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0 ; i<n ; i++) 
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println(jumpingOnClouds(arr));
	}

}
