```
public static String featuredProduct(List<String> products) {
    // Write your code here
        Map<String, Integer> counts = new HashMap<>();
        for(String str : products){
            counts.put(str, counts.getOrDefault(str, 0)+1);
        }
        List<String> strs = new ArrayList<>(counts.keySet());  
        Collections.sort(strs, (a, b) -> counts.get(b).equals(counts.get(a)) ? b.compareTo(a) : counts.get(b).compareTo(counts.get(a)));
        
        return strs.get(0);
    }
```
