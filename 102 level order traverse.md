## Solution
- bfs time : 时间复杂度：每个点进队出队各一次，故渐进时间复杂度为 O(n).
```
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        //层序遍历 bfs
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root==null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        // LinkedList<Integer> temp1 = new LinkedList<>();
        // temp1.add(root.val);
        // res.add(temp1);
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            LinkedList<Integer> temp = new LinkedList<>();
            //loop current level(each node9,20 next level 15,7)
            while(size>0){
                TreeNode cur = queue.poll();
                if(cur.left!=null){
                    queue.offer(cur.left);
                }
                if(cur.right!=null){
                    queue.offer(cur.right);
                }
                temp.add(cur.val);
                size--;
            }
            res.add(temp);
        }
        return res;
    }
}
```
