class FindSumPairs {
    private int[] nums1;
    private int[] nums2;
    private Map<Integer,Integer> temp;

    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        temp = new HashMap<>();
        for(int a : nums2){
            temp.put(a, temp.getOrDefault(a,0)+1);
        }
    }
    
    public void add(int index, int val) {
        temp.put(nums2[index], temp.get(nums2[index])-1);
        nums2[index] += val;
        temp.put(nums2[index], temp.getOrDefault(nums2[index],0)+1);
    }
    
    public int count(int tot) {
        int out = 0;
        for(int a : nums1){
            out += temp.getOrDefault(tot-a,0);
        }
        return out;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */
