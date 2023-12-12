public class ThreadsClass extends Thread {
 public static void main(String[] args){
  ThreadsClass thread = new ThreadsClass();
  thread.start();
  System.out.println("This code is outside of the thread");
 }
 public void run() {
  System.out.println("This code is running in a thread");
 }
}
