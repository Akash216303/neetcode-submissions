class Solution {
    public int[] getConcatenation(int[] nums) {
       
        int lenght=2*nums.length;
        int ans[]= new int[2*nums.length];

        for(int i=0; i<nums.length; i++){
            ans[i]= nums[i];
            ans[i+nums.length]= nums[i];
        }
        return ans;
        
    }
}