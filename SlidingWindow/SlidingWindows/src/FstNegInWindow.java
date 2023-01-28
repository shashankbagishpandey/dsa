import java.util.ArrayList;
import java.util.Scanner;

public class FstNegInWindow {
    public static void main(String[] args) {
        int arr[]={-1,-7,8,-15,20,13,36,-9,8};

        int k=3;

        FirstNegative(arr,k);

    }

    private static void FirstNegative(int[] arr, int k) {

        ArrayList<Integer> list=new ArrayList<>();
        int i=0,j=0;
        while(j<arr.length){
            if(arr[j]<0){
                list.add(arr[j]);
            }

            if(j-i+1<k){
                j++;

            }else{
                if(j-i+1==k){
                    if(list.size()>0){
                        System.out.println(list.get(0));
                    }else {
                        System.out.println("0");
                    }

                    if(list.contains(arr[i])){
                        list.remove(0);
                    }

                    i++;
                    j++;
                }
            }
        }

    }
}
