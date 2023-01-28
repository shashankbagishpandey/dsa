

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int arr[]={1,9,3,4,5,16};
        int i=0;
        int j=0;
        int sum=0;
        int k=3;
        int max=Integer.MIN_VALUE;
        while(j < arr.length){
            sum+=arr[j];
            if((j-i+1)==k){
                max=Math.max(max,sum);
                sum-=arr[i];
                i++;
                j++;
            }else if ((j-i+1)<k){
                j++;
            }
        }

        System.out.println(max);
    }
}