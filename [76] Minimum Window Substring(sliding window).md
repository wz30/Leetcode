/*
 * @lc app=leetcode id=76 lang=java
 *
 * [76] Minimum Window Substring
 *
 * https://leetcode.com/problems/minimum-window-substring/description/
 *
 * algorithms
 * Hard (29.98%)
 * Total Accepted:    215.6K
 * Total Submissions: 719.1K
 * Testcase Example:  '"ADOBECODEBANC"\n"ABC"'
 *
 * Given a string S and a string T, find the minimum window in S which will
 * contain all the characters in T in complexity O(n).
 * 
 * Example:
 * 
 * 
 * Input: S = "ADOBECODEBANC", T = "ABC"
 * Output: "BANC"
 * 
 * 
 * Note:
 * 
 * 
 * If there is no such window in S that covers all characters in T, return the
 * empty string "".
 * If there is such window, you are guaranteed that there will always be only
 * one unique minimum window in S.
 * 
 */
class Solution {
    public String minWindow(String s, String t) {
        //originallly, methos is fussy
        int l1 = s.length();
        int l2 = t.length();
        int[] map = new int[256];

        for(int i = 0; i < l2; i++){
            map[t.charAt(i)]++;
        }
        //tracking the head and distance(d)
        int end = 0; int start = 0; int d = Integer.MAX_VALUE; int len = l2; int head = 0;
        while(end < l1)
        {
            //in t 0,0,0,-1,-1, map value alwasy --, end always ++
            //only when in t, len-- 
            if(map[s.charAt(end)]-- > 0)
                len--;              
            end++;
            //match
            while(len==0){
                if(end - start < d) d = end-(head=start); //update the d
                if(map[s.charAt(start)]++ == 0)//make it invalid
                    len++;
                start++;
            }
        }
        return d==Integer.MAX_VALUE ? "" : s.substring(head, head+d);

    }
}

//Solution: sliding window version
//reference https://leetcode.com/problems/minimum-window-substring/discuss/26808/here-is-a-10-line-template-that-can-solve-most-substring-problems

//follow up question:
//https://leetcode.com/problems/find-all-anagrams-in-a-string/discuss/92007/Sliding-Window-algorithm-template-to-solve-all-the-Leetcode-substring-search-problem

## Solution 2
- hahsmap + sliding window based on f* algorithm idea
- equals to compare the object
- when to move left pointer -> when we map1 have everthing in map2 (key and vlaue are all equal)
- how to implment map1 contains map2 -> we use variable match to track the number of same key-vlaues 
```java
class Solution {
    public String minWindow(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();
        if(len1 < len2) return "";
        int i = 0, j = 0;
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for(Character c : t.toCharArray()){
            map2.put(c, map2.getOrDefault(c, 0)+1);
        }
        //System.out.println(map2.size());
        int min = Integer.MAX_VALUE;
        int match = 0;
        String res = "";
        while(j<len1){
            char cur = s.charAt(j++);
            
            map1.put(cur, map1.getOrDefault(cur, 0)+1);
            if(map1.get(cur).equals(map2.get(cur))) match++;
            //if there map1 has everything in map2(need key and value match)
            // if(match==10)
            //     System.out.println(match);
            while(match==map2.size()){
                //min = Math.min(min, j-i);
                if(min>(j-i)){
                    //System.out.println(min);
                    min = Math.min(min, j-i);
                    res = s.substring(i,j);
                }
                char temp = s.charAt(i);
                map1.put(temp, map1.get(temp)-1);
                //if(map2.containsKey(temp)) match--;
                if(map2.containsKey(temp)){
                    if(map1.get(temp)<map2.get(temp)) match--;
                }
                
                
                if(map1.get(temp)==0) {
                    map1.remove(temp);
                }
                i++;
            }
            
        }
        //System.out.println(min);
        return res;
    }
}
```

