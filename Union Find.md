## Summary of Union Find

### Different approach
- quick find
- quick union 

### Questions
- confusion about quick find and quick union, what does root represent?

### Pseudo Code
- Hua hua youtube, rank and Path compression
```java 
class UnionFindSet:
  func UnionFindSet(n):
    parents = [1..n]
    ranks = [0..0] (n zeros)
    
  func Find(x):
    if x!=parents[x]:
      parents[x] = Find(parents[x])
    return parents[x]
   
  func union(x, y):
    px, py = Find(x), Find(y)
    if ranks[px] > ranks[py]; parents[py] = px
    if ranks[py] > ranks[px]; parents[px] = py
    if ranks[px] == ranks[py]:
      parents[py] = px
      ranks[px]++

```



### optimization
- path compression
- Union by rank








### reference
- [princeton algorithm class](https://www.cs.princeton.edu/~rs/AlgsDS07/01UnionFind.pdf)
- Union Find by Hua Hua in [Youtube](https://www.youtube.com/watch?v=VJnUwsE4fWA&t=319s)
