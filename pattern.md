# Overview
- categorized the problem  into the pattern
##  Pattern: Top ‘K’ Elements，前K个系列
- [x] Kth Largest Number in an Array (medium) (unorderes array)
- [x] 973. K Closest Points to Origin (same idea as last problem) (unordered arrray)
- [x] 658. Find K Closest Elements (Even the problem title looks similar to last two problems, the solutions are different sicne the array is sorted)(binary search + two pointers)
- [x] Top K frequent number (unordered array)
- [x] 692. Top K Frequent Words (same solution + java comparator[inside the heap, we want to swap the larger string to the top])
- [x] 703. Kth Largest Element in a Stream 

- question about Top K pattern, the problem usuallu assume the Top k elements are unqiue, how to handle the duplicate cases

## Pattern: sliding window (two pointers)
- In my exp, sliding window is using fixed window size,and when move the window, we always remove the left and add right.
- two pointers is more flexible since the size of window is uncertain. The size is decided by the requirment or auusmption. Longest subsreing with at most k distinct character is a good example.
- And they have two different templates
  - [x] 3. Longest Substring Without Repeating Characters
  - [x] 76 Minimum Window Substring 
  - [x] 239 Sliding Window Maximum    
  - [x] Longest Substring with At Most K Distinct Characters
  - [x] Sliding Window Median (relaetd to problem: find median in stream)
  - [x] Permutation in String
  - [x] Longest Repeating Character Replacement 
  - [x] Longest Substring with At Most Two Distinct Characters

## Pattern: two pointers, inlcuding k-sum
- k-sum, using hashmap or two pointers. Both solution needs sorted array. And for 3sum, 4 sum, we need to care about duplicate elements. We can either use hashset or check in the while loop(nums[i]==nums[i-1]).
  - [x] 3 sum
  - [x] 4 sum
  - [x] 2 sum
  
## Question
- how to override the hashet eqyail method to custmize my own.
## Reference
- master method to analyze the recursive funtion: (https://leetcode.com/explore/learn/card/recursion-ii/470/divide-and-conquer/2871/)
- patterns are from the (link)[https://bbs.cvmart.net/topics/1232]
