class dec2bin {  
  public static void main(String args[]) { 
  int inp = 2141591;
  long out=0;
  int bit=0;
  for(int i = 10; i>0;i--){
    inp /= 2;
    bit = inp;
    bit = bit % 2;
    bit*=Math.pow(10,i-1);
    out+=bit;
  }
  System.out.println(out); 
  } 
}