## Permutation

### Solution 
```java
import java.util.ArrayList;
import java.util.List;

public class uberInterview {
    static List<String> res;
    static int[] arr;

    public static void main(String[] args) {
        int n = 2;
        res = new ArrayList<>();
        List<String> list = new ArrayList<>();
        arr = new int[2 * n];
        //p1d1p2d2
        //2*n
        for (int i = 0; i < n; i++) {
            list.add("p" + i);
            list.add("d" + i);
        }
        //
        recur(list, arr, 2 * n, "");
        System.out.println("res.size()");
        System.out.println(res.size());
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }

    }

    static void recur(List<String> list, int[] arr, int len, String curString) {
        if (curString.length() == 2* len) {

            String tempString = curString;
            res.add(tempString);
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            if(i==0){
                if(arr[i]==0){
                    arr[i] = 1;
                recur(list, arr, len, curString + list.get(i));
                arr[i] = 0;
                }
            }//pi not visited and di is visited
            else if (arr[i-1] == 0 && list.get(i).charAt(0) == 'd') {

            } else if (arr[i] == 0) {
                arr[i] = 1;
                recur(list, arr, len, curString + list.get(i));
                arr[i] = 0;
            }
        }
    }
}
```
