public int start1(int[] a, int[] b) {
  int total = 0;
  if (a.length != 0 && a[0] == 1){
    total += 1;
  }
  if (b.length != 0 && b[0] == 1){
    total += 1;
  }
  return total;
}