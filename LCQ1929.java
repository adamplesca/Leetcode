//creates a new array with is twice the size of the old array, nums2 copies the values of nums which empties num2 making it able to be filled

class LCQ1929 {
    public int[] getConcatenation(int[] nums) {
       
        int[] nums2 = new int[nums.length * 2];

        for(int i = 0; i < nums.length; i++){
            nums2[i] = nums[i];
            nums2[i + nums.length] = nums[i];
            
        }
        return nums2;
    }
}