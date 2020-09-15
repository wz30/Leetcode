## Interview with Karat
- meeting room
```java
import java.io.*;
import java.util.*;

/*
We are writing a tool to help users manage their calendars. Given an unordered list of times of day when people are busy, write a function that tells us the intervals during the day when ALL of them are available.

Each time is expressed as an integer using 24-hour notation, such as 1200 (12:00), 1530 (15:30), or 800 (8:00).

Sample input:

p1_meetings = [
  (1230, 1300),
  ( 845, 900),
  (1300, 1500),
]

p2_meetings = [
  ( 0, 844),
  ( 930, 1200),
  (1515, 1546),
  (1600, 2400),
]

p3_meetings = [
  ( 845, 915),
  (1515, 1545),
  (1235, 1245),
]

schedules1 = [p1_meetings, p2_meetings, p3_meetings]
schedules2 = [p1_meetings, p3_meetings]

Expected output:

findAvailableTimes(schedules1)
 => [  844,  845 ],
    [  915,  930 ],
    [ 1200, 1230 ],
    [ 1500, 1515 ],
    [ 1546, 1600 ]

findAvailableTimes(schedules2)
 => [    0,  845 ],
    [  915, 1230 ],
    [ 1500, 1515 ],
    [ 1545, 2400 ]

n = number of meetings
m = number of schedules

*/

public class Solution {
  static boolean isAvailable(int[][] meetings, int start, int end){
    //corner case: 
    for(int[] meeting : meetings){
      //check not Available
      //meeting[0] meeintg[1]
      if(start<meeting[1] && end > meeting[0]){
        return false;
      }
    }
    
    return true;
  }
  
  static List<int[]> findAvailableTimes(List<int[][]> schedules){
    //merge all the time together regradless of people.
    List<int[]> times = new ArrayList<>();
    for(int[][] schedule : schedules){
      for(int[] ele : schedule){
        times.add(ele);
      }
    }
    //sort base on the start time
    Collections.sort(times, (a,b)->(a[0]-b[0]));
    //figure out mergeing intervals
    List<int[]> temp = new ArrayList<>();
    int[] curMeeting = times.get(0);
    for(int[] time : times){
      if(curMeeting[1]>=time[0]){
        //merge
        curMeeting[1] = Math.max(curMeeting[1], time[1]);
      }else{
        temp.add(curMeeting);
        curMeeting = time;
      }
    }
    temp.add(curMeeting);
    //negation on it
    List<int[]> res = new ArrayList<>();
    int start = 0;
    for(int i = 0; i<temp.size(); i++){
      //800 1000
      if(temp.get(i)[0]>start){
        res.add(new int[]{start, temp.get(i)[0]});
      }
      start = temp.get(i)[1];
    }
    //800 1000  [1000, 2400]
    if(start < 2400){
       res.add(new int[]{start, 2400});
    }
    
    return res;
  }
  public static void main(String[] argv) {
    int[][] meetings = {
      {1230, 1300},
      { 845,  900},
      {1300, 1500},
    };
//     System.out.println(isAvailable(meetings, 915, 1215));
//     System.out.println(isAvailable(meetings, 900, 1230));
//     System.out.println(isAvailable(meetings, 850, 1240));
//     System.out.println(isAvailable(meetings, 1200, 1300));
//     System.out.println(isAvailable(meetings, 700, 1600));
//     System.out.println(isAvailable(meetings, 800, 845));
//     System.out.println(isAvailable(meetings, 1500, 1800));
//     System.out.println(isAvailable(meetings, 845, 859));
//     System.out.println(isAvailable(meetings, 845, 859));
//     System.out.println(isAvailable(meetings, 846, 900));
//     System.out.println(isAvailable(meetings, 2359, 2400));
//     System.out.println(isAvailable(meetings, 930, 1600));
//     System.out.println(isAvailable(meetings, 800, 850));
//     System.out.println(isAvailable(meetings, 1400, 1600));  //=> false;
//     System.out.println(isAvailable(meetings, 1300, 1501));  //=> false;

    int[][] p1Meetings = {
      {1230, 1300},
      { 845,  900},
      {1300, 1500}
    };
    int[][] p2Meetings = {
      { 0, 844},
      { 930, 1200},
      {1515, 1546},
      {1600, 2400}
    };
    int[][] p3Meetings = {
      { 845,  915},
      {1515, 1545},
      {1235, 1245}
    };
  
    List<int[][]> schedules1 = Arrays.asList(p1Meetings, p2Meetings, p3Meetings);
    List<int[][]> schedules2 = Arrays.asList(p1Meetings, p3Meetings);
    List<int[]> res = findAvailableTimes(schedules1);
    for(int[] ele : res){
      System.out.println(ele[0] + ": "+ele[1]);
    }
    System.out.println();
    res = findAvailableTimes(schedules2);
    for(int[] ele : res){
      System.out.println(ele[0] + ": "+ele[1]);
    }
  }
}

```
