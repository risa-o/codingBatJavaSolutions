public boolean endsLy(String str) {
  if (str.length() <= 1) return false;
  if (str.substring(str.length()-2).equals("ly")) return true;
  return false;
}