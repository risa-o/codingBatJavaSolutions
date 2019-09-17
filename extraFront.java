public String extraFront(String str) {
  if (str.length() < 3) return str + str + str;
  return str.substring(0,2) + str.substring(0,2) + str.substring(0,2);
}