import java.io.File;

public class FolderDelete00 {
 public static void main(String[] args){
  File myObj = new File("C:\\Users\\saura\\Desktop\\JAVA\\code to upload\\test");
  if (myObj.delete()) {
   System.out.println("Delete the folder: "+ myObj.getName());
  } else {
   System.out.println("Fail To Delete the folder.");
  }
 }
}
