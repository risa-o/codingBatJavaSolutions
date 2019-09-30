public int[] makeMiddle(int[] nums) {
  int[] answer = new int[2];
  answer[0] = nums[nums.length/2 -1];
  answer[1] = nums[nums.length/2];
  return answer;
}
