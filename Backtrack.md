## backtrack problem
- 39 combination sum, combination sum (2)
- below is the framework to write backtrack then modify based on different assumption
```java
class Solution {
    //for each position(two) set number
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    //boolean[] visited ;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        //visited = new boolean[n+1];
        back(0, target, new ArrayList<Integer>(), candidates,0);
        return res;
    }
     void back(int sum, int target, List<Integer> list,int[] candidates, int pre ){
        if(sum==target){
            List<Integer> temp = new ArrayList(list);
            res.add(temp);
            return;
        }else if(sum>target) return;
         
        for(int i = pre; i<candidates.length; i++){
            //if(!visited[i]){
                list.add(candidates[i]);
                //visited[i] = true;
                back(sum+candidates[i], target, list, candidates,i);
                //visited[i] = false;
                list.remove(list.size()-1);
            //}
        }
    }
}

```

- 39 combination sum: no duplicates in set, number from set can be used many times, no duplicate solution (1,2,5) (2,1,5) are the same
  - i = pre
- combinatin sum 2: dupllicate set in set, number only once, no duplicate result
  - sort array first and then i = pre+1
