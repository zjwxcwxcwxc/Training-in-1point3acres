public class Solution {


    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (k >= nums.length) return containsDuplicate(nums);
		else{
			int i = 0, j = k;
			for (i = 0; i < k; i++){
				for (j = i + 1; j <= k; j++)
					if (nums[j] == nums[i]) return true;
			}
			
			for (j = k + 1; j < nums.length; j++){				
				for (i = j - k; i < j; i++)
					if (nums[i] == nums[j]) return true;
			}
		}	
		return false;
    }
    
    public static boolean containsDuplicate(int[] nums) {

        int len = nums.length;
		for (int i = 0; i < len; i++){
			for (int j = i + 1; j < len; j++)
				if (nums[j] == nums[i])
					return true;
		}
		return false;

    }	
}
