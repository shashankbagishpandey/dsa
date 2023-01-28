import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class maxOfSubArrayOfSizeK {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,-3,-2,3,2,6};
        int i=0;
        int j=0;
        int k=3;
        int max=Integer.MIN_VALUE;
        ArrayList<Integer> al=new ArrayList<>();

        Deque<Integer> Q=new LinkedList<>();
        while (j< arr.length){
            while(Q.size()>0 && Q.peek()<arr[j]){
                Q.removeLast();
            }
            Q.addLast(arr[j]);
            if(j-i+1<k){
                j++;
            } else if (j-i+1==k) {
                al.add(Q.peek());

                if(arr[i]==Q.peek()){
                    Q.removeFirst();
                }
                i++;
                j++;

            }

        }

        for (int a:al){
            System.out.println(a);
        }
    }
}

