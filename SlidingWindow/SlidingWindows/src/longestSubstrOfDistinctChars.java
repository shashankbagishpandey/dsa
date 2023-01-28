import java.util.HashMap;

public class longestSubstrOfDistinctChars {
    public static void main(String[] args) {
        int ans=longestSubstrDistinctChars("geeksforgeeks");
        System.out.println(ans);
    }
        static int longestSubstrDistinctChars(String S){


            HashMap<Character,Integer> map=new HashMap<>();
            int i=0,j=0;
            int len=0;
            while(j<S.length()){
                char ch=S.charAt(j);
                map.put(ch,map.getOrDefault(ch,0)+1);

                if(map.size()==j-i+1){
                    len=Math.max(len,j-i+1);
                }
                else if(map.size()<j-i+1){

                    while(map.size()<j-i+1){
                        char ch2=S.charAt(i);
                        if(map.containsKey(ch2) && map.get(ch2)>1){
                            map.put(ch2,map.get(ch2)-1);
                        }else if(map.containsKey(ch2) && map.get(ch2)==1)
                        {
                            map.remove(ch2);
                        }
                        i++;
                    }

                }

                j++;

            }

            return len;

        }

}
