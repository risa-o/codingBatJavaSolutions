public int[] swapEnds(int[] nums) {
  int firstnum = nums [0];
  int lastnum = nums[nums.length -1];
  nums [0] = lastnum;
  nums[nums.length -1] = firstnum;
  return nums;
}
