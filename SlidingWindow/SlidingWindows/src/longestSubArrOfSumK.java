import java.util.HashMap;

public class longestSubArrOfSumK {

    public static void main(String[] args) {
        int arr[]={10, 5, 2, 7, 1, 9};
        int k=15;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int sum=0;
        int maxLen=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];

            if(map.containsKey(sum-k)){
                maxLen=Math.max(maxLen,i-map.get(sum-k));

            }

            if(!map.containsKey(sum-k)){
                map.put(sum,i);
            }
        }

        System.out.println(maxLen);
    }
}
