import java.util.HashMap;
import java.util.Map;

/*
 * 1.two sum
 * author: Wei
 * Time: 2017/5/3
 * Solution: dt: hashTable containsKey, key:numbers[] value:the order:1,2,3
 * space: time:
 */

public class Solution1 {
	public static int[] twoSum(int[] numbers, int target) {
		int result[] = new int[2];
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<numbers.length;i++){
			if(map.containsKey(target-numbers[i])){
				result[1]=i;
				result[0]=map.get(target-numbers[i]);	
			}
			map.put(numbers[i], i);
		}
		return result;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[]={2,7,11,15};
		int result[]={};
		int target=9;
		result=twoSum(numbers,target);
		System.out.println(result[0]+"  "+result[1]);
	}
}
