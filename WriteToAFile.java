import java.io.FileWriter;
import java.io.IOException;

public class WriteToAFile {
 public static void main(String[] args){
  try {
   FileWriter myWriter = new FileWriter("NewDoc.txt");
   myWriter.write("Files in JavaMight be tricky, but it is fu enough!");
   myWriter.close();
   System.out.println("Successfully wrote to the file.");
  } catch (IOException e) {
    System.out.println("An Error occured.");
    e.printStackTrace();
  }
 }
}
