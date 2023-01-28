import java.util.HashMap;
import java.util.Map;

public class cntOccurenceAnagram {
    public static void main(String[] args) {
        String pat="forxxorfxxxfro";
        String txt="for";

        int anss=countOccOfAnagram(pat, txt);
        System.out.println(anss);
    }

    private static int countOccOfAnagram(String pat, String txt) {
        int i=0,j=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int k=0;k<txt.length();k++){
            map.put(txt.charAt(k), map.getOrDefault(txt.charAt(k),0)+1);
        }
        int ans=0;
        int count=0;

        int k=txt.length();
        while(j<pat.length()){
            char ch=pat.charAt(j);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);
                if(map.get(ch) >= 0){

                    count++;

                }
            }
            if(j-i+1<k){
                j++;
            }else if(j-i+1==k) {
                if(count==k){
                    ans++;
                }
                char ch2=pat.charAt(i);
                if(map.containsKey(ch2)){
                    if(map.get(ch2) >= 0){
                        count--;
                    }
                    map.put(ch2,map.get(ch2)+1);
                }
                i++;
                j++;

            }

        }

        return ans;
    }
}
