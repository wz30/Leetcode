### Topological sorting and cycle in directed graph


### Solution 
- bfs and dfs in O(V+E)
- dfs: similar to regular dfs, except we need to print out the node or vertex lastly: only when we reach out all the nodes.
  - have couple component: graph[i][i] indicates that.
- bfs: remove the vertex with 0 indegree and reduce connected vertex's in degree and maintian the queue. (chinese blog is really clear)
  - we can use bfs to check if there is cycle in DG by simply keep the counter.
  - do not need to worry about only 1 case: 
```java
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * using adj array to present array
 * topological sort only appears in directed acyclic graph(DAG) and used for sorting the tasks by their priority
 * reference: https://www.hackerearth.com/practice/algorithms/graphs/topological-sort/tutorial/
 * https://songlee24.github.io/2015/05/07/topological-sorting/
 */
public class Topolog {
    //dfs solution of topological sort
    static ArrayList<Integer> res;
    static int[] visited;

    public Topolog(int n) {
        res = new ArrayList<>();
        visited = new int[n];
    }

    //reduce the degree
    //and key point is to maintain a set of vertex which has 0 indegree
    private static List<Integer> bfs_top(int[][] graph, int N) {
        int[] inDegree = new int[N];
        for (int i = 0; i < graph.length; i++) {
            visited[i] = 0;
            inDegree[i] = 0;
        }
        List<Integer> T = new ArrayList<>();
        List<Integer> queue = new LinkedList<>();
        //initialzie the in degree
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (graph[i][j] == 1) {
                    inDegree[j]++;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            if (inDegree[i] == 0) {
                queue.add(i); //have all vertex with 0 in degrees
            }
        }
        //for point with 0: remove the such vertex
        int count = 0;
        while (!queue.isEmpty()) {
            Integer v = ((LinkedList<Integer>) queue).poll();
            T.add(v);
            ++count;
            for (int j = 0; j < N; j++) {
                if (graph[v][j] == 1 && inDegree[j] != 0) {
                    --inDegree[j];
                    if (inDegree[j] == 0) {
                        queue.add(j);
                    }
                }
            }

        }
        if (count < N) {
            System.out.println("There is a cycle");
        }
        return T;
    }

    //time: O(V+E) like regular dfs
    private void dfs_top(int curVertex, int[][] graph) {
        if (visited[curVertex] == 1) return;
        visited[curVertex] = 1;
        //dfs adjacent list
        for (int i = 0; i < graph.length; i++) {
            if (graph[curVertex][i] == 1 && visited[i] == 0)
                dfs_top(i, graph);
        }
        //nothing to visit, so it is the node has no child (contrast with regular dfs)
        res.add(0, curVertex);
    }

    public static void main(String[] args) {
        int[][] grpah = {{0, 1, 0, 1, 0, 0},
                {0, 0, 1, 1, 0, 0},
                {0, 0, 0, 1, 1, 1},
                {0, 0, 0, 0, 1, 1},
                {0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 0}};
//        int[][] grpah = {{0, 0, 0, 0, 0, 0},
//                {0, 0, 0, 0, 0, 0},
//                {0, 0, 0, 1, 0, 0},
//                {0, 1, 0, 0, 0, 0},
//                {1, 1, 0, 0, 0, 1},
//                {1, 0, 1, 0, 0, 0}};
//        int[][] grpah = {{0, 0, 0, 0, 0, 0},
//                {0, 0, 0, 0, 0, 0},
//                {0, 0, 0, 1, 0, 0},
//                {0, 1, 0, 0, 0, 0},
//                {1, 1, 0, 0, 0, 1},
//                {1, 0, 1, 0, 0, 0}};
        Topolog topolog = new Topolog(grpah.length);
        //check each point
        for (int i = 0; i < grpah.length; i++) {
            if (visited[i] == 0) {
                topolog.dfs_top(i, grpah);
            }
        }
        //res = ((ArrayList<Integer>) bfs_top(grpah, grpah.length));
        for (Integer i : res) {
            System.out.println(i);
        }
    }

}

```

### related leetcode problem
