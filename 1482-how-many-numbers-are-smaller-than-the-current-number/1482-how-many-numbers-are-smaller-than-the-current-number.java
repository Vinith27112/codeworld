class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int arr[]=new int[nums.length];
        for(int i=0; i<arr.length; i++){
            int count = 0;
            for(int j=0; j<arr.length; j++){
                if(nums[i]> nums[j]){
                    count++;
                }   
            }arr[i]=count;
            
            

        }return arr;
  }
        
    
}