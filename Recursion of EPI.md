## Recusrion of EPI
- divide-and-conquer e.g.: merge sort and quicksort
- Divide-and-conquer is not synonymous with recursion. P282 in EPI
  - Reucrsion is more general
  
### Problem set
- GCD(greatest common divisor) using Euclidean algorithm.
  - y-x or y mod x (x > y)
  - ```java
    public static long GCD(long x, long y) {return y==0 ? x : GCD(u, x%y);}
    ```
- Hanoi problem
  - print the sequence of operations
  - ```java
    private static final int NUM_PEGS = 3;
    public static void computeTowerHanoi(int numRings){
      List<Deque<Integer>> pegs = new ArrayList<>(); //deque is double-ended queue
      for(int i = 0; i<NUM_PEGS; i++){
        pegs.add(new LinkedList<Integer>());
      }
      //initialize first pegs // n, n-1 .. 1
      for(int i = numRings; i>=1; --i){
        pegs.get(0).addFirst(i);
      }
      computeHanoiSteps(numRings, pegs, 0, 1, 2);
    }
    //p1, p2, p3
    private static void computeTowerHanoiStep(int numRingsToMove, List<Deque<Integer>> pegs, int fromPeg, int toPeg, int usePeg){
      if(numRingsToMove > 0) {
        //move top n-1 from p1 to p3
        computeTowerHanoiStep(numRingsToMove-1, pegs, fromPeg, usePeg, toPeg);
        //move last or largest one from p1 to p2
        pegs.get(toPeg).add(pegs.get(fromPeg).removeFirst());
        System.out.println("Move from Peg " + fromPeg +" to Peg" +toPeg);
        computeTowerHanoiStep(numRingsToMove-1, pegs, usePeg, toPeg, fromPeg);
      }
    }
     ```
