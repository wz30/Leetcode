## File for reused function or algorithm

## Menu
- HasMap

-------------------------------------------------------------------------------
### HashMap
- create the hashmap 
```java
Map<Character, List<Integer>> map = new HashMap<>();
for(int i = 0; i<S.length(); i++){
    char a = S.charAt(i);
    if(map.containsKey(a)){
        map.get(a).add(i);
    }else{
        List<Integer> list = new ArrayList<>();
        list.add(i);
        map.put(a, list);
    }
}
```

- retreive the elemnt form hashmap
```java
for(Map.entry<String. List<Integer>> entry: map.entrySet()){
}
```

------------------------------------------------------------------------------
### binary search
- upper bound: A[i] > target, first i, if does not exist return list.size()
```java
int upper_bound(List<Integer> list, int target){
if(list==null) return 100;
int l = 0; int r = list.size();
while(l < r){
    int m = (r-l)/2+l;
    if(list.get(m) > target) r = m;
    else l = m+1;
}
return l;
}
```
