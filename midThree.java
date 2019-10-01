public int[] midThree(int[] nums) {
  int [] test = new int [3];
  test[0] = nums[nums.length/2 -1];
  test[1] = nums[nums.length/2];
  test[2] = nums[nums.length/2 +1];
  return test;
  
}