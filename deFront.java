public String deFront(String str) {    
    if (str.substring(0,1).equals("a")){
    if (str.substring(1,2).equals("b")) return str;
    return str.charAt(0)+str.substring(2);
  }
  if (str.substring(1,2).equals("b")) return str.substring(1);
  return str.substring(2);
}