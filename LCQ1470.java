class LCQ1470 {
    public int[] shuffle(int[] nums, int n) {
        
        int[] temp = new int[nums.length]; // Initialize temp array with proper length
        n = nums.length / 2;

        for(int i = 0; i < n; i++){ // Iterate up to 'n' instead of 'nums.length'
            temp[2 * i] = nums[i]; // Assign nums[i] to even indexes of temp
            temp[2 * i + 1] = nums[i + n]; // Assign nums[i + n] to odd indexes of temp
        }
        return temp;
    }
}
