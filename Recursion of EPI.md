## Recusrion of EPI
- divide-and-conquer e.g.: merge sort and quicksort
- Divide-and-conquer is not synonymous with recursion. P282 in EPI
  - Reucrsion is more general
  
### Problem set
- GCD(greatest common divisor) using Euclidean algorithm.
  - y-x or y mod x (x > y)
  - ```java
    public static long GCD(long x, long y) {return y==0 ? x : GCD(u, x%y);}
    ```java
- Hanoi problem
  - print the sequence of operations
  
