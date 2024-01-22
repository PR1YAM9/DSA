package leetcode;

import java.util.HashMap;
import java.util.Set;

public class Jewels_and_Stones {

	public static void main(String[] args) {
		System.out.println(numJewelsInStones("aA", "aAAbbbb"));

	}
	public static int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i =0;i<jewels.length();i++){
            map.put(jewels.charAt(i), 0);
        }

        for(int i =0;i<stones.length();i++){
            char s =  stones.charAt(i);
            if(map.containsKey(s)){
                map.put(s, map.get(s)+1);
            }
        }

        int count = 0;
        Set<Character> keys = map.keySet();
        for(char key : keys){
            count = count + map.get(key);
        }
        return count;
    }

}
