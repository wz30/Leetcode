## 911 Online eclection
In an election, the i-th vote was cast for persons[i] at time times[i].

Now, we would like to implement the following query function: TopVotedCandidate.q(int t) will return the number of the person that was leading the election at time t.  

Votes cast at time t will count towards our query.  In the case of a tie, the most recent vote (among tied candidates) wins.

 

Example 1:

Input: ["TopVotedCandidate","q","q","q","q","q","q"], [[[0,1,1,0,0,1,0],[0,5,10,15,20,25,30]],[3],[12],[25],[15],[24],[8]]
Output: [null,0,1,1,0,0,1]
Explanation: 
At time 3, the votes are [0], and 0 is leading.
At time 12, the votes are [0,1,1], and 1 is leading.
At time 25, the votes are [0,1,1,0,0,1], and 1 is leading (as ties go to the most recent vote.)
This continues for 3 more queries at time 15, 24, and 8.

 

Note:

    1 <= persons.length = times.length <= 5000
    0 <= persons[i] <= persons.length
    times is a strictly increasing array with all elements in [0, 10^9].
    TopVotedCandidate.q is called at most 10000 times per test case.
    TopVotedCandidate.q(int t) is always called with t >= times[0].


### Explanation
- I got TLE, since q is called 5000 times 10000, my time is 10000 * 5000, whcih is not efficient. The reason my q is O(n) is not because of search function, but how to get person.
- Using precomputed array to track the max frequency of person in a specific range

### Solution 1: precomuted array + binary search
--how to precompute: usng map(track frequency of each voters) and ans
```java
class TopVotedCandidate {
    int[] map = new int[5005];
    int[] ans = new int[5005]; //max persons id
    int[] persons;
    int[] times;
    public TopVotedCandidate(int[] persons, int[] times) {
        this.persons = persons;
        this.times = times;
        
        //update the precompute array
        //global varibale to upadate the max and person
        int max = 0;
        int person = 0;
        for(int i = 0; i<persons.length; i++){
            
            if(i==0){
                map[persons[i]]++;
                if(max <= map[persons[i]]){
                    max = map[persons[i]];
                    person = persons[i];
                    ans[i] = persons[i];
                }
                continue;
            }
            
            map[persons[i]]++;
            if(max <= map[persons[i]]){
                max = map[persons[i]];
                person = persons[i];
                ans[i] = persons[i];
            }else{
                ans[i] = person;
            }
        }
        // for(int i = 0; i<persons.length; i++){
        //     System.out.print(ans[i]+" ");
        // }
    }
    
    public int q(int t) {
       
            int index = upper_bound(times, t);
           
            //System.out.println("index"+index);
        
            return ans[index-1];
        
    }
    int upper_bound(int[] list, int target){
        int l = 0; int r = list.length;
        while(l < r){
            int m = (r-l)/2+l;
            if(list[m] > target) r = m;
            else l = m+1;
        }
        return l;
    }
}

/**
 * Your TopVotedCandidate object will be instantiated and called as such:
 * TopVotedCandidate obj = new TopVotedCandidate(persons, times);
 * int param_1 = obj.q(t);
 */
```
