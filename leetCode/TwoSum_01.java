package leetCode;

class TwoSum_01 {
    public int[] twoSum(int[] nums, int target) {
        int[] saveNums = new int[2];
        boolean out = false;

        for (int i = 0; i <= nums.length - 1; i++) {

            for (int j = 1; j <= nums.length-1; j++) {
                if(i == j ){
                    break;
                }
                if ( (nums[i] + nums[j]) == target ) {
                    out= true;
                    saveNums[0] = i;
                    saveNums[1] = j;
                    break;
                }
            }
            if(out){
                break;
            }
        }

        return saveNums;
    }
}