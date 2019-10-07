public int maxTriple(int[] nums) {
  int test = 0;
  if (nums[0] > test){
    test = nums[0];
  }
  if (nums[nums.length/2] > test){
    test = nums [nums.length/2];
  }
  if (nums[nums.length -1] > test){
    test = nums[nums.length -1];
  }
  return test;
}