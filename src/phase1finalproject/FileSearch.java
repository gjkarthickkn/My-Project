package phase1finalproject;
import java.io.*;

public class FileSearch { 
   public static void main(String[] args) {
      File dir = new File("E:\\\\phase_1\\\\project");
      FilenameFilter filter = new FilenameFilter() {
         public boolean accept (File dir, String name) { 
            return name.startsWith("a");
         } 
      }; 
      String[] children = dir.list(filter);
      if (children == null) {
         System.out.println("Either dir does not exist or is not a directory"); 
      } else { 
         for (int i = 0; i< children.length; i++) {
            String filename = children[i];
            System.out.println(filename);
         } 
      } 
   } 
}