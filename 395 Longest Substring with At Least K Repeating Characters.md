## Question
```java
Find the length of the longest substring T of a given string (consists of lowercase letters only) such that every character in T appears no less than k times.

Example 1:

Input:
s = "aaabb", k = 3

Output:
3

The longest substring is "aaa", as 'a' is repeated 3 times.
Example 2:

Input:
s = "ababbc", k = 2

Output:
5

The longest substring is "ababb", as 'a' is repeated 2 times and 'b' is repeated 3 times.
```

## solution: divide and conquer
- check each substring when map[c] < k since that is the break point
```java
class Solution {
    //very important here
    // divide conquer -- when to recursively call the method: map[c] < k (we try the substring to chekc the longest substring)
    public int longestSubstring(String s, int k) {
        //break condition, when to return the resiult
        if(s.length()<k) return 0;
        //check if the string valid
        
        int flag = 0;
        int[] map = new int[129];
        for(int i = 0; i<s.length(); i++){
            map[s.charAt(i)]++;
            if(map[s.charAt(i)]==1) flag++;
            if(map[s.charAt(i)]==k) flag--;
        }
        if(flag==0) return s.length();
        int res = 0;
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(map[c]<k){
                //System.out.println(builder.toString());
                
                res = Math.max(longestSubstring(builder.toString(), k), res);
                //System.out.println(res);
                builder = new StringBuilder();
            }else{
                builder.append(c);
            }
        }
        //case bbaaa   cbd
        res = Math.max(longestSubstring(builder.toString(), k), res);
        
        return res;
    }
}
```
