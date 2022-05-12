package exception_handling;

import java.io.File;
import java.io.FileInputStream;
public class ToFindNumOfWords {
   public static void main(String args[]) throws Exception{

      int count =0;
      File file = new File("E://test.txt ");
      FileInputStream f = new FileInputStream(file);
      byte[] bytesArray = new byte[(int)file.length()];
      f.read(bytesArray);
      String s = new String(bytesArray);
      String [] data = s.split(" ");
      for (int i=0; i<data.length; i++) {
         count++;
      }
      System.out.println("Number of characters in the given file are " +count);
   }
}