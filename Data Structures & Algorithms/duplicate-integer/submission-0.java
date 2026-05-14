class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set1 = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        if (nums.length > set1.size()){
            return true;
        }
        else{
            return false;
        }
    }
}