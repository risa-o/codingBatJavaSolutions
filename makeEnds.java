public int[] makeEnds(int[] nums) {
  int[] ends = new int [2];
  ends[0] = nums[0];
  ends[1] = nums[nums.length -1];
  return ends;
}