class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums ){
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
                
        // Step 2: convert keys to list
        List<Integer> result = count.entrySet()
                .stream()
                .sorted((a, b) -> Long.compare(b.getValue(), a.getValue()))
                .limit(k)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        // Step 3: convert List<Integer> -> int[]
        return result.stream().mapToInt(i -> i).toArray();
    }
}
