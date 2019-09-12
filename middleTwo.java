public String middleTwo(String str) {
  if (str.length() == 2) return str;
  int half = str.length()/2;
  return str.substring(half -1, half +1);
  
}