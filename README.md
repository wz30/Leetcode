# Leetcode
The problem in leetcode in java version
## counter [since 3/31/2020]
- +5
## leetcode number
- 36 Valid Sudoku [incomplete].
- 247 Strobogrammatic Number II [recursion(return each layer), time complexity?].
- 248 Strobogrammatic Number III [recursion(though dp may make faster), time?].
- 1186 Maximum Subarray Sum with One Deletion [O(n), dp(memory:O(1)), similar to maxium subarry]
- 53 Maximum Subarray [O(n), dp(memory:O(1))]
- 523 Continuous Subarray Sum [O(n^2), 1d dp(memory:O(n))] 
  - <strong>Solution 1</strong>: sum[i, j] = dp[j] - dp[i]+arr[i] or 
  - <strong>Solution 2</strong>: if a%k = c; b%k=c then(a-b)%k = 0(present it in hashmap)
- 1208 Get Equal Substrings Within Budget [understand problem and sliding window O(n)]
- 1209 Remove All Adjacent Duplicates in String II [stack unsolved and no edit yet....]
- 348 Design Tic-Tac-Toe [check continous n in board or using two rwos?? O(n*n) -> O(n)]
- 295 Find Median from Data Stream [two heaps(priority queue) O(lgn) to add number || balanced bst]
- 871 Minimum Number of Refueling Stops [heaps || ? o-1 kanpsack bags]
- 899 Orderly Queue [math and bubble sort || ? bfs tle]
- 1353 Maximum Number of Events That Can Be Attended [sort(by ending time) + greedy | bst+bs(?)]
- 1354 Construct Target Array With Multiple Sums [module, reverse or backtrack + maxheap]
- 3 Longest Substring Without Repeating Characters [two pointer + hashmap(while loop)]
- 159 Longest Substring with At Most Two Distinct Characters [two pointer + hashmap(for + while)]
- 340 Longest Substring with At Most K Distinct Characters [same as 159]
- 395 Longest Substring with At Least K Repeating Characters [divide and conquer(time?) | 2nd solution?]
- 953 Verifying an Alien Dictionary [logic and corner case | pre for Alein dictionary]
- 53 maximum subarray [greedy [O(n)] | divide and conquer ? how and time]
- 122 Best Time to Buy and Sell Stock II [greedy + math(what is the minimal profit:MaxNum-MinNum)]
- 678 Valid Parenthesis String [low and high two pointer to indicate the min and max left open bracket][or using recursion]
- 468 Validate IP Address [regex | mix with regex, if else, for]
- 829 Consecutive Numbers Sum [math problem (kx = ), | citadel OA 2020 ]
### To do list
- 755 Pour Water [related to trapping rain water]
- alein dictionary [Topological sort: find cycle in graph | dfs backtrack?]
- 289 game of life [in place array]
- summary in [3,159,340,395]
- divide and conquer [53]
- 1163 Last Substring in Lexicographical Order: really make me upset
- 1396 Design Underground System 【10/8/2020】

## Amaazon interview
- trapping rain water
- 159 Longest Substring with At Most Two Distinct Characters (my interview 3/19) (round 1)
- swap nodes in pairs (my interview 3/20) (round 4)
- next challenges related to this problem[1249. Minimum Remove to Make Valid Parentheses]

## Citadel 
- Intern OA (3/7/2021)
  - Triplets: 259. 3Sum Smaller (long need to convert sum to long or using a + b < sum -c)
  - inversions: [5,4,3,2,1] cout how many inversion subsequence such than a[i]>a[j]>a[k] when i < j < k;
    - using merge sort [https://leetcode.com/discuss/interview-question/661336/google-onsite-count-increasing-subsequences/646088]
    - same as countTriplets

## Problem Collections
- 单调栈
- jump game collections [array greedy
- 连续数组之和 prefix sum    (a%K+K)%K  [523、525、560、974] [724, 713]

## Tron inteerview
### Onsite
- 200 number of island (Feb 2020)
## Always remember: no md, no accepted
- when you do not want write the md, that equals you solve nothing.
- However you are familiar with the problem, time will make you weak.
