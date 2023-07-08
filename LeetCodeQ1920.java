class LeetCodeQ1920 {
    //each num is assigned/ordered in the new array based of the value of the number in the index of the input array 
    public int[] buildArray(int[] nums) {
       
    
       int[] nums2 = new int[nums.length];

       for(int i = 0; i < nums.length; i++){
            nums2[i] = nums[nums[i]];
       }
       return nums2;      
    }
}


/* 0(1) space complex
class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            nums[i] += n * (nums[nums[i]] % n);
        }
        
        for (int i = 0; i < n; i++) {
            nums[i] /= n;
        }
        
        return nums;
    }
}
*/