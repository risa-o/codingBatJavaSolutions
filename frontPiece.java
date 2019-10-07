public int[] frontPiece(int[] nums) {
  if (nums.length < 2) return nums;
  int[] tArray = new int [2];
  tArray[0] = nums [0];
  tArray[1] = nums [1];
  return tArray;
}
