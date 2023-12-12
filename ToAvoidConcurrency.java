public class ToAvoidConcurrency extends Thread {
 public static int amount = 0;
 
 public static void main(String[] args) {
  ToAvoidConcurrency thread = new ToAvoidConcurrency();
  thread.start();

  while(thread.isAlive()) {
   System.out.println("Waiting....");
  }

  System.out.println("Original " + amount);
  amount++;
  System.out.println("Original ++ " + amount);
 }

 public void run() {
  amount++;
 }
}
