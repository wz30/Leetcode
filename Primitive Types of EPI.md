## Primitive Types

### Problem Set
- count the number of bits that are set to 1 in an integer
  - ```java
    public static short countBit(int x){
      short numBits = 0;
      while(x!=0){
        numBits += (x&1);
        x >>>= 1;
      }
      return numBits;
    }
    ```
-  
