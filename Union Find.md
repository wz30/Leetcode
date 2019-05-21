## Summary of Union Find

### Different approach
- quick find
```java
public class QuickFind
{
  private int[] id;
  
  //
  public QuickFind(int N)
  {
    id = new int[N];
    for(int i = 0; i<N; i++)
      id[i] = i;
  }
  
  public boolean find(int i, int j)
  {
    return id[p]==id[q];
  }
  
  //make tree flat and trees are only two layers
  public void unite(int p, int q)
  {
    int pid = id[p];
    for (int i=0; i<id.length; i++)
      if(id[i]==pid) id[i] = id[q];
  }
}
```
![](images/quick-find.png)

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
