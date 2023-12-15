class LCM {
 static int gcd(int a, int b){
  if (a==0){
   return b;
  } else if (b==0) {
   return a;
  } else if (a>b) {
   return gcd(a - b,b);
  } else {
   return gcd(a, b - a);
  }
 }

 static int lcm(int a ,int b){
  return a* b/ gcd(a,b);
 }

public static void main(String[] args) {
 int a = 10, b = 6;

 System.out.println("Least common multiple is : "+ lcm(a,b));
}
}
