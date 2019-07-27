## Subset
- get target from array
### solution
```python
def subset(arr,target,partial=[], cur_sum=0){
    if(cur_sum==target) yield partial
    if cur_sum>=target return;
    for i, n in arr:
      remaing = arr[i+1:] 
      yield subset(remaing, target+n, partial+[n], cur_sum+n);
}
```
