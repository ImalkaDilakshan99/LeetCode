class Solution {
    public int[] twoSum(int[] nums, int target) {
        int x;
        int arr[] = new int[2];
        for(int i=0;i<=nums.length;i++){
            x = target - nums[i];
            for(int j=i+1;j<=nums.length-1;j++){
                if(nums[j] == x){
                    arr[0]=i;
                    arr[1]=j;
                    return arr;
                }
            }
            
        }return null;
    }
}