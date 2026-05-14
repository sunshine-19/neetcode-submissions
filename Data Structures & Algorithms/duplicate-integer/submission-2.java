class Solution {
    public boolean hasDuplicate(int[] nums) {
        /*Set<Integer> set1 = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        if (nums.length > set1.size()){
            return true;
        }
        else{
            return false;
        }*/

        HashMap<Integer, Integer> seen = new HashMap<>();
        for (int i=0; i<nums.length;i++){
            if(seen.containsKey(nums[i])){
                return true;
            }
            else{
                seen.put(nums[i],i);
            }
        }
        return false;

    }
}