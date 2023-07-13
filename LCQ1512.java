class LCQ1512 {
    public int numIdenticalPairs(int[] nums) {
       
       Map<Integer, Integer> map = new HashMap();
       int res = 0;

       for(int num : nums){ //iterates through array, i < j already becuase its always after 
           if(map.containsKey(num)){
               res += map.get(num); //adds to counter if finds a good pair 
           }
           map.put(num, map.getOrDefault(num, 0) + 1); // increments value 
       }
       return res;
    }
}