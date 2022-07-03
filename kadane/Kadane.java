
import java.io.*;
class Kadane {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling maxSubarraySum() function
		    System.out.println(obj.maxSubarraySum(arr, n));
		}
	}
}



class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        int currsum=0;
        long res=Long.MIN_VALUE;
        for(int i=0;i<n;i++){
            
            currsum+=arr[i];
            res=Math.max(currsum,res);
            if(currsum<0){
                currsum=0;
            }
            
        }
        return res;
    }
    
}

//kadanes algo says that if sum is getting less than zero of any subarray then 
//it better to start with next value and leave previous 


//like ->{1,-2,1}
//here if we add 1+(-2) = sum is -1 ,after we add 1 to it we get  0 as max sum {1+(-2)+1}=0
//but when we leave previous sum to zero and add 3rd digit 1 we get 1 as sum
//so whenever we get sum value negative we make our sum zero and add next value to it 
