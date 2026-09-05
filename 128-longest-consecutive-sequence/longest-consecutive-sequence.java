class Solution {
    public int longestConsecutive(int[] nums) {
        int maxlength = 0;
        HashSet<Integer>set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        
        for(int x: set){
           
            if(!set.contains(x-1)){
                int currentnum = x;
                int currentlength = 1;
            
            while(set.contains(currentnum+1)){
                currentnum++;
                currentlength++;
            }
            
            maxlength=Math.max(currentlength,maxlength);
            }
        }
        return maxlength;
    }
  
}