package leetcode;

import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,7,11,15};//[2,7,11,15], target = 9
		int target = 9;
		
		int[] output = twoSum(nums, target);
		
		System.out.println(Arrays.toString(output));

	}

	public static int[] twoSum(int[] nums, int target){
		int [] result = new int[2];
		for(int i = 0; i < nums.length - 1; i++) {
			for(int j = i+1; j < nums.length; j++) {
				if(nums[i] + nums[j] == target) {
					result[0] = nums[i];
					result[1] = nums[j];
					
				}
						
		}
		
		
		}
		return result;
	}
}
