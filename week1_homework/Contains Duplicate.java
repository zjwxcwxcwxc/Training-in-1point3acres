public class Solution {
    public boolean containsDuplicate(int[] nums) {
        int len = nums.length;
		for (int i = 0; i < len; i++){
			for (int j = i + 1; j < len; j++)
				if (nums[j] == nums[i])
					return true;
		}
		return false;
    }
	
}
