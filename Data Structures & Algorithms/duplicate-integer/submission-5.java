class Solution {
    public boolean hasDuplicate(int[] nums) {
        /*Set<Integer> set1 = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        if (nums.length > set1.size()){
            return true;
        }
        else{
            return false;
        }*/

        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums){
            if(!seen.add(num)){
                return true;
            }

        } 
        return false;
    }
}