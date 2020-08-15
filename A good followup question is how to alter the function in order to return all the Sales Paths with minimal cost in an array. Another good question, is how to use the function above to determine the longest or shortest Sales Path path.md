## Sales path from pramp
- given a tree(not necessay binary), find shortest path
- A good followup question is how to alter the function in order to return all the Sales Paths with minimal cost in an array. 
- Another good question, is how to use the function above to determine the longest or shortest Sales Path path.

- first follow-up (backtrack)
- tracking the path and add necessay path in to ressult list
```java
import java.io.*;
import java.util.*;

class Solution {
 
  static class Node {
      
    int cost;
    Node[] children;
    Node parent;

    Node(int cost) {
      this.cost = cost;
      children = null;
      parent = null;
    }
  }

  static class SalesPath {
    int minCost = Integer.MAX_VALUE;
    List<ArrayList<Integer>> getCheapestCost(Node rootNode) {
      List<ArrayList<Integer>> res = new ArrayList<>();
      List<Integer> path = new ArrayList<>();
      recurAndCal(res, path, rootNode);
      return res;
    }
    void recurAndCal(List<ArrayList<Integer>> res,List<Integer> path, Node node ){
      if(node==null) return ;
      if(node.children.length==0){
        //sum up all 
      }else{
        for(int i = 0; i<node.children.length; i++){
          path.add();
          recurAndCal(res, path, node.children[i])
          path.remove();
        }
      }
    }
  }
    
  /*********************************************
   * Driver program to test above method     *
   *********************************************/

  public static void main(String[] args) {

  }
}
```
