## Merge Sort

### Codes
```java
class Main {
  public static void mergeSort(int[] a, int n){
    if(n < 2){
      return;
    }
    int mid = n/2;
    int[] l = new int[mid];
    int[] r = new int[n-mid];
    //copy to l and return
    for(int i = 0; i<mid; i++) 
      l[i] = a[i];
    for(int i = mid;i<n; i++)
      r[i-mid] = a[i];
    mergeSort(l, mid);
    mergeSort(r, n-mid);
    merge(a, l, r, mid, n-mid);
  }
  public static void merge(int[] a, int[] l, int[] r, int left, int right){
    int i = 0, j = 0, k = 0;
    while(i<left && j<left){
      if(l[i]<=r[j]){
        a[k++] = l[i++];
      }else{
        a[k++] = r[j++];
      }
    }
    while(i<left){
      a[k++] = l[i++];
    }
    while(j<right){
      a[k++] = r[j++];
    }
  }
  public static void main(String[] args) {
    
    int[] actual = { 5, 1, 6, 2, 3, 4 };
    mergeSort(actual, actual.length);
    for(int i = 0; i<actual.length;i++){
      System.out.println(actual[i]);
    }

  }
}
```

### non recursive implementation
- https://stackoverflow.com/questions/21897184/using-stacks-for-a-non-recursive-mergesort
