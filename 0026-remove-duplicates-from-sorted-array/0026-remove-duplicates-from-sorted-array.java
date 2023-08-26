class Solution {
    public int removeDuplicates(int[] nums) {
        int count=1,skip=1;
        for(int i=0;i<nums.length-skip;i++){
           if(nums[i]==nums[i+1]){
               skip++;
               for(int j=i+1;j<=nums.length-skip;j++)
                    nums[j]=nums[j+1];
                i--;
            }else{
               count++;
            }
        }
        return count;   
    }
}