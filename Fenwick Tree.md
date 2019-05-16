## Fenwick Tree / Binary Indexed Tree

### Motivation
Query sum: 
- O(n) for each time. 
- If Using pre sum array(dp), time is O(1)
- If update the values, O(n) even using dp pre sum array.

### Visualization 
- [update the tree](https://visualgo.net/en/fenwicktree)
- query the sum is in youtube video

### Pesudo code
```java
class FenWickTree{
        int[] tree;
        FenWickTree(int n){
            tree = new int[n+1];//start from 1
        }
        void update(int i, int delta){
            //update the tree from i
            while(i < tree.length){
                tree[i] += delta;
                i += lowbit(i);
            }
            
        }
        int query(int i){
            int sum = 0;
            while(i>0){
                sum+=tree[i];
                i -= lowbit(x);
            }
        }
        int lowbit(x){
            return x & (-x);
        }
        
    }

```

### Reference
- [HuaHua Youtube Video](https://www.youtube.com/watch?v=WbafSgetDDk&t=18s)

