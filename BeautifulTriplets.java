package HackerRank;
import java.util.*;

public class BeautifulTriplets {

	static int beautifulTriplets(int d, int[] arr) 
	{
		int count=0 ;
		
		for(int i=0 ; i<arr.length-2 ; i++)
		{
			int tempCount = 0 ;
			int diffCount = d ;
			
//			System.out.print(arr[i] + " ");
			
			for(int j=i+1 ; j<arr.length ; j++)
			{
				if(arr[j]-arr[i] == diffCount)
				{
//					System.out.print(arr[j] + " ");
					tempCount += 1;
					diffCount += d ;
					
					if(tempCount==2)
					{
						count += 1 ;
						break ;
					}
				}
			}
//			System.out.println();
		}
		
		return count ;
    }
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		
		int arr[] = new int[n];
		for(int i=0 ; i<n ; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println(beautifulTriplets(d, arr));
	}

}
