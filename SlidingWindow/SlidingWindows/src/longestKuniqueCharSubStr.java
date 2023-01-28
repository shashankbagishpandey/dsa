import java.util.HashMap;

public class longestKuniqueCharSubStr {
    public static void main(String[] args) {
        System.out.println(longestkSubstr("aabacbebebe",3));


    }

    public static int longestkSubstr(String s, int k) {
        // code here

        HashMap<Character,Integer> map=new HashMap<>();

        int i=0,j=0;
        int maxLen=-1;
        int cnt=0;
        while(j<s.length()){
            char ch=s.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);

            if(map.size()<k){
                j++;
            }else if(map.size()==k){
                maxLen=Math.max(maxLen,j-i+1);
                j++;
            }
            else if(map.size()>k){
                while(map.size()>k){
                    char ch2=s.charAt(i);
                    if(map.containsKey(ch2) && map.get(ch2)>1){
                        map.put(ch2,map.get(ch2)-1);

                    }else if(map.containsKey(ch2) && map.get(ch2)==1){
                        map.remove(ch2);

                    }

                    i++;
                }

                j++;
            }


        }
        return maxLen;
    }
}
