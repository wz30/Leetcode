## Summary of Binary Search

### Psuode code template
- find the mimimal number to let g(m) return true
- Time: O(log(r-1) * f(m) *g(m))
- Space O(1)
```java
//[l, r) look out for the overflow in r
def binary_search(l, r):
  while(l < r):
    m = l + (r-l)/2
    if f(m): return m # optional
    if g(m):
      r = m; #new range[l, m)
    else 
      l = m+1; new wrnage[m=1, r)
  return l # or not found
```

### Lower bound and upper bound
- Lower bound A[i] >= target
  if there is no element greater or equal to target, then return n (the index of ele after last ele)
- Upper bound A[i] > target
