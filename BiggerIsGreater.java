package HackerRank;
import java.util.Scanner;

/*Link to find the Next lexicographical permutation*/
//https://www.nayuki.io/page/next-lexicographical-permutation-algorithm

public class BiggerIsGreater {
	
	static String biggerIsGreater(String w) 
	{
		char arr[] = w.toCharArray() ;
		
		int i = w.length()-1 ;
		
		while(i>0 && arr[i-1] >= arr[i])
		{
			i-- ;
		}
		
		if (i<=0) return "no answer" ;
		
		int j = w.length()-1 ;
		
		while(arr[j] <= arr[i-1])
		{
			j-- ;
		}
		
		char temp = arr[i-1] ;
		arr[i-1] = arr[j] ;
		arr[j] = temp ;
		
		// Reversig the suffix
		j = w.length()-1 ;
		
		while(i<j)
		{
			temp = arr[i] ;
			arr[i] = arr[j] ;
			arr[j] = temp ;
			i++ ;
			j-- ;
		}
		
		String ans = new String(arr) ;
		return ans ;
    }

	public static void main(String[] args) 
	{
		Scanner sc=  new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		
		while(T>0)
		{
			String w = sc.nextLine();
			System.out.println(biggerIsGreater(w));
			
			T-- ;
		}
	}

}
