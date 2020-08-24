## Cycle in graph
## please refer to princeton code cycle[https://algs4.cs.princeton.edu/41graph/Cycle.java.html] and directed cycle(https://algs4.cs.princeton.edu/42digraph/DirectedCycle.java.html)
### Cycle in undirected graph
- dfs with check back edge[under current vertex v1, v1 has adjacent vertext:v2 and v3, And then visit v2 , it has v1 and v4, so from v2->v1 is back edge and it is safe]
  - so we check vertex and parent, if they are eqaul, safe, otherwise, check if visited or not.
  - if (vertex==parent)
  - https://www.geeksforgeeks.org/detect-cycle-undirected-graph/
  
### Cycle in directed grpah
- dfs with different flags status
  - -1: visited by other nodes(dfs), return false(no cycle)
  - 1: visited again by current dfs, return true
```java
  def dfs(i, adjacencies, flags):
      if(flags[i]==-1) return false;
      if(flags[i]==1) return true;
      flags[i] = 1;
      for(j in adjacenies[i]):
          if(not dfs(j, adjacenies, flags)) return false
      flags[i] = -1
  return true  
```
  - https://leetcode-cn.com/problems/course-schedule/solution/course-schedule-tuo-bu-pai-xu-bfsdfsliang-chong-fa/


### Number of cycles in undirected graph
```java
print out all the cycles
https://www.geeksforgeeks.org/print-all-the-cycles-in-an-undirected-graph/
```
