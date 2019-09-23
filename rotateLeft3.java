public int[] rotateLeft3(int[] nums) {
  int [] turned = new int [3];
  turned [0] = nums[1];
  turned [1] = nums[2];
  turned[2] = nums[0];
  return turned;
  
}