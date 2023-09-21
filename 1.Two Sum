//hashMap approach
//time complexity:o(n)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mp=new HashMap<>();
        mp.put(nums[0],0);
        int len=nums.length;
        for(int i=1;i<len;i++)
        {
            if(mp.containsKey(target-nums[i]))
            {
                return new int[]{mp.get(target-nums[i]),i};
            }
            else
            {
                mp.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}
    
