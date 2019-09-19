## Space for recursion
```
int f(int n) {
  if (n <= 1) {
    return 1;
  }
  return f(n - 1) + f(n - 2);
} 
```

### Solution
- space complexity of recursive algorithm is proportinal to maximum depth of recursion tree generated. If each function call of recursive algorithm takes O(m) space and if the maximum depth of recursion tree is 'n' then space complexity of recursive algorithm would be O(nm).
```java
in this case, it is O(n)
```


### Reference
- https://www.ideserve.co.in/learn/time-and-space-complexity-of-recursive-algorithms
