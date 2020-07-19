## Summary of Binary Search

### Psuode code template
- find the mimimal number to let g(m) return true
- Time: O(log(r-l)) * O(f(m) + g(m))
- Space O(1)
```java
//[l, r) look out for the overflow in r
//why here can use r exclusive, what if using r inclusive??
// g(m): 
// f(m): 
def binary_search(l, r):
  while(l < r):
    m = l + (r-l)/2
    if f(m): return m # optional
    if g(m):
      r = m; #new range[l, m)
    else 
      l = m+1; new wrnage[m+1, r)
  return l # or not found    in any case: l==r and break the while loop if not returning early
```
### Note
- after break the while loop only when l=r and will return l, if l is not in the range of arr, return something else

### Lower bound and upper bound
- Lower bound: first index of i, such that A[i]>=x 
- Upper bound: first index of i, wuch that A[i]>x
- Lower bound A[i] >= target
  - if there is no element greater or equal to target, then return n (the index of ele after last ele)
  - good example: 1 2 3 4 5 target: -1, 3, 7
- Upper bound A[i] > target

### Example
- LeetCode 69. Sqrt(x): 找到一个值>sqrt(x) , 然后值-1就是结果， g(m) = m^2-x>0
- LeetCode 704. Binary Search
- LeetCode 875. Koko Eating Bananas
- LeetCode 378. Kth Smallest Element in a Sorted Matrix
- 1095 Find in Mountain Array (bs 3 times)

### Reference
- https://github.com/labuladong/fucking-algorithm/blob/master/%E7%AE%97%E6%B3%95%E6%80%9D%E7%BB%B4%E7%B3%BB%E5%88%97/%E4%BA%8C%E5%88%86%E6%9F%A5%E6%89%BE%E8%AF%A6%E8%A7%A3.md
- https://zxi.mytechroad.com/blog/algorithms/binary-search/sp5-binary-search/
- know the boundary and the condition
